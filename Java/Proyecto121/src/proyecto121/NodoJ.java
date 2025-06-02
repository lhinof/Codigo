/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class NodoJ {
    private Jugador Ju;
    private NodoJ sig;

    public NodoJ() {
        sig=null;
    }

    public Jugador getJu() {
        return Ju;
    }

    public void setJu(Jugador Ju) {
        this.Ju = Ju;
    }

    public NodoJ getSig() {
        return sig;
    }

    public void setSig(NodoJ sig) {
        this.sig = sig;
    }
    
    
}
