/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class LS_NormalMu extends ListaSimpleMu{
    public LS_NormalMu() {
        super();
    }
    
    

    public boolean esVacia() {
        if (P == null) {
            return true;
        }
        return false;
    }

    public int nroNodos() {
        NodoMu R = P;
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
        NodoMu R = P;
        while (R != null) {
            R.getMu().mostrar();
            R = R.getSig();
        }
    }

    public void adiFinal(Municipio z) {
        NodoMu nuevo = new NodoMu();
        nuevo.setMu(z);
        if (P == null) {
            P = nuevo;
        } else {
            NodoMu R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public void adiPrincipio(Municipio z) {
        NodoMu nuevo = new NodoMu();
        nuevo.setMu(z);
        P = nuevo;
        nuevo.setSig(P);
        P = nuevo;
    }

    public NodoMu eliFinal() {
        NodoMu x = new NodoMu();
        if (!esVacia()) {
            if (nroNodos() == 1) {
                x = P;      //x apunta a la raiz P
                P = null;
            } else {
                NodoMu R = P;
                NodoMu S = P;
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

    public NodoMu eliPrincipio() {
        NodoMu x = new NodoMu();
        if (!esVacia()) {
            x = P;     // x apunta a la raiz P
            P = P.getSig();
            x.setSig(null);
        }
        return x;
    }
}
