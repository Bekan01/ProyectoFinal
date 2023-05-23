
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
    
    public String AgregarCliente(JTextField nombre, JTextField apellido, JTextField dni,JTextField direcc, JTextField celular,JTextField email){
       
       this.nombre=nombre.getText();
       this.apellido=apellido.getText();
       this.dni=dni.getText();
       this.direccion=direcc.getText();
       this.celular=celular.getText();
       this.email=email.getText();
       modelo.addRow(new Object[]{this.nombre,this.apellido,this.dni,this.direccion,this.celular,this.email});
       return nombre.getText();
    }

    public void LimpiarDatosClientes(JTextField nombre, JTextField apellido, JTextField ced,JTextField direcc, JTextField celular,JTextField email){
        nombre.setText("");
        apellido.setText("");
        ced.setText("");
        direcc.setText("");
        celular.setText("");
        email.setText("");
    }
    
    public void eliminarfilaCliente(JTable tablaClientes){
        int fila=tablaClientes.getSelectedRow();
        if(tablaClientes.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "por favor Seleccione una fila");
        }
        else{
           modelo.removeRow(fila); 
        }
        
    }
    
}


//prueba bekan
//prueba eduardo
//prueba eduardo2