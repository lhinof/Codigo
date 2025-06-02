/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class LS_NormalDi extends ListaSimpleDi {

    public LS_NormalDi() {
        super();
    }
    public boolean esVacia() {
        if (P == null) {
            return true;
        }
        return false;
    }

    public int nroNodos() {
        NodoD R = P;
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
        NodoD R = P;
        while (R != null) {
            System.out.println("----------------------------");
            R.getDis().mostrar();
            R = R.getSig();
        }
    }

    public void adiFinal(Disciplina z) {
        NodoD nuevo = new NodoD();
        nuevo.setDis(z);
        if (P == null) {
            P = nuevo;
        } else {
            NodoD R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public void adiPrincipio(Disciplina z) {
        NodoD nuevo = new NodoD();
        nuevo.setDis(z);
        P = nuevo;
        nuevo.setSig(P);
        P = nuevo;
    }

    public NodoD eliFinal() {
        NodoD x = new NodoD();
        if (!esVacia()) {
            if (nroNodos() == 1) {
                x = P;      //x apunta a la raiz P
                P = null;
            } else {
                NodoD R = P;
                NodoD S = P;
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

    public NodoD eliPrincipio() {
        NodoD x = new NodoD();
        if (!esVacia()) {
            x = P;     // x apunta a la raiz P
            P = P.getSig();
            x.setSig(null);
        }
        return x;
    }

}
