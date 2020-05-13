
package ec.edu.ups.controlador;

/**
 *
 * @author Lisseth Reinoso
 */
import ec.edu.ups.idao.ITelefonoDao;
import ec.edu.ups.modelo.Telefono;
import ec.ups.edu.dao.TelefonoDao;
import ec.ups.edu.vista.VistaTelefono;
import java.util.List;

public class ControladorTelefono {
    //Objetos vista
    private VistaTelefono vistaTelefono;
    private Telefono telefono;
    private ITelefonoDao telefonoDao;
    
    //constructor
    public ControladorTelefono(VistaTelefono vistaTelefono){
        this.vistaTelefono=vistaTelefono;
        this.telefonoDao= new TelefonoDao();
    }
    
    //llamar al DAO para llamar al usuario
    public void registrar(){
        telefono=vistaTelefono.agregarTelefono();
        telefonoDao.create(telefono);    
    }
    
    //llama al DAO para obtener un usuario por la cédula y luego muestra en la vista.
    public void verTelefono(){
        int codigo= vistaTelefono.buscarTelefono();
        telefono=telefonoDao.read(codigo);
        vistaTelefono.verTelefono(telefono);
    }
    
    //llama al DAO para modificar al usuario
    public void modificar(){
        telefono=vistaTelefono.modificarTelefono();
        telefonoDao.update(telefono);
    }
    
    //llama al DAO para eliminar al usuario
    public void eliminar(){
        telefono=vistaTelefono.eliminarTelefono();
        telefonoDao.delete(telefono);
    }
     public void verTelefonos(){
        List<Telefono> telefonos;
        telefonos=telefonoDao.findAll();
        vistaTelefono.verTelefonos(telefonos);
    }
    
}
