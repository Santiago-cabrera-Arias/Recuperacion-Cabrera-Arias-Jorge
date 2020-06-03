package ec.edu.ups.electrodomesticoDAO;

import ec.edu.ups.ielectrodomesticodao.IElectrodomesticoDao;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ElectrodomesticoDAO implements IElectrodomesticoDao {

    private SortedSet<Electrodomestico> lista;

    public ElectrodomesticoDAO() {

        lista = new TreeSet();

    }

    @Override
    public void create(Television television) {

        lista.add(television);

    }

    @Override
    public void create(Lavadora lavadora) {

        lista.add(lavadora);

    }

    @Override
    public List<Lavadora> listarLavadora() {

        List<Lavadora> listaLavadora = new ArrayList<>();

        Iterator<Electrodomestico> it = lista.iterator();

        while (it.hasNext()) {
            Electrodomestico elec = it.next();
            if (elec instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) elec;
                listaLavadora.add(lavadora);

            }

        }

        return listaLavadora;
    }

    @Override
    public List<Television> listarTelevision() {

        List<Television> listaTelevision = new ArrayList<>();

        Iterator<Electrodomestico> it = lista.iterator();
        while (it.hasNext()) {
            Electrodomestico elec = it.next();
            if (elec instanceof Television) {
                Television television = (Television) elec;
                listaTelevision.add(television);

            }
        }

        return listaTelevision;
    }

}
