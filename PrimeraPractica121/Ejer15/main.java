package ejercicio8;

public class main {
    public static void main(String[] args) {
        Oficina o1= new Oficina(12,6,3);
        Oficina o2= new Oficina(6,6,2);
        Aula a1=new Aula("5to c",40,20);
        Aula a2=new Aula("6to c",30,15);
        Laboratorio l1=new Laboratorio("quimica1",50,4,45);
        mostrar(o1);
        mostrar(l1);
        mostrar(a1);
        cantidadMuebles(o1);
        cantidadMuebles(l1);
        cantidadMuebles(a1);


    }
    private static void cantidadMuebles(Oficina a) {
        int y=a.getNroescritorios()+a.getNroEstanterias()+a.getNroSillas();
        System.out.println("la cantidad de muebles es: "+y);
    }
    private static void cantidadMuebles(Laboratorio a) {
        int y=a.getNroMesas()+a.getNrosillas();
        System.out.println("la cantidad de muebles es: "+y);
    }

    private static void cantidadMuebles(Aula a) {
        int y=a.getNroPupitres();
        System.out.println("la cantidad de muebles es: "+y);
    }

    public static void mostrar(Aula x) {
        System.out.println("Nombre: "+x.getNombre());
        System.out.println("Capacidad: "+x.getCapacidad());
        System.out.println("Nro Pupitres: "+x.getNroPupitres());
    }
    public static void mostrar(Laboratorio x) {
        System.out.println("Nombre: "+x.getNombre());
        System.out.println("Capacidad: "+x.getCapacidad());
        System.out.println("Nro Mesas: "+x.getNroMesas());
        System.out.println("Nro Sillas: "+x.getNrosillas());
    }
    public static void mostrar(Oficina x){
        System.out.println("Nro Sillas: "+x.getNroSillas());
        System.out.println("Nro escritorios: "+x.getNroescritorios());
        System.out.println("Nro Estanterias: "+x.getNroEstanterias());
    }
}
