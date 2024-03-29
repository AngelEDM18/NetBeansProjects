package move;
// Generated 03-feb-2019 13:13:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * DetallePedido generated by hbm2java
 */
public class DetallePedido  implements java.io.Serializable {


     private DetallePedidoId id;
     private BigDecimal precioUnidad;
     private int cantidad;
     private float descuento;

    public DetallePedido() {
    }

    public DetallePedido(DetallePedidoId id, BigDecimal precioUnidad, int cantidad, float descuento) {
       this.id = id;
       this.precioUnidad = precioUnidad;
       this.cantidad = cantidad;
       this.descuento = descuento;
    }
   
    public DetallePedidoId getId() {
        return this.id;
    }
    
    public void setId(DetallePedidoId id) {
        this.id = id;
    }
    public BigDecimal getPrecioUnidad() {
        return this.precioUnidad;
    }
    
    public void setPrecioUnidad(BigDecimal precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public float getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }




}


