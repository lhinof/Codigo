/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class NodoPro {
    private Proyecto pro;
    private NodoPro sig;

    public NodoPro(){
            sig = null;
    }

    public Proyecto getPro() {
        return pro;
    }

    public void setPro(Proyecto pro) {
        this.pro = pro;
    }

    public NodoPro getSig() {
        return sig;
    }

    public void setSig(NodoPro sig) {
        this.sig = sig;
    }
    
    
}
