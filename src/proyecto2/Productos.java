package proyecto2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Productos {
    
    private String nombre;
    private int cantidad;
    private double precio;
    private ArrayList<Productos> ListaProducto= new ArrayList();
    Ventas venta = new Ventas();
      

    public Productos(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public Productos() {

    }
    
    //Getter y Setter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Productos> getProductos() {
        return this.ListaProducto;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.ListaProducto = productos;
    }
    
    
    
   
        
     
    }
    
       
           
       
      
        
    
    
   
        
    
    


