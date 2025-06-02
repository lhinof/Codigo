/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class NodoMu {
    private Municipio mu;
    private NodoMu sig;

    public NodoMu() {
        sig = null;
    }

    public Municipio getMu() {
        return mu;
    }

    public void setMu(Municipio mu) {
        this.mu = mu;
    }

    public NodoMu getSig() {
        return sig;
    }

    public void setSig(NodoMu sig) {
        this.sig = sig;
    }
    
    
}
