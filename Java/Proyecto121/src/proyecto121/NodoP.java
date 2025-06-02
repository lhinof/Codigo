/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class NodoP {
    private ResultadoPartido  resuPar;
    private NodoP sig;

    public NodoP() {
        sig = null;
    }

    public ResultadoPartido getResuPar() {
        return resuPar;
    }

    public void setResuPar(ResultadoPartido resuPar) {
        this.resuPar = resuPar;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }
    
    
}
