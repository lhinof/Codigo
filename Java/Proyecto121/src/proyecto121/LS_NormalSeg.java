/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class LS_NormalSeg extends ListaSimpleSeg{

    public boolean esVacia() {
        if (P == null) {
            return true;
        }
        return false;
    }

    public int nroNodos() {
        NodoSeg R = P;
        int c = 0;
        if (this.esVacia()) {
            return 0;
        } else {
            while (R != null) {
                c++;
                R = R.getSig();
            }
        }
        return c;
    }

    public void mostrar() {
        NodoSeg R = P;
        while (R != null) {
            R.getSeg().mostrar();
            R = R.getSig();
        }
    }

    public void adiFinal(Seguimiento z) {
        NodoSeg nuevo = new NodoSeg();
        nuevo.setSeg(z);
        if (P == null) {
            P = nuevo;
        } else {
            NodoSeg R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public void adiPrincipio(Seguimiento z) {
        NodoSeg nuevo = new NodoSeg();
        nuevo.setSeg(z);
        P = nuevo;
        nuevo.setSig(P);
        P = nuevo;
    }

    public NodoSeg eliFinal() {
        NodoSeg x = new NodoSeg();
        if (!esVacia()) {
            if (nroNodos() == 1) {
                x = P;      //x apunta a la raiz P
                P = null;
            } else {
                NodoSeg R = P;
                NodoSeg S = P;
                while (R.getSig() != null) {
                    S = R;         //S apunta a R
                    R = R.getSig(); //R apunta al siguiente de R
                }
                x = R;
                S.setSig(null);
            }
        }
        return x;
    }

    public NodoSeg eliPrincipio() {
        NodoSeg x = new NodoSeg();
        if (!esVacia()) {
            x = P;     // x apunta a la raiz P
            P = P.getSig();
            x.setSig(null);
        }
        return x;
    }
    
    public int sumaPuntos(LS_NormalPa a){
        
        
        return 0;
    }
}
