package ejercicio9;

public class main {
    public static void main(String[] args) {
        Perro p1=new Perro("rambo","husky",5);
        Gato g1=new Gato("tomas","blanco");
        Pajaro pa1=new Pajaro("suma","colibri");

        hacerSonido(g1);
        hacerSonido(pa1);
        hacerSonido(p1);
        moverse(g1);
        moverse(pa1);
        moverse(p1);
    }
    public static void hacerSonido(Perro x){
        System.out.println(x.getNombre()+" hace: ¡¡guau!!");
    }
    public static void hacerSonido(Gato x){
        System.out.println(x.getNombre()+" hace: ¡¡miau!!");
    }
    public static void hacerSonido(Pajaro x){
        System.out.println(x.getNombre()+" hace: ¡¡coco!!,¡¡coco!!");
    }
    public static void moverse(Perro x){
        System.out.println(x.getNombre()+" corre");
    }
    public static void moverse(Gato x){
        System.out.println(x.getNombre()+" camina,te ve ,te lame");
    }
    public static void moverse(Pajaro x){
        System.out.println(x.getNombre()+" vuela");
    }
}
