/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class NodoT {
    private Torneo tor;
    private NodoT sig;

    public NodoT() {
        sig=null;
    }

    public Torneo getTor() {
        return tor;
    }

    public void setTor(Torneo tor) {
        this.tor = tor;
    }

    public NodoT getSig() {
        return sig;
    }

    public void setSig(NodoT sig) {
        this.sig = sig;
    }
    
    
}
