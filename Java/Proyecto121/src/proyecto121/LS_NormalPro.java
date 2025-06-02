/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class LS_NormalPro extends ListaSimplePro {
    public LS_NormalPro() {
        super();
    }

    public boolean esVacia() {
        if (P == null) {
            return true;
        }
        return false;
    }

    public int nroNodos() {
        NodoPro R = P;
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
        NodoPro R = P;
        while (R != null) {
            System.out.println("----------------------------");
            R.getPro().mostrar();
            R = R.getSig();
        }
    }

    public void adiFinal(Proyecto z) {
        NodoPro nuevo = new NodoPro();
        nuevo.setPro(z);
        if (P == null) {
            P = nuevo;
        } else {
            NodoPro R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public void adiPrincipio(Proyecto z) {
        NodoPro nuevo = new NodoPro();
        nuevo.setPro(z);
        P = nuevo;
        nuevo.setSig(P);
        P = nuevo;
    }

    public NodoPro eliFinal() {
        NodoPro x = new NodoPro();
        if (!esVacia()) {
            if (nroNodos() == 1) {
                x = P;      //x apunta a la raiz P
                P = null;
            } else {
                NodoPro R = P;
                NodoPro S = P;
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

    public NodoPro eliPrincipio() {
        NodoPro x = new NodoPro();
        if (!esVacia()) {
            x = P;     // x apunta a la raiz P
            P = P.getSig();
            x.setSig(null);
        }
        return x;
    }
}
