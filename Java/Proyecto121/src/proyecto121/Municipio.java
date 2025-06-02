/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class Municipio {
    private String nombreMun;
    private LS_NormalDi lisDis;

    public Municipio() {
    }

    public Municipio(String nombreMun, LS_NormalDi lisDis) {
        this.nombreMun = nombreMun;
        this.lisDis = lisDis;
    }

    public String getNombreMun() {
        return nombreMun;
    }

    public void setNombreMun(String nombreMun) {
        this.nombreMun = nombreMun;
    }

    public LS_NormalDi getLisDis() {
        return lisDis;
    }

    public void setLisDis(LS_NormalDi lisDis) {
        this.lisDis = lisDis;
    }
    
    public void mostrar(){
        System.out.println("Nombre del Municipio: "+ nombreMun);
        if(lisDis != null){
            lisDis.mostrar();
        }else{
            System.out.println("lista vacia");
        }
    }
}
