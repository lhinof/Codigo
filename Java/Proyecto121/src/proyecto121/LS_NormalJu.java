/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class LS_NormalJu extends ListaSimpleJu{

    public LS_NormalJu() {
        super();
    }
    
    

    public boolean esVacia() {
        if (P == null) {
            return true;
        }
        return false;
    }

    public int nroNodos() {
        NodoJ R = P;
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
        NodoJ R = P;
        while (R != null) {
            R.getJu().mostrar();
            R = R.getSig();
        }
    }

    public void adiFinal(Jugador z) {
        NodoJ nuevo = new NodoJ();
        nuevo.setJu(z);
        if (P == null) {
            P = nuevo;
        } else {
            NodoJ R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public void adiPrincipio(Jugador z) {
        NodoJ nuevo = new NodoJ();
        nuevo.setJu(z);
        P = nuevo;
        nuevo.setSig(P);
        P = nuevo;
    }

    public NodoJ eliFinal() {
        NodoJ x = new NodoJ();
        if (!esVacia()) {
            if (nroNodos() == 1) {
                x = P;      //x apunta a la raiz P
                P = null;
            } else {
                NodoJ R = P;
                NodoJ S = P;
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

    public NodoJ eliPrincipio() {
        NodoJ x = new NodoJ();
        if (!esVacia()) {
            x = P;     // x apunta a la raiz P
            P = P.getSig();
            x.setSig(null);
        }
        return x;
    }
}
