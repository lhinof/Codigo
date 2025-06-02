package com.mycompany.ejercicioarchivo;
import java.util.List;
import java.util.Scanner;

public class mainEvaluacion1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArchEval archivo = new ArchEval("evaluaciones.dat");

        int opc;
        do {
            System.out.println("1. Crear");
            System.out.println("2. Adicionar");
            System.out.println("3. Listar");
            System.out.println("4. Mostrar nota total");
            System.out.println("5. Mostrar cantidad de aprobados y reprobados");
            System.out.println("0. Salir");
            System.out.print("Elegir una opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    archivo.crear();
                    break;
                case 2:
                    try {
                        archivo.adicionar();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    List<Evaluacion> lista = archivo.listar();
                    for (Evaluacion ev : lista) {
                        ev.mostrar(); // mostrar solo los campos
                    }
                    System.out.println("Fin listado!!!");
                    break;
                case 4:
                    List<Evaluacion> listaNotas = archivo.listar();
                    for (Evaluacion ev : listaNotas) {
                        ev.mostrarNotaTotal();
                    }
                    break;
                case 5:
                    List<Evaluacion> listaEval = archivo.listar();
                    int aprobados = 0, reprobados = 0;

                    for (Evaluacion ev : listaEval) {
                        if (ev.estaAprobado()) {
                            aprobados++;
                        } else {
                            reprobados++;
                        }
                    }

                    System.out.println("Cantidad de Aprobados: " + aprobados);
                    System.out.println("Cantidad de Reprobados: " + reprobados);
                    break;

            }
        } while (opc != 0);
    }
}

