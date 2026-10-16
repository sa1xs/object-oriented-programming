package object_oriented_programming.practice04.exercise03;

public class Main {
    public static void main(String[] args) {


        EmpleadoRH empleadoRH = new EmpleadoRH("Juan", "Pérez", "Recursos Humanos", 8, 20.0);
        Empleado empleado = new Empleado("María", "Gómez", "Desarrollador", 8, 25.0);

        System.out.println(empleadoRH.contratarEmpleado(empleado));
    }
}
