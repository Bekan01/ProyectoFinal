package proyecto2;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Clientes {
    
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String celular;
    private String email;

    public Clientes(String nombre, String apellido, String dni, String direccion, String celular, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.celular = celular;
        this.email = email;
    }
    
    public Clientes() {

    }
    
    
    //Getter y Setter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
       DefaultTableModel modelo = new DefaultTableModel();
    public void CabeceraClientes(JTable tablaClientes){
        String[] cabecera = new String[]{"NOMBRE","APELLIDO","DNI","DIRECCION","CELULAR","EMAIL"};
        modelo.setColumnIdentifiers(cabecera);
        tablaClientes.setModel(modelo);
    }
    
    

   
    }
    
    
    
        
    
    




//prueba bekan
//prueba eduardo
//prueba eduardo2
//prueba sani
//ultima prueba bekan final