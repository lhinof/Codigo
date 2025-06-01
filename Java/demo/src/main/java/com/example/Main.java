package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Habitacion {
    String tipo;
    double area;

    public Habitacion(String tipo, double area) {
        this.tipo = tipo;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Área: " + area + " mts^2";
    }
}

class Garaje {
    String techo;
    String tipoPuerta;
    int capacidad;

    public Garaje(String techo, String tipoPuerta, int capacidad) {
        this.techo = techo;
        this.tipoPuerta = tipoPuerta;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Techo: " + techo + ", Tipo de Puerta: " + tipoPuerta + ", Capacidad: " + capacidad;
    }
}

class Casa {
    int numero;
    String direccion;
    List<Habitacion> habitaciones;
    Garaje garaje;

    public Casa(int numero, String direccion) {
        this.numero = numero;
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void setGaraje(Garaje garaje) {
        this.garaje = garaje;
    }

    public void mostrarDatosDormitorios() {
        int contadorDormitorios = 0;
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.tipo.equalsIgnoreCase("dormitorio")) {
                System.out.println(habitacion);
                contadorDormitorios++;
            }
        }
        System.out.println("Número de dormitorios: " + contadorDormitorios);
    }

    public void mostrarHabitacionesMayorArea(double areaMinima) {
        System.out.println("Habitaciones con área mayor a " + areaMinima + " mts^2:");
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.area > areaMinima) {
                System.out.println(habitacion);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el número de la casa: ");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consumir nueva línea
        System.out.print("Ingrese la dirección de la casa: ");
        String direccion = scanner.nextLine();

        Casa casa = new Casa(numero, direccion);

        // Agregar habitaciones
        while (true) {
            System.out.print("¿Desea agregar una habitación? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }

            System.out.print("Ingrese el tipo de habitación (ej. dormitorio, sala, cocina): ");
            String tipoHabitacion = scanner.nextLine();
            System.out.print("Ingrese el área de la habitación en mts^2: ");
            double areaHabitacion = scanner.nextDouble();
            scanner.nextLine();  // Consumir nueva línea

            Habitacion habitacion = new Habitacion(tipoHabitacion, areaHabitacion);
            casa.agregarHabitacion(habitacion);
        }

        // Agregar garaje
        System.out.print("¿Desea agregar un garaje? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            System.out.print("Ingrese el tipo de techo del garaje: ");
            String techoGaraje = scanner.nextLine();
            System.out.print("Ingrese el tipo de puerta del garaje: ");
            String tipoPuertaGaraje = scanner.nextLine();
            System.out.print("Ingrese la capacidad del garaje: ");
            int capacidadGaraje = scanner.nextInt();
            casa.setGaraje(new Garaje(techoGaraje, tipoPuertaGaraje, capacidadGaraje));
        }

        // Mostrar datos
        System.out.println("\nDatos de la casa:");
        casa.mostrarDatosDormitorios();

        // Mostrar habitaciones con área mayor a un valor específico
        System.out.print("\nIngrese un área mínima para mostrar habitaciones: ");
        double areaMinima = scanner.nextDouble();
        casa.mostrarHabitacionesMayorArea(areaMinima);

        // Mostrar información del garaje si existe
        if (casa.garaje != null) {
            System.out.println("\nDatos del garaje:");
            System.out.println(casa.garaje);
        } else {
            System.out.println("\nNo se ha agregado un garaje.");
        }

        scanner.close();
    }
}