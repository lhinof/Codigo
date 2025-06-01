package ejercicio8;

public class Aula {
    private String nombre;
    private int capacidad,nroPupitres;

    public Aula() {
        nombre="";
        capacidad=0;
        nroPupitres=0;
    }
    public Aula(String n,int c,int nP) {
        this.nombre=n;
        this.capacidad=c;
        this.nroPupitres=nP;
    }

    public int getNroPupitres() {
        return nroPupitres;
    }

    public void setNroPupitres(int nroPupitres) {
        this.nroPupitres = nroPupitres;
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
