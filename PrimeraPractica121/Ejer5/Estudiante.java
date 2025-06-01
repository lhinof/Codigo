package ejercicio3;
public class Estudiante {
    private String nombre;
    private int nota_1,nota_2;
    public Estudiante(){
        nombre=" ";
        nota_1=0;
        nota_2=0;
    }
    public Estudiante(String n, int n1, int n2){
        this.nombre=n;
        this.nota_1=n1;
        this.nota_2=n2;
    }
    public int promedio(){
        int y=(nota_1+nota_2)/2;
        return y;
    }
    public String aprobar(int y){
        if(y>=6){
            return " aprobo";
        }
        else{return " reprobo"; }
    }
    public void mostrar(){
        System.out.println("el estudiante "+nombre+" tiene de promedio : "+promedio()+aprobar(promedio()));
    }
}
