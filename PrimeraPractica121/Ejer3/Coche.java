package ejercicio2;

public class Coche {
    private String marca ,modelo;
    private int velocidad;
    public Coche(String ma, String m, int v) {
        this.marca = ma;
        this.modelo = m;
        this.velocidad = v;
    }
    public Coche(){
        marca="";
        modelo="";
        velocidad=0;
    }
    public void acelerar(int x){
        int y=10*x;
        velocidad=velocidad+y;
    }
    public void frenar(int x){
        int y=5*x;
        velocidad=velocidad-y;
    }
    public void mostrar(){
        System.out.println("la velocidad de "+modelo+" es "+velocidad );
    }
}