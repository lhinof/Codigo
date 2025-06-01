package ejercicio4;
public class Celular {
    private String modelo;
    private double bateria;
    private int espacio[]=new int[20];
    public Celular(String m, double b) {
        this.modelo = m;
        this.bateria=b;
        for(int i=0;i<20;i++){
            this.espacio[i]=0;
        }

    }
    public Celular(){
        modelo="";
        bateria=100;
        for(int i=0;i<20;i++){
            espacio[i]=0;
        }
    }
    public void instalar(int x){
        int sw=0;int i=0;
        while (sw==0 && i<20){
            if(espacio[i]==0){
                espacio[i]=x;
                sw=1;
            }
            else{ i=i+1;}
        }
    }
    public void usar(int n,int t){
        if (n >= 0 && n < 20) {
        if(espacio[n]<=100){
            double z=t*0.1;
            bateria=bateria-z;
        }
        else{
            if(espacio[n]<=250){
                double z=t*0.2;
                bateria=bateria-z;
            }
            else{double z=t*0.5;bateria=bateria-z;}
        }}
    }
    public void mostrarb(){
        System.out.println(bateria);
    }
    public void on(){
        if(bateria>0){
            System.out.println("encendido");
        }
        else{System.out.println("apagado");}
    }
}
