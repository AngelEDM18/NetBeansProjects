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
        Query q = session.createQuery("from Customer as c where Customer_Id="+id);
        clientes = (List<Customer>) q.list();
        return clientes;
    }
    
    public List getVentas(String id, String store) {
        List<Rental> ventas;
        Query q = session.createQuery("from Rental as r where Customer_Id="+id);
        ventas = (List<Rental>) q.list();
        return ventas;
    }

    public List getTienda(String id) {
        List<Store> Stores;
        Query q = session.createQuery("from Store as s where Store_id="+id);
        Stores = (List<Store>) q.list();
        return Stores;
    }
}
