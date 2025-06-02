/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class Torneo {
    private String nombreTorneo;
    private LS_NormalEq lisEq;
    private LS_NormalSeg lisSeg;

    public Torneo() {
    }

    public Torneo(String nombreTorneo, LS_NormalEq lisEq, LS_NormalSeg lisSeg) {
        this.nombreTorneo = nombreTorneo;
        this.lisEq = lisEq;
        this.lisSeg = lisSeg;
    }

    public LS_NormalSeg getLisSeg() {
        return lisSeg;
    }

    public void setLisSeg(LS_NormalSeg lisSeg) {
        this.lisSeg = lisSeg;
    }

    

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public LS_NormalEq getLisMu() {
        return lisEq;
    }

    public void setLisMu(LS_NormalEq lisEq) {
        this.lisEq = lisEq;
    }
    
    public void mostrar(){
        System.out.println("Nombre Del Torneo: "+ nombreTorneo);
        lisEq.mostrar();
        lisSeg.mostrar();
    }
}
