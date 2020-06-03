/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author santi
 */
public class Electrodomestico implements Comparable<Electrodomestico> {
    
    private int codigo;
    private String descripcion;
    protected double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;
    
    public Electrodomestico(int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
   
    //Construcor vacio
    public Electrodomestico() {
        
    }

    public double obtenerPrecioFinal() {
        
        double precio = 0;
        
        if (consumoEnergetico == 'A') {
            
            precio = 100;
            
        } else if (consumoEnergetico == 'B') {
            
            precio = 80;
            
        } else if (consumoEnergetico == 'C') {
            
            precio = 60;
            
        } else if (consumoEnergetico == 'D') {
            
            precio = 50;
            
        } else if (consumoEnergetico == 'E') {
            
            precio = 30;
            
        } else if (consumoEnergetico == 'F') {
            
            precio = 10;
            
        }if (peso >= 0 && peso <= 19){
            
            precio = 10;
            
        }else if(peso >=20 && peso <=49){
            
            precio = 50;
        
        }else if(peso >=50 && peso <=79){
            
            precio =80;
            
        }else if(peso > 80){
        
            precio = 100;
            
        }
            
        return precioBase + precio;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public double getPrecioBase() {
        return precioBase;
    }
    
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.codigo;
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
        final Electrodomestico other = (Electrodomestico) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    //comparar la clase
    @Override
    public int compareTo(Electrodomestico t) {
        
       if(precioBase >t.precioBase){
           
           return 1;
       
       }else if(precioBase< t.precioBase){
           
           return -1;
       }
       
       return 0;
    }
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo= " + codigo + ", descripcion= " + descripcion + ", precioBase= " + precioBase + ", color= " + color + ", consumoEnergetico= " + consumoEnergetico + ", peso= " + peso + '}';
    }
    
}
