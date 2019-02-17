import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import controlador.LibrosController;
import excepciones.CamposObligatoriosException;
import excepciones.isbnException;
import modelo.Libro;

public class Main {

	public static void main(String[] args) {
		
		LibrosController biblioteca=null;
		
			
				//Libro libro=new Libro(1,"Harry potter","JK","JK Rowling","978-84-412-2682-1",true);
			
			
				try {
					biblioteca=new LibrosController();
					List biblio=biblioteca.getLibros();
					mostrar(biblio);
					biblioteca.cerrarConexcion();
					biblioteca=null;
				} catch (ClassNotFoundException e) {
					// TODO Bloque catch generado automáticamente
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Bloque catch generado automáticamente
					e.printStackTrace();
				} catch (CamposObligatoriosException e) {
					// TODO Bloque catch generado automáticamente
					e.printStackTrace();
				} catch (isbnException e) {
					// TODO Bloque catch generado automáticamente
					e.printStackTrace();
				}
				
			
		
}

	private static void mostrar(List biblio) {
		Libro libroo=null;
		
		for (int x=0;x<biblio.size();x++){
			libroo=(Libro) biblio.get(x);
			System.out.println(libroo.toString());
		}
		
		
	}
}