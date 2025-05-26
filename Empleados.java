import java.util.ArrayList;

/**
 * Clase para gestionar una lista de empleados.
 */
public class Empleados {
    /**
     * Lista de empleados.
     */
    public ArrayList<Empleado> lista;

    /**
     * Crea una nueva lista de empleados vacía.
     */
    public Empleados() {
        lista = new ArrayList<>();
    }

    /**
     * Da de alta (agrega) un empleado a la lista.
     * @param empleado Empleado a agregar.
     */
    public void darDeAltaEmpleado(Empleado empleado) {
        lista.add(empleado);
    }

    /**
     * Muestra por pantalla todos los empleados de la lista.
     */
    public void mostrarEmpleados() {
        for (Empleado e : lista) {
            System.out.println(e);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado e : lista) {
            double nuevoSalario = e.getSalario() * (1 + porcentaje / 100);
            e.setSalario(nuevoSalario);
        }
    }
}