import java.util.ArrayList;

public class Empleados {
    public ArrayList<Empleado> lista;

    public Empleados() {
        lista = new ArrayList<>();
    }

    public void darDeAltaEmpleado(Empleado empleado) {
        lista.add(empleado);
    }

    public void mostrarEmpleados() {
        for (Empleado e : lista) {
            System.out.println(e);
        }
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado e : lista) {
            double nuevoSalario = e.getSalario() * (1 + porcentaje / 100);
            e.setSalario(nuevoSalario);
        }
    }
}