
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
    
    public Television create(Television television);
    public Lavadora create(Lavadora lavadora);
    List<Lavadora> listarLavadora();
    List<Television> listarTelevision();
    
}
