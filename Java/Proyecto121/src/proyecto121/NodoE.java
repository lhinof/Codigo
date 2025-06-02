/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class NodoE {
    private Equipo eq;
    private NodoE sig;

    public NodoE() {
        sig=null;
    }

    public Equipo getEq() {
        return eq;
    }

    public void setEq(Equipo eq) {
        this.eq = eq;
    }

    public NodoE getSig() {
        return sig;
    }

    public void setSig(NodoE sig) {
        this.sig = sig;
    }
    
    
}
