package ejercicio8;

public class Laboratorio {
    private String nombre;
    private int capacidad,nroMesas,nrosillas;

    public Laboratorio() {
        nombre="";
        capacidad=0;
        nroMesas=0;
        nrosillas=0;
    }
    public Laboratorio(String n,int c,int nM,int ns) {
        this.nombre=n;
        this.capacidad=c;
        this.nroMesas=nM;
        this.nrosillas=ns;
    }

    public int getNrosillas() {
        return nrosillas;
    }

    public void setNrosillas(int nrosillas) {
        this.nrosillas = nrosillas;
    }

    public int getNroMesas() {
        return nroMesas;
    }

    public void setNroMesas(int nroMesas) {
        this.nroMesas = nroMesas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
