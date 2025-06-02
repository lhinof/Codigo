/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class LS_NormalPa extends ListaSimplePa{

    public LS_NormalPa() {
        super();
    }

    public boolean esVacia() {
        if (P == null) {
            return true;
        }
        return false;
    }

    public int nroNodos() {
        NodoP R = P;
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
        NodoP R = P;
        while (R != null) {
            System.out.println("----------------------------");
            R.getResuPar().mostrar();
            R = R.getSig();
        }
    }

    public void adiFinal(ResultadoPartido z) {
        NodoP nuevo = new NodoP();
        nuevo.setResuPar(z);
        if (P == null) {
            P = nuevo;
        } else {
            NodoP R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public void adiPrincipio(ResultadoPartido z) {
        NodoP nuevo = new NodoP();
        nuevo.setResuPar(z);
        P = nuevo;
        nuevo.setSig(P);
        P = nuevo;
    }

    public NodoP eliFinal() {
        NodoP x = new NodoP();
        if (!esVacia()) {
            if (nroNodos() == 1) {
                x = P;      //x apunta a la raiz P
                P = null;
            } else {
                NodoP R = P;
                NodoP S = P;
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

    public NodoP eliPrincipio() {
        NodoP x = new NodoP();
        if (!esVacia()) {
            x = P;     // x apunta a la raiz P
            P = P.getSig();
            x.setSig(null);
        }
        return x;
    }
    
}
