package ejercicio8;

public class Oficina {
    private int nroSillas,nroescritorios,nroEstanterias;

    public Oficina() {
        nroSillas=0;
        nroescritorios=0;
        nroEstanterias=0;
    }
    public Oficina(int ns,int ne,int nE){
        this.nroSillas=ns;
        this.nroescritorios=ne;
        this.nroEstanterias=nE;
    }

    public int getNroEstanterias() {
        return nroEstanterias;
    }

    public void setNroEstanterias(int nroEstanterias) {
        this.nroEstanterias = nroEstanterias;
    }

    public int getNroescritorios() {
        return nroescritorios;
    }

    public void setNroescritorios(int nroescritorios) {
        this.nroescritorios = nroescritorios;
    }

    public int getNroSillas() {
        return nroSillas;
    }

    public void setNroSillas(int nroSillas) {
        this.nroSillas = nroSillas;
    }
}
