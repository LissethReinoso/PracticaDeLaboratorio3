package ec.ups.edu.dao;

import ec.edu.ups.idao.IUsuarioDao;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Lisseth Reinoso
 */
public class UsuarioDao implements IUsuarioDao {

    private List<Usuario> listaUsuario;

    public UsuarioDao() {
        listaUsuario = new ArrayList<>();
    }

    @Override
    public void create(Usuario usuario) {
        listaUsuario.add(usuario);
    }

    @Override
    public Usuario read(int cedula) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getCedula() == cedula) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void update(Usuario usuario) {
        for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario u = listaUsuario.get(i);
            if (u.getCedula() == usuario.getCedula()) {
                listaUsuario.set(i, usuario);
                break;
            }
        }
    }

    @Override
    public void delete(Usuario usuario) {
        Iterator<Usuario> it = listaUsuario.iterator();
        while (it.hasNext()) {
            Usuario u = it.next();
            if (u.getCedula() == usuario.getCedula()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Usuario> findAll() {
        return listaUsuario;
    }

}
