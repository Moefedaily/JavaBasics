package Exo3;

import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un nombre pour afficher sa table de multiplication: ");
        int nombre = scanner.nextInt();
        
        System.out.println("\nTable de multiplication de " + nombre + ":");
        System.out.println("================================");
        
        for (int i = 1; i <= 10; i++) {
            int resultat = nombre * i;
            System.out.println(nombre + " x " + i + " = " + resultat);
        }
        System.out.println("================================");
        
        scanner.close();
    }
    
}


 