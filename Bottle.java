/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bottle;

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
    
    
    public static void main(String[] args) {
        
        Bottle[] bottle = new Bottle[3]; //NULL
        
        for(int i = 0; i < bottle.length; i++){
        
        bottle[i] = new Bottle(i+2);
        
            System.out.println("W buletce " + i + " jest: " + bottle[i].howManyLiters() + " l.");
        }
        
        bottle[0].transfer(5, bottle[2]);
        System.out.println("Z butelki nr.0 przelewam 2 litry do butelki nr.2.");
        System.out.println("Bulelka nr. 0 ma: " + bottle[0].howManyLiters);
        System.out.println("Bulelka nr. 2 ma: " + bottle[2].howManyLiters);
        
    }  
    
}
