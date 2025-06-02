/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class Proyecto {
    private String fechaInicio;
    private String estado;
    private double fondos;
    private String lugar;
    

    public Proyecto() {
    }

    public Proyecto(String fechaInicio, String estado, double fondos, String lugar) {
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.fondos = fondos;
        this.lugar = lugar;
    }
    
    

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getFondos() {
        return fondos;
    }

    public void setFondos(double fondos) {
        this.fondos = fondos;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
    public void mostrar(){
        System.out.println("Fecha de Inicio: "+ fechaInicio);
        
        System.out.println("Estado: "+ estado );
        System.out.println("Dinero destinado: " + fondos);
        System.out.println("Lugar a ejecutar el proyecto : " + lugar);
    }
    
}
