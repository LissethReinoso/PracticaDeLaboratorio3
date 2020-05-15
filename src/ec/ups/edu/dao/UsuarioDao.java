package ec.ups.edu.dao;

import ec.edu.ups.idao.IUsuarioDao;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Lisseth Reinoso
 */
public class UsuarioDao implements IUsuarioDao {

    private Map<Integer,Usuario> listaUsuario;

    public UsuarioDao() {
        listaUsuario = new HashMap<>();
    }

    @Override
    public void create(Usuario usuario) {
        listaUsuario.put(usuario.hashCode(),usuario);
    }

    @Override
    public Usuario read(int cedula) {
        Usuario usuario = new Usuario(cedula, null, null, null, null);
        if(listaUsuario.containsKey(usuario.hashCode())){
            return listaUsuario.get(usuario.hashCode());
        }
        return null;
    }

    @Override
    public void update(Usuario usuario) {
        if(listaUsuario.containsKey(usuario.hashCode())){
            listaUsuario.replace(usuario.hashCode(), usuario);
        }
    }

    //iterator colecciones
    @Override
    public void delete(Usuario usuario) {
        if(listaUsuario.containsKey(usuario.hashCode())){
                listaUsuario.remove(usuario.hashCode());
        }
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> listaUsuario = new ArrayList<>(this.listaUsuario.values());
        return listaUsuario;
    }

}
