import java.util.Scanner;

/**
 * Clase principal que gestiona el sistema de empleados.
 */
public class SistemaGestionEmpleados {
    /**
     * Método principal. Da de alta empleados, muestra la lista y aumenta salarios.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados();

        empleados.darDeAltaEmpleado(new Empleado("Juan", "Desarrollador", 50000));
        empleados.darDeAltaEmpleado(new Empleado("María", "Diseñadora", 45000));
        empleados.darDeAltaEmpleado(new Empleado("Pedro", "Gerente", 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensajes.INTRODUZCA_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println(Mensajes.LISTADO_EMPLEADOS);
        empleados.mostrarEmpleados();
    }
}