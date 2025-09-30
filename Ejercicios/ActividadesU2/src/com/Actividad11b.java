package com;
import java.util.*;

public class Actividad11b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique su nota (0 a 10):");
        double nota = sc.nextDouble();

        if (nota >= 0 && nota < 5) {
            System.out.println("Su nota es insuficiente");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Su nota es suficiente");
        } else if (nota >= 6 && nota< 7) {
            System.out.println("Su nota es bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Su nota es notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Su nota es sobresaliente");
        } else {
            System.out.println("Nota inválida");
        }
        sc.close();
    }
}