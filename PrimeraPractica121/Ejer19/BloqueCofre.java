package ejercicio10;

public class BloqueCofre {
    private int resistencia,capacidad ;
    private String tipo;
    public BloqueCofre() {
        resistencia = 0;
        capacidad = 0;
        tipo = "";
    }
    public BloqueCofre(int r, int c, String t) {
        this.resistencia = r;
        this.capacidad = c;
        this.tipo = t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

}
