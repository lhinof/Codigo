/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class ResultadoPartido {
    private int puntos;
    private String fecha;

    public ResultadoPartido() {
    }

    public ResultadoPartido(int puntos, String fecha) {
        this.puntos = puntos;
        this.fecha = fecha;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void mostrar(){
        System.out.println("Resultados Partidos: ");
        System.out.println("Puntos del partido... " + puntos);
        System.out.println("Fecha del partido... "+ fecha );
    }
}
