package ec.edu.ups.controlador;



import ec.edu.ups.ielectrodomesticodao.IElectrodomesticoDao;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class ControladorElectrodomestico {

    VistaElectrodomestico vista;
    IElectrodomesticoDao dao;
    Television television;
    Lavadora lavadora;

    public ControladorElectrodomestico(VistaElectrodomestico vista, IElectrodomesticoDao dao) {
        this.vista = vista;
        this.dao = dao;
        
    }

    public void registrarTelevision() {

        television = vista.ingresarTelevision();
        dao.create(television);

    }

    public void registrarLavadoras() {

        lavadora = vista.ingresarLavadora();
        dao.create(lavadora);

    }
    
    public void listarTelevisor(){
        
        List<Television> television = new ArrayList<>();
        television = dao.listarTelevision();
        vista.listarTelevisor(television);
        
    }

    
    public void listaLavadora(){
        
        List<Lavadora> lavadora = new ArrayList<>();
        lavadora = dao.listarLavadora();
        vista.listaraLavadora(lavadora);
        
    }
  
}
