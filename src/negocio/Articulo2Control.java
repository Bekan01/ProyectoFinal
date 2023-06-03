
package negocio;

import datos.ArticuloDAO;
import datos.CategoriaDAO;
import entidades.Articulo;
//import entidades.Categoria;
import java.util.ArrayList;
import java.util.List;
//import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class Articulo2Control {
    private final ArticuloDAO DATOS;
    private final CategoriaDAO DATOSCAT;
    private Articulo obj;
    private DefaultTableModel modeloTabla;
    public int registrosMostrados;
    
    public Articulo2Control(){
        this.DATOS=new ArticuloDAO();
        this.DATOSCAT=new CategoriaDAO();
        this.obj=new Articulo();
        this.registrosMostrados=0;
    }
    
    public DefaultTableModel listar(String texto,int totalPorPagina,int numPagina){
        List<Articulo> lista=new ArrayList();
        lista.addAll(DATOS.listar(texto,totalPorPagina,numPagina));
        
        String[] titulos={"Id","Categoría ID","Categoría","Código","Nombre","Precio Venta","Stock","Descripción","Imagen","Estado"};
        this.modeloTabla=new DefaultTableModel(null,titulos);        
        
        String estado;
        String[] registro = new String[10];
        
        this.registrosMostrados=0;
        for (Articulo item:lista){
            if (item.isActivo()){
                estado="Activo";
            } else{
                estado="Inactivo";
            }
            registro[0]=Integer.toString(item.getId());
            registro[1]=Integer.toString(item.getCategoriaId());
            registro[2]=item.getCategoriaNombre();
            registro[3]=item.getCodigo();
            registro[4]=item.getNombre();
            registro[5]=Double.toString(item.getPrecioVenta());
            registro[6]=Integer.toString(item.getStock());
            registro[7]=item.getDescripcion();
            registro[8]=item.getImagen();
            registro[9]=estado;
            this.modeloTabla.addRow(registro);
            this.registrosMostrados=this.registrosMostrados+1;
        }
        return this.modeloTabla;
    }
    
    
}
