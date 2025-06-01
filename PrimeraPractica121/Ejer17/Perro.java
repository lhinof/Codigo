package ejercicio9;

public class Perro {
    private String nombre ,raza;
    private int edad;
    public Perro() {
        nombre="";
        raza="";
        edad=0;
    }
    public Perro(String n,String r,int e){
        this.nombre=n;
        this.raza=r;
        this.edad=e;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
