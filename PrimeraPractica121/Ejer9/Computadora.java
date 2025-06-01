package ejercicio5;
import java.util.Scanner;
public class Computadora {
    private String tipodeMonitor, teclado,procesador;
    private String mouse,tarjetaMadre,parlantes;
    private int memoria_ram,memoria_rom;
    private boolean estado;
    public Computadora(){
        tipodeMonitor="";
        teclado="";
        procesador="";
        mouse="";
        tarjetaMadre="";
        parlantes="";
        estado=false;
        memoria_ram=0;
        memoria_rom=0;
    }
    public Computadora(boolean e,String m,String t,String p,String r,String tm,String par,int ram,int rom){
        this.tipodeMonitor=m;
        this.teclado=t;
        this.procesador=p;
        this.mouse=r;
        this.tarjetaMadre=tm;
        this.parlantes=par;
        this.memoria_ram=ram;
        this.memoria_rom=rom;
        this.estado=e;
    }
    public void mostrar(){
        System.out.println("monitor: "+tipodeMonitor);
        System.out.println("teclado: "+teclado);
        System.out.println("procesador: "+procesador);
        System.out.println("mouse: "+mouse);
        System.out.println("Tarjeta madre"+tarjetaMadre);
        System.out.println("parlantes: "+parlantes);
        System.out.println("RAM: "+memoria_ram+" gb");
        System.out.println("ROM: "+memoria_rom+" gb");
    }
    public void estado(){
        System.out.println(estado);
    }
    public void onnoff() throws InterruptedException {
        Scanner la =new Scanner(System.in);
        if(estado){
            System.out.println("encendido");
            System.out.println("¿apagar aquipo? s/n");
            String z=la.next();
            if(z.equals("s")){
                System.out.println("*****");
                Thread.sleep(1000);
                System.out.println("*****");
                Thread.sleep(1000);
                System.out.println("*****");
                Thread.sleep(1000);
                System.out.println("apagado");
            }

        }
        else{
            System.out.println("apagado");
            System.out.println("¿encender aquipo? s/n");
            String z=la.next();
            if(z.equals("s")){
                System.out.println("*****");
                Thread.sleep(1000);
                System.out.println("*****");
                Thread.sleep(1000);
                System.out.println("*****");
                Thread.sleep(1000);
                System.out.println("encendido");
                System.out.println("Bienvenido");
            }
        }
    }

}
