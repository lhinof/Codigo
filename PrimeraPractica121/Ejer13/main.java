package ejercicio7;

public class main {
 public static void main(String[] args) {
     Cocinero c1=new Cocinero("Carla",4000,7,46.56F);
     Mesero m1=new Mesero("Andres",500,3,15, 13.50F);
     Mesero m2=new Mesero("Juan",600,14,10.02F,24.56F);
     Administrativo a1=new Administrativo("Carlos","gerente",7000F);
     Administrativo a2=new Administrativo("Santiago","secretario",1300.09F);
     sueldoTotal(a2);
     sueldoTotal(c1.getSueldoMes(),c1.getHorasExtra());
     sueldoTotal(m1.getSueldoMes(),m1.getHorasExtra(),m1.getPropina());
     sueldox(500,m1.getSueldoMes());
     sueldox(600,m2.getSueldoMes(), a1.getSueldoMes());
 }
    public static void sueldoTotal(int x,int y){
        y=y*5;
        x=x+y;
        System.out.println(x);
    }
    public static void sueldoTotal(int x,int y,float z){
      x+= (int) (z+ y*5);
      System.out.println(x);
    }
    public static void sueldoTotal(Administrativo x){
     System.out.println(x.getSueldoMes());
    }
    public static void sueldox(int x,int y){
     if(y==x){
         System.out.println("si es igual");
     }
     else{
         System.out.println("no es igual");
     }
    }
    public static void sueldox(int x,int y,float z){
        if(y==x){
            System.out.println("si es igual");
        }
        else{
            System.out.println("no es igual");
        }
        if(z==x){
            System.out.println("si es igual");
        }
        else{
            System.out.println("no es igual");
        }
    }
}
