/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bottle;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author MateuszP
 */
public class Bottle {
    private double howManyLiters;
    
    
    Bottle(double howManyLiters ){
        this.howManyLiters = howManyLiters;
    }
    
    double howManyLiters(){
        return howManyLiters;
    }
    void add(double howMany){
        this.howManyLiters+=howMany;
    }
    boolean remove(double howMany){
        if(this.howManyLiters>=howMany){
            this.howManyLiters-=howMany;
        }
        else{
            System.out.println("Z pustego salomon nie naleje");
            return false;
        }
        return true;
    }
    void transfer(double howMany, Bottle where){
        if(this.remove(howMany)){
            where.add(howMany);
        }
    }
    
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        
//        bottle[0].transfer(2, bottle[2]);
//        System.out.println("Z butelki nr.0 przelewam 2 litry do butelki nr.2.");
//        System.out.println("Bulelka nr. 0 ma: " + bottle[0].howManyLiters);
//        System.out.println("Bulelka nr. 2 ma: " + bottle[2].howManyLiters);
        
        
int decision = 0;
        do{
            //MAIN MENU APP
            System.out.println("Witaj w sklepie z potionami. W czym mogę Ci pomóc?");
            System.out.println("1. Kup butelki");
            System.out.println("2. Uzupełnij butelki");
            System.out.println("3. Wylej");
            System.out.println("4. Przelej");
            System.out.println("9. Ekwipunek");
            System.out.println("");
            System.out.println("0. Wyjście");

            //User decision - HAVE TO CHANGE ON CHAR!!!!!!
            decision = sc.nextInt();
            
            //Switch Main Menu
            switch (decision){

                case 1:
                    //1. BUY BOTTLES
                    System.out.println("Ile butelek chcesz kupić?");
                    int bottleQuantityBuy = sc.nextInt();

                    //Create arr of bottles
                    Bottle[] bottle = new Bottle[bottleQuantityBuy]; //NULL

                    
                    //Create bottoles with 0 liters
                    for(int i = 0; i < bottle.length; i++){
                        bottle[i] = new Bottle(0);
                    }
                    
                    //Console log info of how many bottles you bought
                    System.out.println("Kupiłeś " + bottleQuantityBuy + "szt. pustych buletek.");
                    System.out.println("W sumie masz " + bottle.length + "szt. buletek.");
                    continue;
                
                case 2:
//                    System.out.println("W sumie masz " + bottle.length + "szt. buletek.");
                    
                case 0:
                    System.out.println("----------------");
                    System.out.println("Do widzenia");
                    
                
            }
        }while (decision !=0);
    }  
    
}
