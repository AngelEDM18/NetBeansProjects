/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdRental;

import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author alumno_2DAW
 */
public class FilmHelper {

    Session session = null;

    public FilmHelper() {
    
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        
        this.session = sessionFactory.openSession();
        
        org.hibernate.Transaction tx = session.beginTransaction();
    }
    
    public List <Store> getStore (){
    
        List <Store> tiendas;
        Query q = session.createQuery("from Store");
        tiendas = (List <Store>)q.list();
        return tiendas;
    }
    
   /* public List <Film> getPeliculas (int idCategoria){
        List <Film> Peliculas;
        Query q = session.createQuery("SELECT f FROM Film as f, FilmCategory as c WHERE f.filmId=c.film AND c.category="+idCategoria);
        Peliculas = (List <Film>) q.list();
        return Peliculas;
    }*/
    
    public List <Category> getCategoria (){
    
        List <Category> Categorias;
        Query q = session.createQuery("from Category");
        Categorias = (List <Category>)q.list();
        return Categorias;
    }
    
    public List <Store> getDatosNegocio (String idNegocio){
    
        List <Store> DatosNegocio;
        Query q = session.createQuery("from Store WHERE address_id="+idNegocio);
        DatosNegocio = (List <Store>)q.list();
        return DatosNegocio;
    }
    
    public List <Staff> getDatosEmpleado (String idNegocio){
    
        List <Staff> DatosEmpleado;
        Query q = session.createQuery("from Staff WHERE store_id="+idNegocio);
        DatosEmpleado = (List <Staff>)q.list();
        return DatosEmpleado;
    }
    
    public List <Film> getPeliculas (String idCategoria){
        List <Film> Peliculas;
        Query q = session.createQuery("SELECT f FROM Film as f, FilmCategory as c WHERE f.filmId=c.film AND c.category="+idCategoria);
        Peliculas = (List <Film>) q.list();
        return Peliculas;
    }
    
    public List <Film> getInfoPeliculas(String idPelicula){
        List <Film> Peliculas;
        //Query q = session.createQuery("SELECT f FROM Film as f, FilmCategory as c WHERE f.filmId=c.film AND c.category="+idCategoria);
        //Peliculas = (List <Film>) q.list();
        return null;
    
    }
}
