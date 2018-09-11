/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.util.Scanner;

/**
 *
 * @author Wanderley
 */
public class Car {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Carro carr = new Carro(0,0,0);
        boolean fim = true;
        while(fim){
            String receb = input.nextLine();
            
            switch(receb){
                case "show":
                    carr.show();
                    break;
                case "in" :
                    System.out.println(carr.in());
                    break;
                case "out":
                    System.out.println(carr.out());
                    break;
                case "drive":
                   System.out.print("digite sua kilometragem: ");
                    int km = input.nextInt();
                    System.out.println(carr.drive(km));
                    break;
                case "fuel":
                    System.out.print("digite seu valor: ");
                    int gas = input.nextInt();
                    System.out.println(carr.fuel(gas));
                    break;
                case "end":
                    fim = false;
                           
                
        }
            
        }
    }
    
}
