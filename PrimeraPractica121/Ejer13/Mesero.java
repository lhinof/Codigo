package ejercicio7;

public class Mesero {
    private String nombre;
    private int sueldoMes,horasExtra;
    private float sueldoHora,propina;
    public Mesero(){
        nombre="";
        sueldoMes=0;
        horasExtra=0;
        sueldoHora=0;
        propina=0;
    }
    public Mesero(String n,int m,int he,float sh,float p){
        this.nombre=n;
        this.sueldoMes=m;
        this.horasExtra=he;
        this.sueldoHora=sh;
        this.propina=p;
    }

    public float getPropina() {
        return propina;
    }

    public void setPropina(float propina) {
        this.propina = propina;
    }

    public int getSueldoMes() {
        return sueldoMes;
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
