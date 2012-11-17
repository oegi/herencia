/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author postgrado
 */
public class Empleado {

    String nombre;
    int numEmpleado, sueldo;
    static int contador;

  Empleado() {
    }

    Empleado(String nombre1, int sueldo1) {
        nombre = nombre1;
        sueldo = sueldo1;
       numEmpleado= ++contador;
    }

    public void aumentarSueldo(int porcentaje) {
        
    }
}
