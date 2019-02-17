package controlador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import excepciones.CamposObligatoriosException;
import excepciones.isbnException;
import modelo.Libro;

public class LibrosController {
	
	private final static String drv="com.mysql.jdbc.Driver";
	private final static String db="jdbc:mysql://localhost:3306/biblioteca?useSSL=false";
	private final static String userAndPass="root";
	
	Connection cn;	//importamos la libreria java.sql
	Statement st; //para realizar las consultas, importamos igualmente de java.sql
	
	private ResultSet rs;//Es un puntero
	private List<Libro>libros;
	private PreparedStatement pst;
	
public LibrosController() throws SQLException, CamposObligatoriosException, isbnException, ClassNotFoundException {
	super();
	abrirConexion();
	libros=getConsultaLibros("select * from libros order by titulo");
}

public List<Libro> getConsultaLibros(String sql) throws SQLException, CamposObligatoriosException, isbnException {
	libros=new ArrayList<Libro>();
	st=cn.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
	rs=st.executeQuery(sql);
	while(rs.next()){
		int id=rs.getInt("idlibros");
		String titulo=rs.getString("titulo");
		String autor=rs.getString("autor");
		String editorial=rs.getString("editorial");
		String isbn=rs.getString("isbn");
		boolean prestado=rs.getBoolean("prestado");
		Date fechaPrestamo=rs.getDate("fechaPrestamo");
		Date fechaDevolucion=rs.getDate("fechaDevolucion");
		Timestamp fechaAlta=rs.getTimestamp("fechaAlta");

		Libro libro= new Libro(id, titulo, autor, editorial, isbn, prestado, fechaPrestamo, fechaDevolucion, fechaAlta);		
		libros.add(libro);
		libro=null;
	}
	rs=null;
	st=null;
	return getLibros();
}

public void abrirConexion() throws SQLException, CamposObligatoriosException, isbnException, ClassNotFoundException {
	//Es la forma de inicializar e instanciar el driver, es como hace un new
	Class.forName(drv);
	cn=DriverManager.getConnection(db, userAndPass, "");
	System.out.println("La conexion se realizo con exito");
}

public void cerrarConexcion() throws SQLException{
	if(rs!=null) rs.close();
	if(st!=null) st.close();
	if(cn!=null) cn.close();
	System.out.println("Conexion cerrada");
}

public ResultSet getRs() {
	return rs;
}

public void setRs(ResultSet rs) {
	this.rs = rs;
}

public List<Libro> getLibros() {
	return libros;
}

public void setLibros(List<Libro> libros) {
	this.libros = libros;
}
	
	

}
