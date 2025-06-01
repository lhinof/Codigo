package ejercicio9;

public class Gato {
    private String nombre,color;

    public Gato(){
        nombre="";
        color="";
    }
    public Gato(String n, String c) {
        this.nombre=n;
        this.color=c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
