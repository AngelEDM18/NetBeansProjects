package move;
// Generated 03-feb-2019 13:13:56 by Hibernate Tools 4.3.1



/**
 * DetallePedidoId generated by hbm2java
 */
public class DetallePedidoId  implements java.io.Serializable {


     private int idPedido;
     private int idProducto;

    public DetallePedidoId() {
    }

    public DetallePedidoId(int idPedido, int idProducto) {
       this.idPedido = idPedido;
       this.idProducto = idProducto;
    }
   
    public int getIdPedido() {
        return this.idPedido;
    }
    
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public int getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DetallePedidoId) ) return false;
		 DetallePedidoId castOther = ( DetallePedidoId ) other; 
         
		 return (this.getIdPedido()==castOther.getIdPedido())
 && (this.getIdProducto()==castOther.getIdProducto());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdPedido();
         result = 37 * result + this.getIdProducto();
         return result;
   }   


}


