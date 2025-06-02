/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class Disciplina {
    private String nombre;
    
    private LS_NormalEq equipos;

    public Disciplina() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LS_NormalEq getEquipos() {
        return equipos;
    }

    public void setEquipos(LS_NormalEq equipos) {
        this.equipos = equipos;
    }
    
    public void mostrar(){
        System.out.println("Disciplina: " + nombre);
        System.out.println("Equipos: ");
        equipos.mostrar();
    }
}
