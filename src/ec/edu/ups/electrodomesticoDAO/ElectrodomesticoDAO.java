package ec.edu.ups.electrodomesticoDAO;

import ec.edu.ups.ielectrodomesticodao.IElectrodomesticoDao;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ElectrodomesticoDAO implements IElectrodomesticoDao{

private SortedSet<Electrodomestico> lista;

    public ElectrodomesticoDAO() {
        
        lista = new TreeSet(); 

    }

    @Override
    public Television create(Television television) {
        
        lista.add(television);
    
        return null;
        
    }

    @Override
    public Lavadora create(Lavadora lavadora) {
        
        lista.add(lavadora);
        
        return null;
        
    }

    @Override
    public List<Lavadora> listarLavadora() {
      
        
        
    }

    @Override
    public List<Television> listarTelevision() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }






}
