
package ec.edu.ups.modelo;

/**
 *
 * @author santi
 */
public class Television extends Electrodomestico{
    
    private int resolucion;
    private boolean puertoHDMI;

    public Television(int resolucion, boolean puertoHDMI, int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.puertoHDMI = puertoHDMI;
    }
    
    public Television(){
        
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.resolucion;
        hash = 59 * hash + (this.puertoHDMI ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Television other = (Television) obj;
        if (this.resolucion != other.resolucion) {
            return false;
        }
        if (this.puertoHDMI != other.puertoHDMI) {
            return false;
        }
        return true;
    }

    public double obtenerSalaioFinal(){
        
        double precio = 0;
        
        if (resolucion > 40){
            
            precio = (precioBase*0.30);
            
        }else if(puertoHDMI == true){
            
            precio = 50;
            
        }
        
        return super.precioBase+precio;
    } 
    
    
    @Override
    public String toString() {
        return super.toString()+ "Television{" +  "resolucion= " + resolucion + ", puertoHDMI= " + puertoHDMI +" Precio Final "+obtenerPrecioFinal()+ '}';
    }

}
