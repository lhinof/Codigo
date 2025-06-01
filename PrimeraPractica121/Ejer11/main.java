package ejercicio6;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Videojuego A=new Videojuego("left4death","steam",10);
        Videojuego B=new Videojuego("repo","steam",9);
        A.mostrar();
        B.mostrar();
        A.aumentar();
        B.aumentar();
        A.aumentar(3);
        B.aumentar(5);
    }
}