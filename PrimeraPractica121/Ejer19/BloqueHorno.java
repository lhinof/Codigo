package ejercicio10;

public class BloqueHorno {
    private String color;
    private int capacidadComida;
    public BloqueHorno() {
        color="";
        capacidadComida=0;
    }
    public BloqueHorno(String color, int capacidadComida) {
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    public int getCapacidadComida() {
        return capacidadComida;
    }

    public void setCapacidadComida(int capacidadComida) {
        this.capacidadComida = capacidadComida;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
