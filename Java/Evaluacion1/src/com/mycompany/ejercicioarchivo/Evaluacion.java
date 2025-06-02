package com.mycompany.ejercicioarchivo;
import java.io.Serializable;
import java.util.Scanner;

public class Evaluacion implements Serializable {
    private String nom, pat, mat;
    private int primerParcial, segundoParcial, examenFinal, auxiliatura, practicas;

    public Evaluacion() {}

    public Evaluacion(String nom, String pat, String mat, int p1, int p2, int ef, int aux, int prac) {
        this.nom = nom;
        this.pat = pat;
        this.mat = mat;
        this.primerParcial = p1;
        this.segundoParcial = p2;
        this.examenFinal = ef;
        this.auxiliatura = aux;
        this.practicas = prac;
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nom: ");
        nom = sc.nextLine();
        System.out.print("pat: ");
        pat = sc.nextLine();
        System.out.print("mat: ");
        mat = sc.nextLine();
        System.out.print("primerParcial: ");
        primerParcial = sc.nextInt();
        System.out.print("segundoParcial: ");
        segundoParcial = sc.nextInt();
        System.out.print("examenFinal: ");
        examenFinal = sc.nextInt();
        System.out.print("auxiliatura: ");
        auxiliatura = sc.nextInt();
        System.out.print("practicas: ");
        practicas = sc.nextInt();
    }

    public void mostrar() {
        System.out.printf("%-10s %-10s %-10s %-3d %-3d %-3d %-3d %-3d %-3d\n",
                nom, pat, mat, primerParcial, segundoParcial, examenFinal, auxiliatura, practicas, notaTotal());
    }
    public void mostrarNotaTotal() {
        System.out.printf("%s %s %s ---> %d\n", nom, pat, mat, notaTotal());
    }

    public int notaTotal() {
        return primerParcial + segundoParcial + examenFinal + auxiliatura + practicas;
    }

    public boolean estaAprobado() {
        return notaTotal() >= 51;
    }

    public String getNom() {
        return nom;
    }
    
}
