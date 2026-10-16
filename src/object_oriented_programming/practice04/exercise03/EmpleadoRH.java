package object_oriented_programming.practice04.exercise03;

public class EmpleadoRH extends Empleado {

    public EmpleadoRH(String nombre, String apellido, String puesto, int horasTrabajadas, double tarifaPorHora) {

        super(nombre, apellido, puesto, horasTrabajadas, tarifaPorHora);
    }

    public String contratarEmpleado(Empleado empleado) {
        return nombre + " " + apellido + " del puesto: " + puesto + " con un salario de: " + calcularSalario() + " contrato a: " + empleado.trabajar() + " con un salario de: " + empleado.calcularSalario();
    }
}
