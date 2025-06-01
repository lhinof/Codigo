package ejercicio10;

public class BloqueTnt {
    private String tipo,danio;

    public BloqueTnt(){
        tipo="";
        danio="";
    }
    public BloqueTnt(String t,String d){
        this.tipo=t;
        this.danio=d;
    }

    public String getDanio() {
        return danio;
    }

    public void setDanio(String danio) {
        this.danio = danio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
