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

        entrada = new Scanner(System.in);

        Television television = new Television();

        System.out.print("Ingrese el codigo del televisor: ");
        int codigo = entrada.nextInt();
        television.setCodigo(codigo);
        System.out.print("Ingrese la descripcion del televisor: ");
        String descripcion = entrada.next();
        television.setDescripcion(descripcion);
        System.out.print("Ingrese el precio del televisor: ");
        double precioBase = entrada.nextDouble();
        television.setPrecioBase(precioBase);
        System.out.print("Ingrese el color del televisor: ");
        String color = entrada.next();
        television.setColor(color);
        System.out.print("Ingrese el consumo del televisor: ");
        char consumoEnergio = entrada.next().charAt(0);
        television.setConsumoEnergetico(consumoEnergio);
        System.out.print("Ingrese el peso del televisor: ");
        int peso = entrada.nextInt();
        television.setPeso(peso);
        System.out.print("Ingrese la resolucion del televisor: ");
        int resolucion = entrada.nextInt();
        television.setResolucion(resolucion);
        System.out.print("Ingrese si tiene HDMI del televisor (Si/No): ");
        String puerto = entrada.next();
        
        return television;
    }

    public Lavadora ingresarLavadora() {

        entrada = new Scanner(System.in);

        Lavadora lavadora = new Lavadora();

        System.out.print("Ingrese el codigo de la lavadora: ");
        int codigo = entrada.nextInt();
        lavadora.setCodigo(codigo);
        System.out.print("Ingrese la descripcion de la lavadora: ");
        String descripcion = entrada.next();
        lavadora.setDescripcion(descripcion);
        System.out.print("Ingrese el precio de la lavadora: ");
        double precioBase = entrada.nextDouble();
        lavadora.setPrecioBase(precioBase);
        System.out.print("Ingrese el color de la lavadora: ");
        String color = entrada.next();
        lavadora.setColor(color);
        System.out.print("Ingrese el consumo de la lavadora: ");
        char consumoEnergio = entrada.next().charAt(0);
        lavadora.setConsumoEnergetico(consumoEnergio);
        System.out.print("Ingrese el peso de la lavadora: ");
        int peso = entrada.nextInt();
        lavadora.setPeso(peso);
        System.out.print("Ingrese la carga de la lavadora: ");
        int carga = entrada.nextInt();
        lavadora.setCarga(carga);
        return lavadora;

    }

    public void listaraLavadora(List<Lavadora> lista) {

        for (Lavadora lavadora : lista) {

            System.out.println(lavadora);

        }

    }

    public void listarTelevisor(List<Television> lista) {

        for (Television television : lista) {

            System.out.println(television);

        }

    }

}
