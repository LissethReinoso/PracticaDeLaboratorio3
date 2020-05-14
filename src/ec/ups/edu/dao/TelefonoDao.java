package ec.ups.edu.dao;

/**
 *
 * @author Lisseth Reinoso
 */
import ec.edu.ups.idao.ITelefonoDao;
import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TelefonoDao implements ITelefonoDao {

    private List<Telefono> listaTelefono;

    public TelefonoDao() {
        listaTelefono = new ArrayList<>();
    }

    @Override
    public void create(Telefono telefono) {
        listaTelefono.add(telefono);
    }

    @Override
    public Telefono read(int codigo) {
        for (Telefono usuario : listaTelefono) {
            if (usuario.getCodigo() == codigo) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void update(Telefono telefono) {
        for (int i = 0; i < listaTelefono.size(); i++) {
            Telefono u = listaTelefono.get(i);
            if (u.getCodigo() == telefono.getCodigo()) {
                listaTelefono.set(i, telefono);
                break;
            }
        }
    }

    //iterator colecciones
    @Override
    public void delete(Telefono telefono) {
        Iterator<Telefono> it = listaTelefono.iterator();
        while (it.hasNext()) {
            Telefono t = it.next();
            if (t.getCodigo() == telefono.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Telefono> findAll() {
        return listaTelefono;
    }

}
