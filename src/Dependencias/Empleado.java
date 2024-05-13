package Dependencias;

public class Empleado extends Persona {

    private double salario;

    public Empleado(String nombre, double salario) {
        super(nombre);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("EMPLEADO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);

    }

}
