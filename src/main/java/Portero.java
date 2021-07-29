/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

/**
 *
 * @author santi
 */
public class Portero extends Futbolista {

    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad()
                + " y juega de " + this.getPosicion() + " con el dorsal " + dorsal
                + ". Le han marcado " + golesRecibidos;

    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public int compareTo(Object o) {
        return golesRecibidos - ((Portero)o).golesRecibidos; //To change body of generated methods, choose Tools | Templates.
    }

    

   
}
