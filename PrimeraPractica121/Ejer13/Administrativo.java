package ejercicio7;

public class Administrativo {
    private String nombre,cargo;
    private float sueldoMes;
    public Administrativo(){
        nombre="";
        cargo="";
        sueldoMes=0;
    }
    public Administrativo(String n, String c, float sm) {
        this.nombre=n;
        this.cargo=c;
        this.sueldoMes=sm;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSueldoMes() {
        return sueldoMes;
    }

    public void setSueldoMes(float sueldoMes) {
        this.sueldoMes = sueldoMes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
