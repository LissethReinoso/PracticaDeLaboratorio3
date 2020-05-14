
package ec.edu.ups.controlador;

/**
 *
 * @author Usuario
 */
import ec.edu.ups.idao.IUsuarioDao;
import ec.edu.ups.modelo.Usuario;
import ec.ups.edu.dao.UsuarioDao;
import ec.ups.edu.vista.VistaUsuario;
import java.util.List;


public class ControladorUsuario {
    //Objetos vista
    private VistaUsuario vistaUsuario;
    private Usuario usuario;
    private IUsuarioDao usuarioDao;
    
    //constructor
    public ControladorUsuario(VistaUsuario vistaUsuario){
        this.vistaUsuario=vistaUsuario;
        this.usuarioDao= new UsuarioDao();
    }
    
    //llamar al DAO para llamar al usuario
    public void registrar(){
        usuario=vistaUsuario.agregarUsuario();
        usuarioDao.create(usuario);    
    }
    
    //llama al DAO para obtener un usuario por la cédula y luego muestra en la vista.
    public void verUsuario(){
        int cedula= vistaUsuario.buscarUsuario();
       
        usuario=usuarioDao.read(cedula);
        vistaUsuario.verUsuario(usuario);
    }
    //llama al DAO para modificar al usuario
    public void modificar(){
        usuario=vistaUsuario.modificarUsuario();
        usuarioDao.update(usuario);
    }
    //llama al DAO para eliminar al usuario
    public void eliminar(){
        usuario=vistaUsuario.eliminarUsuario();
        usuarioDao.delete(usuario);
    }
    public void verUsuarios(){
        List<Usuario> usuarios;
        usuarios=usuarioDao.findAll();
        vistaUsuario.verUsuarios(usuarios);
    }
            
}
