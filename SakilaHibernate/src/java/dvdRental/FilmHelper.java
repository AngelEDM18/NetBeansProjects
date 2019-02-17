/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdRental;

import java.util.List;
import java.util.Locale.Category;
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

    public List getCategoria() {
        List<Category> Categorias;
        Query q = session.createQuery("from Category as category");
        Categorias = (List<Category>) q.list();
        return Categorias;
    }
    
    public List getPeliculas(int id) {
        List<Film> Peliculas;
        Query q = session.createQuery("select p from Film as p, FilmCategory as fc WHERE fc.film=p.filmId and fc.category="+id);
        Peliculas = (List<Film>) q.list();
        return Peliculas;
    }
}
