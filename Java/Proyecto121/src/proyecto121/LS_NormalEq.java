/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class LS_NormalEq extends ListaSimpleEq {

    public LS_NormalEq() {
        super();
    }
    
    public boolean esVacia() {
        if (P == null) {
            return true;
        }
        return false;
    }

    public int nroNodos() {
        NodoE R = P;
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
        NodoE R = P;
        while (R != null) {
            System.out.println("-----------");
            R.getEq().mostrar();
            R = R.getSig();
        }
    }

    public void adiFinal(Equipo z) {
        NodoE nuevo = new NodoE();
        nuevo.setEq(z);
        if (P == null) {
            P = nuevo;
        } else {
            NodoE R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public void adiPrincipio(Equipo z) {
        NodoE nuevo = new NodoE();
        nuevo.setEq(z);
        P = nuevo;
        nuevo.setSig(P);
        P = nuevo;
    }

    public NodoE eliFinal() {
        NodoE x = new NodoE();
        if (!esVacia()) {
            if (nroNodos() == 1) {
                x = P;      //x apunta a la raiz P
                P = null;
            } else {
                NodoE R = P;
                NodoE S = P;
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

    public NodoE eliPrincipio() {
        NodoE x = new NodoE();
        if (!esVacia()) {
            x = P;     // x apunta a la raiz P
            P = P.getSig();
            x.setSig(null);
        }
        return x;
    }
}
