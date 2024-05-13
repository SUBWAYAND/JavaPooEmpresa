package Dependencias;

public class Gerente extends Persona {

    private String departamento;

    public Gerente(String nombre, String departamento) {
        super(nombre);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("GERENTE");
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);

    }
}
