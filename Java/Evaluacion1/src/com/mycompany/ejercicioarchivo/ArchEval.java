package com.mycompany.ejercicioarchivo;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArchEval {
    private String nombreArchivo;

    public ArchEval(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void crear() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            System.out.println("Archivo creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    public void adicionar() throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        String resp;

        if (new File(nombreArchivo).exists()) {
            FileOutputStream archi = new FileOutputStream(nombreArchivo, true);
            ObjectOutputStream sal = new AddObjectOutputStream(archi);
            try {
                do {
                    Evaluacion x = new Evaluacion();
                    x.leer();
                    sal.writeObject(x);
                    System.out.print("Desea continuar s/n: ");
                    resp = sc.next();
                    sc.nextLine(); // limpiar buffer
                } while (resp.equalsIgnoreCase("s"));
            } finally {
                sal.close();
                archi.close();

                // Mostrar resumen de aprobados y reprobados
                List<Evaluacion> lista = listar(); // Leer todo desde archivo
                int aprob = 0, reprob = 0;
                for (Evaluacion ev : lista) {
                    if (ev.estaAprobado()) aprob++;
                    else reprob++;
                }
                System.out.println("Resumen:");
                System.out.println("Aprobados: " + aprob);
                System.out.println("Reprobados: " + reprob);
            }
        } else {
            System.out.println("No existe el archivo... ¡debe crear primero!");
        }
    }

    public void adicionar(Evaluacion x) {
        try (FileOutputStream archi = new FileOutputStream(nombreArchivo, true);
             ObjectOutputStream sal = new AddObjectOutputStream(archi)) {
            sal.writeObject(x);
        } catch (IOException e) {
            System.out.println("Error al adicionar: " + e.getMessage());
        }
    }

    public List<Evaluacion> listar() {
        List<Evaluacion> lista = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            while (true) {
                Evaluacion ev = (Evaluacion) ois.readObject();
                lista.add(ev);
            }
        } catch (EOFException eof) {
            // fin
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
        return lista;
    }
}
