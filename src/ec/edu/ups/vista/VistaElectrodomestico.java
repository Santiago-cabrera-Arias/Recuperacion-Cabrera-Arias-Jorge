package ec.edu.ups.vista;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class VistaElectrodomestico {

    Scanner entrada;

    public VistaElectrodomestico() {

        entrada = new Scanner(System.in);

    }

    public Television ingresarTelevision() {

        System.out.println("Ingrese la resolucion de la television");
        int resolucion = entrada.nextInt();
        System.out.println("Tiene puerto hdmi");
        boolean puertoHdmi = entrada.nextBoolean();

        return new Television(resolucion, puertoHdmi);

    }

    public Lavadora ingresarLavadora() {

        System.out.println("Ingrese la carga que ocupa la lavadora");
        int carga = entrada.nextInt();

        return new Lavadora(carga);

    }

    public void mostrarLavadoras(List<Lavadora> lista) {

        for (Lavadora lavadora : lista) {

            System.out.println("Datos de la lavadora: " + lavadora);

        }

    }

    public void mostrarTelevisiones(List<Television> lista) {

        for (Television television : lista) {

            System.out.println("Datos del televisor: " + television);

        }

    }

}
