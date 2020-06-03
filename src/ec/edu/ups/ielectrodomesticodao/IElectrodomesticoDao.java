package ec.edu.ups.ielectrodomesticodao;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IElectrodomesticoDao {

    //CRUD
    public void create(Television television);

    public void create(Lavadora lavadora);

    List<Lavadora> listarLavadora();

    List<Television> listarTelevision();

}
