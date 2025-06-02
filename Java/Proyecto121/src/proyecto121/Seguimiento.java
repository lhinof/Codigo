/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class Seguimiento {
    private String nombre;
    private LS_NormalPa lisResPa;

    public Seguimiento() {
    }

    public Seguimiento(String nombre, LS_NormalPa lisResPa) {
        this.nombre = nombre;
        this.lisResPa = lisResPa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LS_NormalPa getLisResPa() {
        return lisResPa;
    }

    public void setLisRespa(LS_NormalPa lisResPa) {
        this.lisResPa = lisResPa;
    }
    
    public void mostrar(){
        System.out.println("Nombre del equipo: "+ nombre);
        lisResPa.mostrar();
    }
}
