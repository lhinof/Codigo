package ejercicio7;

public class Cocinero {
    private String nombre;
    private int sueldoMes,horasExtra;
    private float sueldoHora;
    public Cocinero(){
        nombre="";
        sueldoMes=0;
        horasExtra=0;
        sueldoHora=0;
    }
    public Cocinero(String n,int m,int he,float sh) {
        this.nombre = n;
        this.sueldoMes = m;
        this.horasExtra = he;
        this.sueldoHora = sh;
    }
    public float getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(float sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getSueldoMes() {
        return sueldoMes;
    }

    public void setSueldoMes(int sueldoMes) {
        this.sueldoMes = sueldoMes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
