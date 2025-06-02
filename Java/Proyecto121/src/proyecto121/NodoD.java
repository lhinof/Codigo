/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class NodoD {
    private Disciplina dis;
    private NodoD sig;

    public NodoD() {
        sig = null;
    }

    public Disciplina getDis() {
        return dis;
    }

    public void setDis(Disciplina dis) {
        this.dis = dis;
    }

    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }
    
    
}
