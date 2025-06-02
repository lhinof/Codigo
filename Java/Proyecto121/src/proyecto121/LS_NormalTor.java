/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class LS_NormalTor extends ListaSimpleTor {

    public LS_NormalTor() {
        super();
    }

    public boolean esVacia() {
        if (P == null) {
            return true;
        }
        return false;
    }

    public int nroNodos() {
        NodoT R = P;
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
        NodoT R = P;
        while (R != null) {
            R.getTor().mostrar();
            R = R.getSig();
        }
    }

    public void adiFinal(Torneo z) {
        NodoT nuevo = new NodoT();
        nuevo.setTor(z);
        if (P == null) {
            P = nuevo;
        } else {
            NodoT R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public void adiPrincipio(Torneo z) {
        NodoT nuevo = new NodoT();
        nuevo.setTor(z);
        P = nuevo;
        nuevo.setSig(P);
        P = nuevo;
    }

    public NodoT eliFinal() {
        NodoT x = new NodoT();
        if (!esVacia()) {
            if (nroNodos() == 1) {
                x = P;      //x apunta a la raiz P
                P = null;
            } else {
                NodoT R = P;
                NodoT S = P;
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

    public NodoT eliPrincipio() {
        NodoT x = new NodoT();
        if (!esVacia()) {
            x = P;     // x apunta a la raiz P
            P = P.getSig();
            x.setSig(null);
        }
        return x;
    }    
}
