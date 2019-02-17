package move;
// Generated 03-feb-2019 13:13:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Productos generated by hbm2java
 */
public class Productos  implements java.io.Serializable {


     private Integer idProducto;
     private String nombreProducto;
     private String cantidadPorUnidad;
     private BigDecimal precioUnidad;

    public Productos() {
    }

	
    public Productos(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public Productos(String nombreProducto, String cantidadPorUnidad, BigDecimal precioUnidad) {
       this.nombreProducto = nombreProducto;
       this.cantidadPorUnidad = cantidadPorUnidad;
       this.precioUnidad = precioUnidad;
    }
   
    public Integer getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getCantidadPorUnidad() {
        return this.cantidadPorUnidad;
    }
    
    public void setCantidadPorUnidad(String cantidadPorUnidad) {
        this.cantidadPorUnidad = cantidadPorUnidad;
    }
    public BigDecimal getPrecioUnidad() {
        return this.precioUnidad;
    }
    
    public void setPrecioUnidad(BigDecimal precioUnidad) {
        this.precioUnidad = precioUnidad;
    }




}


