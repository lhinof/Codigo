/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class NodoSeg {
    private Seguimiento seg;
    private NodoSeg sig;

    public NodoSeg() {
        sig = null;
    }

    public Seguimiento getSeg() {
        return seg;
    }

    public void setSeg(Seguimiento seg) {
        this.seg = seg;
    }

    public NodoSeg getSig() {
        return sig;
    }

    public void setSig(NodoSeg sig) {
        this.sig = sig;
    }
    
    
}
