package ejercicio6;

public class Videojuego {
    private String nombre,plataforma;
    private int cantidadJugadores;

    public Videojuego(){
        nombre="";
        plataforma="";
        cantidadJugadores=0;
    }
    public Videojuego(String n,String p,int cJ){
        this.nombre=n;
        this.plataforma=p;
        this.cantidadJugadores=cJ;
    }
    public void mostrar(){
        System.out.println("COMPUTADORA:");
        System.out.println("Nombre: "+nombre);
        System.out.println("Plataforma: "+plataforma);
        System.out.println("Cantidad de Jugadores: "+cantidadJugadores);
    }
    public void aumentar(){
        cantidadJugadores++;
    }
    public void aumentar(int x){
        cantidadJugadores+=x;
    }
}
