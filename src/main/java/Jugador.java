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
public class Jugador extends Futbolista {

    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        golesMarcados = 289;
        dorsal = 7;
    }

    @Override
    public int compareTo(Futbolista f) {
        return this.getEdad() - f.getEdad(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad()
                + " y juega de " + this.getPosicion() + " con el dorsal " + dorsal
                + ". Ha marcado " + golesMarcados;

    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

}
