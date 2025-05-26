public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        Empleados empleados = new Empleados();

        empleados.darDeAltaEmpleado(new Empleado("Juan", "Gerente", 3000));
        empleados.darDeAltaEmpleado(new Empleado("Ana", "Secretaria", 2000));
        empleados.darDeAltaEmpleado(new Empleado("Luis", "Contable", 2500));

        System.out.println("Listado de empleados:");
        empleados.mostrarEmpleados();

        empleados.aumentarSalario(10);

        System.out.println("\nListado tras aumento de salario:");
        empleados.mostrarEmpleados();
    }
}