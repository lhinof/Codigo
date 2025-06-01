package ejercicio10;

public class main {
    public static void main(String[] args) {
        BloqueTnt t1=new BloqueTnt("nuclear","1 chunk");
        BloqueTnt t1= new BloqueTnt("diamantito","100 bloques");
        BloqueCofre c1=new BloqueCofre(3,32,"pequeño");
        BloqueCofre c2=new BloqueCofre(5,64,"grande");
        BloqueHorno h1=new BloqueHorno("plomo",1 );
        BloqueHorno h2=new BloqueHorno("redstone",3);
        accion(t1);
        accion(c1);
        accion(h1);
        romper(t1);
        romper(c1);
        romper(h1);
        colocar("pared",t1.getDanio());
        colocar(h1);



    }
    public static void accion(BloqueHorno x){
        System.out.println("cocina: "+x.getCapacidadComida()+" pollos");
    }
    public static void accion(BloqueCofre x){
        System.out.println("se rompre y tira: "+x.getCapacidad()+" Stacks de carbon");
    }
    public static void accion(BloqueTnt x){
        System.out.println("explota y daña: "+x.getDanio()+" Bloques de la casa de Luis");
    }
    public static void romper(BloqueHorno x){
        System.out.println("se rompe y tira la comida");
    }
    public static void romper(BloqueCofre x){
        System.out.println("se rompe y exparse todo su contenido");
    }
    public static void romper(BloqueTnt x){
        System.out.println("se rompe y se desancla y flota su item);
    }
    public static void colocar(String x,String y){
        System.out.println("coloca en bloque en "+x+"explota y daña: "+y+" bloques");
    }
    public static void colocar(BloqueHorno x){
        System.out.println("coloca en bloque en la pared y lo llena con "+x.getCapacidadComida()+" de pollo");
    }

}
