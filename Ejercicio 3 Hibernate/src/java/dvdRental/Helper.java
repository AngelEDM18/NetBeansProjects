/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdRental;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Angel
 */
public class Helper {

    Session session = null;

    public Helper() {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        this.session = sessionFactory.openSession();
        org.hibernate.Transaction tx = session.beginTransaction();
    }

    public List getTiendas() {
        List<Store> Stores;
        Query q = session.createQuery("from Store as s");
        Stores = (List<Store>) q.list();
        return Stores;
    }

    public List getClientes() {
        List<Customer> clientes;
        Query q = session.createQuery("from Customer as c");
        clientes = (List<Customer>) q.list();
        return clientes;
    }

    public List getCliente(String id) {
        List<Customer> clientes;
        Query q = session.createQuery("from Customer as c where Customer_Id=" + id);
        clientes = (List<Customer>) q.list();
        return clientes;
    }

    public List getTienda(String id) {
        List<Store> Stores;
        Query q = session.createQuery("from Store as s where Store_id=" + id);
        Stores = (List<Store>) q.list();
        return Stores;
    }

    public List<Rental> getListado1(String videoclub, String cliente, int tramo) {
        Query q = session.createQuery("from Rental as r where r.customer.customerId=" + cliente + " "
                + "and r.staff.store.storeId = " + videoclub).setFirstResult(tramo).setMaxResults(10);
        List<Rental> alquiler = (List<Rental>) q.list();
        return alquiler;
    }

    public List<Payment> getPago(String videoclub, String id) {
        List<Payment> Stores;
        Query q = session.createQuery("from Payment as p where p.customer.customerId=" + id + " and p.staff.store.storeId=" + videoclub);
        Stores = (List<Payment>) q.list();
        return Stores;
    }

    public long getTotalCliente(int videoClub, int idCliente) {

        Query q = session.createQuery("select sum(p.amount) from Payment as p where p.customer.customerId=" + idCliente + " and p.staff=" + videoClub);
        long totalc = (long) q.list().get(0);
        return totalc;
    }

    public List<Customer> getClientesVideoclub(int videoclub, int tramo) {

        List<Customer> clientes;
        Query q = session.createQuery("from Customer as c where c.store.storeId=" + videoclub).setFirstResult(tramo).setMaxResults(10);;
        clientes = (List<Customer>) q.list();
        return clientes;

    }

    public List<FilmActor> getActores(int idPelicula) {
        List<FilmActor> actores;
        Query q = session.createQuery("from FilmActor as f where f.film.filmId=" + idPelicula);
        actores = (List<FilmActor>) q.list();
        return actores;
    }

    public List<Film> getPeliculas() {
        List<Film> pelicula;
        Query q = session.createQuery("from Film as f");
        pelicula = (List<Film>) q.list();
        return pelicula;
    }

    public List<Inventory> consultaInventario(int id, int tramo) {
        List<Inventory> lista;

        Query q = session.createQuery("select distinct f.title from Inventory as i,Film as f,Store as s where i.film=f.filmId and i.store=s.storeId and i.store=" + id + "").setFirstResult(tramo).setMaxResults(10);
        lista = (List<Inventory>) q.list();

        return lista;
    }

    public short consultaPelisId(String title) {

        Query q = session.createQuery("select f.filmId from Film as f where f.title='" + title + "'");
        short lista = (short) q.list().get(0);

        return lista;
    }

    public List<Inventory> consultaVeces(int tienda, String peli) {
        List<Inventory> lista;

        Query q = session.createQuery("select count(r.inventory.film) from Rental r,Inventory i where r.inventory=i.inventoryId and i.store=r.staff and r.staff=" + tienda + " and i.film.title='" + peli + "'");
        lista = (List<Inventory>) q.list();

        return lista;
    }
}
