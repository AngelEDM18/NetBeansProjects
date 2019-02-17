/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayuda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;

/**
 *
 * @author Mode
 */
public class Ayudante {
    
    Session session= null;
        
    public Ayudante() {
        SessionFactory sessionFactory=NewHibernateUtil.getSessionFactory();
        this.session=sessionFactory.openSession();
        org.hibernate.Transaction tx=session.beginTransaction();
    }
    
        //Obtener videoclubs.
        public List<Store> getStores() {
            List<Store> Videoclubs;
            Query q=session.createQuery("from Store");
            Videoclubs= (List<Store>) q.list();
            return Videoclubs;
        }
        
        //Obtener lista de clientes.
        public List<Customer> getClientes() {
            List<Customer> clientes;
            Query q=session.createQuery("from Customer");
            clientes= (List<Customer>) q.list();
            return clientes;
        }
        
        //Total gastado por un cliente.
        public Long getTotal(String idvideoclub, String idcliente) {
            Long totalCliente;
            Query q=session.createQuery("select sum(P.amount) from Payment P where P.customer="+idcliente+" and P.staff in (select S.staffId from Staff S where S.store="+idvideoclub+")");
            totalCliente= (Long) q.uniqueResult();
            return totalCliente;
        }


        //Método que devuelve el número de películas alquiladas por un cliente.
        public Long numResultados(String idcliente,String idvideoclub) {
            Query q=session.createQuery("select count(F.title) from Film F where F.filmId in (select I.film from Inventory I where I.inventoryId in (select R.inventory from Rental R where R.customer="+idcliente+" and R.staff in (select Sto.staff from Store Sto where Sto.storeId="+idvideoclub+")))");
            Long numRegistros = (Long) q.uniqueResult();
            return numRegistros;
        }
        
        //Películas alquiladas por un cliente.
        public List<Film> peliculasAlquiladasCliente(String idcliente,String idvideoclub) {
            List<Film> peliculasCliente;
            Query q=session.createQuery("from Film F where F.filmId in (select I.film from Inventory I where I.inventoryId in (select R.inventory from Rental R where R.customer="+idcliente+" and R.staff in (select Sto.staff from Store Sto where Sto.storeId="+idvideoclub+")))");
            peliculasCliente= (List<Film>) q.list();
            return peliculasCliente;
        }
        
        //Nombre de un cliente.
        public String nombreCliente(String idcliente) {
            String nombre;
            Query q=session.createQuery("select concat(C.firstName,' ',C.lastName) from Customer C where C.customerId="+idcliente+"");
            nombre= (String) q.uniqueResult();
            return nombre;
        }
        
        //Total gastado de un cliente durante los meses elegidos.
        public Long totalClienteMes(String idcliente,String idvideoclub, String desde, String hasta) {
            Long total;
            Query q=session.createQuery("select sum(P.amount) from Payment P where P.customer="+idcliente+" and MONTH(P.paymentDate) between "+desde+" and "+hasta+" and P.staff in (select S.staffId from Staff S where S.store="+idvideoclub+")");
            total= (Long) q.uniqueResult();
            return total;
        }
        
        //Lista de películas.
        public List<Film> listadoPeliculas() {
            List<Film> listaPeliculas;
            Query q=session.createQuery("from Film");
            listaPeliculas= (List<Film>) q.list();
            return listaPeliculas;
        }
        
        //Dinero total gastado por los clientes de un videoclub.
        public List<Customer> clientesTotalGastado(String idvideoclub) {
        
        //Sacamos los IDS de los clientes de un videoclub.
        List<Customer> customers;
        Query hql=session.createQuery("from Customer C where C.store="+idvideoclub);
        customers=(List<Customer>) hql.list();
        
        //Lista donde almacenamos el nombre del cliente y el total.
        List<Customer> customers2=new ArrayList<Customer>();
        
        for (int i = 0; i < customers.size(); i++) {
            
            //Sacamos el nombre del cliente y el total.
            Query hql1=session.createQuery("select concat(C.firstName,' ',C.lastName) from Customer C where C.customerId="+customers.get(i).getCustomerId()+" and C.store="+idvideoclub+"");
            Query hql2=session.createQuery("select SUM(P.amount) from Payment P where P.customer.customerId="+customers.get(i).getCustomerId()+" and P.staff in (select Sto.staff from Store Sto where Sto.storeId="+idvideoclub+")");
            
            //Creamos el objeto y le asignamos los resultados.
            Customer nuevo=new Customer();
            String nombre=(String) hql1.uniqueResult();
            String losdinero=String.valueOf(hql2.uniqueResult());
            nuevo.setFirstName(nombre);
            nuevo.setEmail(losdinero);
            //Agregamos el objeto a la lista.
            customers2.add(nuevo);
            
        }
        
        return customers2;
        }
        
        //Lista de películas de un videoclub y número de veces alquilada.
        public List<AlquilaVeces> alquilaVeces(String idvideoclub){
            
            //Sacamos los IDS de las películas de un videoclub.
            List<Inventory> listaIds;
            Query q=session.createQuery("select distinct I.film.filmId from Inventory I where I.store="+idvideoclub+" order by I.film");
            listaIds= (List<Inventory>) q.list();
            
            //Lista donde almacenaremos el nombre de la película y el num de veces alquilada.
            List<AlquilaVeces> alquilaVeces=new ArrayList<AlquilaVeces>();
            
            for (int i = 0; i < listaIds.size(); i++) {
                //Sacamos el nombre y el num de veces alquilada.
                Query q2 = session.createQuery("select I.film.title from Inventory I where I.film="+listaIds.get(i)+" and  I.inventoryId in(select R.inventory from Rental R where R.rentalId in (select P.rental from Payment P where P.staff in ( select Sto.staff from Store Sto where Sto.storeId="+idvideoclub+"))) group by I.film");
                Query q3 = session.createQuery("select count(R.rentalId) from Rental R where R.inventory between (select min(I.inventoryId) from Inventory I where I.film="+listaIds.get(i)+") and (select max(I.inventoryId) from Inventory I where I.film="+listaIds.get(i)+") and R.staff.store="+idvideoclub);

            //Creamos el objeto y le asignamos el nombre y el número.
            AlquilaVeces nuevo=new AlquilaVeces();
            String nombre=(String) q2.uniqueResult();
            String numero=String.valueOf(q3.uniqueResult());
            nuevo.setNombre(nombre);
            nuevo.setNumero(numero);
            //Lo agregamos a la lista.
            alquilaVeces.add(nuevo);
            }
            
            return alquilaVeces;
        }
        
        //Ver actores de una película.
        public List<Actor> listaActores(String idpelicula){
            List<Actor> listaActores;
            Query q=session.createQuery("from Actor A where A.actorId in (select FA.actor from FilmActor FA where FA.film="+idpelicula+")");
            listaActores= (List<Actor>) q.list();
            return listaActores;
        }
        
        
        
        
        
                
}
