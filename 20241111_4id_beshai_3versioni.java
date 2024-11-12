/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class minapotenze {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la base: ");
        int base = scanner.nextInt();
        System.out.print("Inserisci l'esponente: ");
        int esponente = scanner.nextInt();
        minapotenze1 potenza = new minapotenze1();
        int risultato = potenza.calcolaPotenza(base,esponente);
        System.out.println(base + " elevato alla " + esponente + " è " + risultato);
        scanner.close();
        
       
    }

}