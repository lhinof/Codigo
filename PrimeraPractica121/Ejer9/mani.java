package ejercicio5;

public class mani {
    public static void main(String []args) throws InterruptedException {
    Computadora a=new Computadora(true,"xiaomi","mecanico 100%","intel core i9","hp","MICRO-ATX","Edifier R1280T",16,500);
    Computadora b=new Computadora(false,"dell","mediacenter","ryzen 7","hp","FLEXATX","Edifier R1280T",32,256);
    a.mostrar();
    b.mostrar();
    a.onnoff();
    b.onnoff();
    b.estado();
    }
}