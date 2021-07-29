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
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad()
                + ", y juega de " + this.getPosicion() + " con el dorsal " + dorsal
                + ". Le han marcado " + golesRecibidos;

    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public int compareTo(Object o) {
        return Math.abs(golesRecibidos - ((Portero) o).golesRecibidos); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        Portero f = new Portero("Santiago", 23, (short) 6, (byte) 8);
        String comp = "El futbolista Santiago tiene 23, y juega de Portero con el dorsal 8. Le han marcado 6";
        boolean ok = false;
        if (f.toString().equals(comp)) {
            ok = true;
        }

        System.out.println(f.toString());
        System.out.println(comp);
    }

}
