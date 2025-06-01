package ejercicio2;
public class main {
    public static void main(String[] args) {
        Coche A= new Coche("susuki","xl7",15);
        Coche B= new Coche("ferrari","portofino",100);
        A.acelerar(3);
        B.acelerar(2);
        A.frenar(1);
        B.frenar(2);
        A.mostrar();
        B.mostrar();
    }
}