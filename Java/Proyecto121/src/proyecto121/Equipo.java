/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class Equipo {
    private String nombre;
    private LS_NormalJu lisJugador;

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LS_NormalJu getLisJugador() {
        return lisJugador;
    }

    public void setLisJugador(LS_NormalJu lisJugador) {
        this.lisJugador = lisJugador;
    }
    
    public void mostrar(){
        System.out.println("Nombre del equipo: " + nombre);
        lisJugador.mostrar();
    }
}