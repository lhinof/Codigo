package ejercicio9;

public class Pajaro {
    private String nombre,tipo;

    public Pajaro() {
        nombre="";
        tipo="";
    }
    public Pajaro(String nombre, String tipo) {
        this.nombre=nombre;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
