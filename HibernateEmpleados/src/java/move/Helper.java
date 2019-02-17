/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package move;

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

    public List<String> getPaises() {
        List<String> paises;
        Query q = session.createQuery("select distinct e.pais from Empleados e");
        paises = (List<String>) q.list();
        return paises;
    }

    public List<Empleados> getEmpleadosPais(String pais) {
        List<Empleados> emp;
        Query q = session.createQuery("from Empleados e where e.pais='" + pais + "'");
        emp = (List<Empleados>) q.list();
        return emp;
    }

    public List<String> getCiudades() {
        List<String> ciudades;
        Query q = session.createQuery("select distinct e.ciudad from Empleados e");
        ciudades = (List<String>) q.list();
        return ciudades;
    }

    public List<Empleados> getEmpleadosCiudad(String ciudad) {
        List<Empleados> emp;
        Query q = session.createQuery("from Empleados e where e.ciudad='" + ciudad + "'");
        emp = (List<Empleados>) q.list();
        return emp;
    }

    public List<Empleados> getEmpleadosYear(int year) {
        List<Empleados> emp;
        Query q = session.createQuery("from Empleados e where e.fechaContratacion like '" + year + "%'");
        emp = (List<Empleados>) q.list();
        return emp;
    }

    public List<Empleados> getMasJoven() {
        List<Empleados> emp;
        Query q = session.createQuery("from Empleados e order by fechaNacimiento desc");
        emp = (List<Empleados>) q.list();
        return emp;
    }

    public List<Empleados> getMasViejo() {
        List<Empleados> emp;
        Query q = session.createQuery("from Empleados e order by fechaNacimiento asc");
        emp = (List<Empleados>) q.list();
        return emp;
    }

    public List<Clientes> getClientes() {
        List<Clientes> cli;
        Query q = session.createQuery("from Clientes c");
        cli = (List<Clientes>) q.list();
        return cli;
    }

    public List<Pedidos> getPedidos(String cliente) {
        List<Pedidos> ped;
        Query q = session.createQuery("from Pedidos where idCliente='" + cliente + "'");
        ped = (List<Pedidos>) q.list();
        return ped;
    }

    public List<DetallePedido> getPedidosDetalle(String id) {
        List<DetallePedido> ped;
        Query q = session.createQuery("from DetallePedido where idPedido=" + id);
        ped = (List<DetallePedido>) q.list();
        return ped;
    }

    public String getProductos(int id) {
        String ped;
        Query q = session.createQuery("select p.nombreProducto from Productos p where p.idProducto="+id);
        ped = (String) q.uniqueResult();
        return ped;
    }
    
    public List<Pedidos> getPedidosIntervalo(String cliente, String desde, String hasta) {
        List<Pedidos> ped;
        Query q = session.createQuery("from Pedidos p where idCliente='"+cliente+"' and MONTH(p.fechaPedido) between "+desde+" and "+hasta);
        ped = (List<Pedidos>) q.list();
        return ped;
    }
    
    public String getNombreCliente(String cliente){
        String nombre;
        Query q = session.createQuery("select c.nombreContacto from Clientes c where idCliente='"+cliente+"'");
        nombre = (String) q.uniqueResult();
        return nombre;
    }
}
