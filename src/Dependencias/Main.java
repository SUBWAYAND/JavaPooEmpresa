package Dependencias;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Persona> personas = new ArrayList<>();

        while (true) {
            System.out.println("\n1 Agregar Empleado");
            System.out.println("2. Agregar Gerente");
            System.out.println("3. Agregar Detalles");
            System.out.println("4. Salir");
            System.out.println("Ingrese Opcion");

            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Digite el nombre del Empleado: ");
                    String nombreEmpleado = entrada.nextLine();
                    System.out.println("Ingrese el salario del Empleado: ");
                    double salarioEmpleado = entrada.nextDouble();
                    entrada.nextLine();
                    personas.add(new Empleado(nombreEmpleado, salarioEmpleado));
                    break;

                case 2:
                    System.out.println("Digite el nombre del Gerente: ");
                    String nombreGerente = entrada.nextLine();
                    System.out.println("Ingrese el departamento del Gerente: ");
                    String departamentoGerente = entrada.nextLine();
                    entrada.nextLine();
                    personas.add(new Gerente(nombreGerente, departamentoGerente));
                    break;

                case 3:
                    System.out.println("Detalles de personas");

                    for (Persona persona : personas) {
                        persona.mostrarDetalles();
                        System.out.println("---------------");
                    }

                    break;

                case 4:

                    System.out.println("Saliendo del Programa.....");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion invalida, por favor ingrese opcion (1-4)");
            }

        }

    }
}


//                 