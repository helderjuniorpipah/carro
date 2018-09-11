/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Wanderley
 */
public class Carro {
    public double gas;
    public int pass;
    public double km;

    public Carro( double gas, int pass, double km) {
        this.gas = gas;
        this.pass = pass;
        this.km = km;


    }

    public String in () {
        if ( pass < 2){     
            pass += 1;
            return "sucess";
        }else{
            return "numero de passageiro maior que o suficiente";
        }

    }
    public String out() {
        if (pass > 0){
            pass -= 1;
            return "sucess";
        }else{
            return "nao ha ninguem no carro";
        }

    }
    public String fuel(int comb) {
        if (gas + comb > 10){
            gas = 10;
        }else {
            gas += comb;
        }
        return "sucess";
        

    }
    public String drive(int km) {
        if( pass == 0){
            return "nao ha ninguem no carro";
        }else if (km/10 <= gas){
            gas -= km/10;
            this.km += km;
            return "sucess";
        }else{
            return "gasolina insuficiente";
        }
        
                      

    }
    public void show() {
        System.out.println("gasolina "+gas+" passageiro "+pass+" kilometros "+km);

    }
}
