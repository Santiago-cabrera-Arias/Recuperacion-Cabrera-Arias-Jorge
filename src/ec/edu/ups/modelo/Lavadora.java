package ec.edu.ups.modelo;

/**
 *
 * @author santi
 */
public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora(int carga, int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora() {

    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.carga;
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
        final Lavadora other = (Lavadora) obj;
        if (this.carga != other.carga) {
            return false;
        }
        return true;
    }

    //Obtener precio final.
    @Override
    public double obtenerPrecioFinal() {

        double precio = super.precioBase + super.obtenerPrecioFinal();

        if (carga > 30) {

            precio = 50;

        }

        return precio;
    }

    @Override
    public String toString() {
        return super.toString()+ "Lavadora{" + "carga= " + carga + " Precio Final " + obtenerPrecioFinal() + '}';
    }

}
