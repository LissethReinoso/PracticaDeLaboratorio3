package ec.ups.edu.dao;

/**
 *
 * @author Lisseth Reinoso
 */
import ec.edu.ups.idao.ITelefonoDao;
import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonoDao implements ITelefonoDao {

    private Map<Integer,Telefono> listaTelefono;

    public TelefonoDao() {
        listaTelefono = new HashMap<>();
    }

    @Override
    public void create(Telefono telefono) {
        listaTelefono.put(telefono.hashCode(),telefono);
    }

    @Override
    public Telefono read(int codigo) {
        Telefono telefono = new Telefono(codigo, null, null, null);
        if(listaTelefono.containsKey(telefono.hashCode())){
            return listaTelefono.get(telefono.hashCode());
        }
        return null;
    }

    @Override
    public void update(Telefono telefono) {
        if(listaTelefono.containsKey(telefono.hashCode())){
            listaTelefono.replace(telefono.hashCode(), telefono);
        }
    }

    //iterator colecciones
    @Override
    public void delete(Telefono telefono) {
        if(listaTelefono.containsKey(telefono.hashCode())){
                listaTelefono.remove(telefono.hashCode());
        }
    }

    @Override
    public List<Telefono> findAll() {
        List<Telefono> listaTelefono = new ArrayList<>(this.listaTelefono.values());
        return listaTelefono;
    }

}
