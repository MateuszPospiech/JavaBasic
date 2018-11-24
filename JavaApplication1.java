/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author MateuszP
 */
public class JavaApplication1 {
    
    public static int silnia(int wartosc) {
        // jeśli przekazany parametr jest równy zero to zwróć 1
        // a w przeciwnym wypadku zwróć wartość parametru * wywołanie metody silnia
        // z parametrem o jeden mniejszym
        if(wartosc == 0) return 1;
        else return wartosc * silnia(wartosc - 1);
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

System.out.println("Obliczanie silni" ); 
Scanner sc = new Scanner(System.in);
System.out.print("Podaj liczbę: " ); 
// pobieramy od użytkownika liczbę
int liczba = sc.nextInt(); 
// wyświetlamy na ekranie obliczoną silnię
System.out.println(liczba + "! = " + silnia(liczba));


System.out.println("Podaj drugi raz liczbe: ");
   int n = sc.nextInt();
   
   int wynik = 1;
    int i;
 for (i=1; i<=n; i++) {
     wynik*=i;
     
 }
        System.out.println(n + "! = " + wynik);

    }
    
}
