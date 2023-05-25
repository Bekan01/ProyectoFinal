package proyecto2;
import java.util.ArrayList;

public class Ventas {
    
    private Clientes cliente;
    private ArrayList<Productos> ListaProducto;
   
    private double precio;
    private double cantidad;
    private double total;

    public Ventas(Clientes cliente, ArrayList<Productos> ListaProducto) {
        this.cliente = cliente;
        this.ListaProducto = ListaProducto;
    }


    public Ventas() {
        
     //los getter y setter
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Productos> getListaProducto() {
        return ListaProducto;
    }

    public void setListaProducto(ArrayList<Productos> ListaProducto) {
        this.ListaProducto = ListaProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    

    
    
    
    
     
     }
    
     
   
    
    
              
        

    

    
   
             
         
       
         
    
     
   
    
  
     
  
        
        
        
    


