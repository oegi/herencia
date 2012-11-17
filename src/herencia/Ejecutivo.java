/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author postgrado
 */
public class Ejecutivo extends Empleado {

    int presupuesto;

    public Ejecutivo() {
    }

    public Ejecutivo(String Nombre1, int sueldo1) {
        super(Nombre1, sueldo1);
    }

    
    

    
    void asignarPresupuesto(int p) {
        presupuesto = p;
    }
}
