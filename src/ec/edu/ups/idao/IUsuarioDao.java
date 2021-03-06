package ec.edu.ups.idao;

import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 *
 * @author Lisseth Reinoso
 */
public interface IUsuarioDao {

    //CRUD
    public void create(Usuario usuario);

    public Usuario read(int cedula);

    public void update(Usuario usuario);

    public void delete(Usuario usuario);

    public List<Usuario> findAll();

}
