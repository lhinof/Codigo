/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto121;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Jugador ju1 = new Jugador();
        ju1.setNombre("brayan");
        ju1.setNumero("7");
        ju1.setCi("123");
        Jugador ju2 = new Jugador();
        ju2.setNombre("alex");
        ju2.setNumero("10");
        ju2.setCi("122");
        Jugador ju3 = new Jugador();
        ju3.setNombre("pepe");
        ju3.setNumero("3");
        ju3.setCi("133");

        Jugador ju4 = new Jugador();
        ju4.setNombre("brandon");
        ju4.setNumero("7");
        ju4.setCi("333");
        Jugador ju5 = new Jugador();
        ju5.setNombre("daniel");
        ju5.setNumero("11");
        ju5.setCi("444");
        Jugador ju6 = new Jugador();
        ju6.setNombre("luis");
        ju6.setNumero("5");
        ju6.setCi("555");

        Jugador ju7 = new Jugador();
        ju7.setNombre("iver");
        ju7.setNumero("7");
        ju7.setCi("666");
        Jugador ju8 = new Jugador();
        ju8.setNombre("javi");
        ju8.setNumero("1");
        ju8.setCi("777");
        Jugador ju9 = new Jugador();
        ju9.setNombre("eli");
        ju9.setNumero("10");
        ju9.setCi("888");

        LS_NormalJu lisJu1 = new LS_NormalJu();
        lisJu1.adiFinal(ju1);
        lisJu1.adiFinal(ju2);
        lisJu1.adiFinal(ju3);

        LS_NormalJu lisJu2 = new LS_NormalJu();
        lisJu2.adiFinal(ju4);
        lisJu2.adiFinal(ju5);
        lisJu2.adiFinal(ju6);

        LS_NormalJu lisJu3 = new LS_NormalJu();
        lisJu3.adiFinal(ju7);
        lisJu3.adiFinal(ju8);
        lisJu3.adiFinal(ju9);

        //lisJu1.mostrar();
        //lisJu2.mostrar();
        Equipo eq1 = new Equipo();
        eq1.setNombre("Real Sociedad");
        eq1.setLisJugador(lisJu1);

        Equipo eq2 = new Equipo();
        eq2.setNombre("Vengadores");
        eq2.setLisJugador(lisJu2);

        Equipo eq3 = new Equipo();
        eq3.setNombre("Alpha");
        eq3.setLisJugador(lisJu3);

        LS_NormalEq lisEq1 = new LS_NormalEq();
        lisEq1.adiFinal(eq1);
        lisEq1.adiFinal(eq2);
        LS_NormalEq lisEq2 = new LS_NormalEq();
        lisEq2.adiFinal(eq2);
        lisEq2.adiFinal(eq3);
        //lisEq.mostrar();

        Disciplina di1 = new Disciplina();
        di1.setNombre("FUTBOL");
        di1.setEquipos(lisEq1);

        Disciplina di2 = new Disciplina();
        di2.setNombre("WALLY");
        di2.setEquipos(lisEq2);

        LS_NormalDi lisDi = new LS_NormalDi();
        lisDi.adiFinal(di1);
        lisDi.adiFinal(di2);
        //lisDi.mostrar();

        Municipio m1, m2, m3;
        m1 = new Municipio("El Alto", lisDi);
        m2 = new Municipio("La Paz", lisDi);
        m3 = new Municipio("Viacha", lisDi);

        LS_NormalMu liMu = new LS_NormalMu();
        liMu.adiFinal(m1);
        liMu.adiFinal(m2);
        liMu.adiFinal(m3);
        //liMu.mostrar();

        LS_NormalEq lisFinEqFutbol = agruparEquipos(liMu, "FUTBOL");
        LS_NormalEq lisFinEqWally = agruparEquipos(liMu, "WALLY");
        
        //creando un ResultadoPartido Para la lista de ResultadoPartidos
        
        ResultadoPartido resuE1_1,resuE1_2,resuE1_3; 
        resuE1_1 = new ResultadoPartido();
        resuE1_2 = new ResultadoPartido();
        resuE1_3 = new ResultadoPartido();
        resuE1_1.setPuntos(3);
        resuE1_1.setFecha("1 de enero");
        resuE1_2.setPuntos(1);
        resuE1_2.setFecha("2 de enero");
        resuE1_3.setPuntos(0);
        resuE1_3.setFecha("3 de enero");
        
        ResultadoPartido resuE2_1,resuE2_2,resuE2_3; 
        resuE2_1 = new ResultadoPartido();
        resuE2_2 = new ResultadoPartido();
        resuE2_3 = new ResultadoPartido();
        resuE2_1.setPuntos(3);
        resuE2_1.setFecha("1 de enero");
        resuE2_2.setPuntos(3);
        resuE2_2.setFecha("2 de enero");
        resuE2_3.setPuntos(3);
        resuE2_3.setFecha("3 de enero");
        
        ResultadoPartido resuE3_1,resuE3_2,resuE3_3; 
        resuE3_1 = new ResultadoPartido();
        resuE3_2 = new ResultadoPartido();
        resuE3_3 = new ResultadoPartido();
        resuE3_1.setPuntos(0);
        resuE3_1.setFecha("1 de enero");
        resuE3_2.setPuntos(0);
        resuE3_2.setFecha("2 de enero");
        resuE3_3.setPuntos(0);
        resuE3_3.setFecha("3 de enero");
        
        ResultadoPartido resuE4_1,resuE4_2,resuE4_3; 
        resuE4_1 = new ResultadoPartido();
        resuE4_2 = new ResultadoPartido();
        resuE4_3 = new ResultadoPartido();
        resuE4_1.setPuntos(0);
        resuE4_1.setFecha("1 de enero");
        resuE4_2.setPuntos(1);
        resuE4_2.setFecha("2 de enero");
        resuE4_3.setPuntos(1);
        resuE4_3.setFecha("3 de enero");
        
        ResultadoPartido resuE5_1,resuE5_2,resuE5_3; 
        resuE5_1 = new ResultadoPartido();
        resuE5_2 = new ResultadoPartido();
        resuE5_3 = new ResultadoPartido();
        resuE5_1.setPuntos(1);
        resuE5_1.setFecha("1 de enero");
        resuE5_2.setPuntos(1);
        resuE5_2.setFecha("2 de enero");
        resuE5_3.setPuntos(1);
        resuE5_3.setFecha("3 de enero");
        
        ResultadoPartido resuE6_1,resuE6_2,resuE6_3; 
        resuE6_1 = new ResultadoPartido();
        resuE6_2 = new ResultadoPartido();
        resuE6_3 = new ResultadoPartido();
        resuE6_1.setPuntos(3);
        resuE6_1.setFecha("1 de enero");
        resuE6_2.setPuntos(1);
        resuE6_2.setFecha("2 de enero");
        resuE6_3.setPuntos(0);
        resuE6_3.setFecha("3 de enero");
        
        //agregar resultados a la lista
        
        LS_NormalPa lispa1 = new LS_NormalPa();
        lispa1.adiFinal(resuE1_1);
        lispa1.adiFinal(resuE1_2);
        lispa1.adiFinal(resuE1_3);
        
        LS_NormalPa lispa2 = new LS_NormalPa();
        lispa2.adiFinal(resuE2_1);
        lispa2.adiFinal(resuE2_2);
        lispa2.adiFinal(resuE2_3);
        
        LS_NormalPa lispa3 = new LS_NormalPa();
        lispa3.adiFinal(resuE3_1);
        lispa3.adiFinal(resuE3_2);
        lispa3.adiFinal(resuE3_3);
        
        LS_NormalPa lispa4 = new LS_NormalPa();
        lispa4.adiFinal(resuE4_1);
        lispa4.adiFinal(resuE4_2);
        lispa4.adiFinal(resuE4_3);
        
        LS_NormalPa lispa5 = new LS_NormalPa();
        lispa5.adiFinal(resuE5_1);
        lispa5.adiFinal(resuE5_2);
        lispa5.adiFinal(resuE5_3);
        
        LS_NormalPa lispa6 = new LS_NormalPa();
        lispa6.adiFinal(resuE6_1);
        lispa6.adiFinal(resuE6_2);
        lispa6.adiFinal(resuE6_3);
        
        //crear un objeto seguimiento 
        
        Seguimiento seg1,seg2,seg3,seg4,seg5,seg6;
        seg1=new Seguimiento();
        seg2=new Seguimiento();
        seg3=new Seguimiento();
        seg4=new Seguimiento();
        seg5=new Seguimiento();
        seg6=new Seguimiento();
        
        seg1.setNombre("Real Sociendad");
        seg1.setLisRespa(lispa1);
        seg2.setNombre("Vengadores");
        seg2.setLisRespa(lispa2);
        seg3.setNombre("Real Sociendad");
        seg3.setLisRespa(lispa3);
        seg4.setNombre("Vengadores");
        seg4.setLisRespa(lispa3);
        seg5.setNombre("Real Sociendad");
        seg5.setLisRespa(lispa3);
        seg6.setNombre("Vengadores");
        seg6.setLisRespa(lispa3);
        
        //llenar la lista de Seguimientos de los partidos
        
        LS_NormalSeg lisSeg = new LS_NormalSeg();
        lisSeg.adiFinal(seg1);
        lisSeg.adiFinal(seg2);
        lisSeg.adiFinal(seg3);
        lisSeg.adiFinal(seg4);
        lisSeg.adiFinal(seg5);
        lisSeg.adiFinal(seg6);
        
        
        
        Torneo torFut = new Torneo();
        torFut.setNombreTorneo(" Torneo de Informatica ");
        torFut.setLisMu(lisFinEqFutbol);
        torFut.setLisSeg(lisSeg);
        
//        Torneo torWally = new Torneo();
//        torWally.setNombreTorneo(" Torneo de Estadistica ");
//        torWally.setLisMu(lisFinEqWally);
        
        LS_NormalTor lisTor = new LS_NormalTor();
        lisTor.adiFinal(torFut);
        lisTor.mostrar();
   
        // Verificavion de jugadores por equipo
        int maxJugadores = 5; 
        boolean limiteSuperado = false;

        // Futbol
        for (Equipo equipo : lisFinEqFutbol) {
            if (equipo.getLisJugador().nroNodos() > maxJugadores) {
                System.out.println("El equipo " + equipo.getNombre() + " tiene más de " + maxJugadores + " jugadores.");
                limiteSuperado = true;
            }
        }

        // Wally
        for (Equipo equipo : lisFinEqWally) {
            if (equipo.getLisJugador().nroNodos() > maxJugadores) {
                System.out.println("El equipo " + equipo.getNombre() + " tiene más de " + maxJugadores + " jugadores.");
                limiteSuperado = true;
            }
        }

        if (limiteSuperado) {
            System.out.println("Se superó el límite de jugadores. Deteniendo ejecución.");
            System.exit(0);
        }
        
        
    }

    static LS_NormalEq agruparEquipos(LS_NormalMu liMu, String disciplina) {
        LS_NormalEq listaFinal = new LS_NormalEq(); // Lista donde se guardarán los equipos agrupados
        NodoMu NodoMu = liMu.getP(); // Nodo inicial de la lista de municipios

        while (NodoMu != null) {
            Municipio municipio = NodoMu.getMu(); // Obtén el municipio actual
            LS_NormalDi lisDis = municipio.getLisDis(); // Obtén las disciplinas del municipio
            NodoD nodoDisciplina = lisDis.getP(); // Nodo inicial de las disciplinas

            while (nodoDisciplina != null) {
                Disciplina disciplinaActual = nodoDisciplina.getDis(); // Obtén la disciplina actual
                if (disciplinaActual.getNombre().equalsIgnoreCase(disciplina)) { // Compara el nombre de la disciplina
                    LS_NormalEq listaEquipos = disciplinaActual.getEquipos(); // Obtén los equipos de esta disciplina
                    NodoE nodoEquipo = listaEquipos.getP(); // Nodo inicial de los equipos

                    while (nodoEquipo != null) {
                        Equipo equipo = nodoEquipo.getEq(); // Obtén el equipo actual
                        listaFinal.adiFinal(equipo); // Añádelo a la lista final
                        nodoEquipo = nodoEquipo.getSig(); // Avanza al siguiente equipo
                    }
                }
                nodoDisciplina = nodoDisciplina.getSig(); // Avanza a la siguiente disciplina
            }
            NodoMu = NodoMu.getSig(); // Avanza al siguiente municipio
        }

        return listaFinal;
    }

}