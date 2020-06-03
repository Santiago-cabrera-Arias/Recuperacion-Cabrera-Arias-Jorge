package ec.edu.test;

import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.electrodomesticoDAO.ElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.vista.VistaElectrodomestico;

/**
 *
 * @author santi
 */
public class test {

    public static void main(String[] args) {

        VistaElectrodomestico vista = new VistaElectrodomestico();
        ElectrodomesticoDAO dao = new ElectrodomesticoDAO();
        ControladorElectrodomestico controlador = new ControladorElectrodomestico(vista, dao);

        
        
        System.out.println("Registrar television");
        System.out.println("\n1.Datos Television");
        controlador.registrarTelevision();
        System.out.println("\n2.Datos Television");
        controlador.registrarTelevision();
        System.out.println("\n3.Datos Telvision");
        controlador.registrarTelevision();
        
        System.out.println("\n");
        
        System.out.println("\nRegistrar Lavadora");
        
        System.out.println("\n1.Datos Lavadora");
        controlador.registrarLavadoras();
        System.out.println("\n2. Datos Lavadora");
        controlador.registrarLavadoras();
        System.out.println("\n3. Datos Lavadora");
        controlador.registrarLavadoras();
       
        
        controlador.listarTelevisor();
        
        System.out.println("");
        
        controlador.listaLavadora();
        
        

        
        
    }

}
