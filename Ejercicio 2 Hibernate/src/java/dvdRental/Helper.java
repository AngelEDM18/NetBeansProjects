/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdRental;

import java.util.List;
import java.util.Locale;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author alumno_2DAW
 */
public class Helper {

    Session session = null;

    public Helper() {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        this.session = sessionFactory.openSession();
        org.hibernate.Transaction tx = session.beginTransaction();
    }

    public List getTienda() {
        List<Store> Stores;
        Query q = session.createQuery("from Store as tienda");
        Stores = (List<Store>) q.list();
        return Stores;
    }
    
    public List getCategoria() {
        List<Category> Categorias;
        Query q = session.createQuery("from Category as category");
        Categorias = (List<Category>) q.list();
        return Categorias;
    }
    
    public List datosNegocio(String id) {
        List<Store> Stores;
        Query q = session.createQuery("from Store as tienda where store_id="+id);
        Stores = (List<Store>) q.list();
        return Stores;
    }
    
    public List datosEmpleado(String id) {
        List<Staff> empleados;
        Query q = session.createQuery("from Staff as empleados where store_id="+id);
        empleados = (List<Staff>) q.list();
        return empleados;
    }
    
    public List listaPeliculas (String idCategoria) {
        List<Film> peliculas;
        Query q = session.createQuery("select p from Film as p, FilmCategory as fc WHERE fc.film=p.filmId and fc.category="+idCategoria);
        peliculas = (List<Film>) q.list();
        return peliculas;
    }
    
    public List selectPelicula (String id) {
        List<Film> peliculas;
        Query q = session.createQuery("select p from Film as p WHERE p.filmId="+id);
        peliculas = (List<Film>) q.list();
        return peliculas;
    }
}
