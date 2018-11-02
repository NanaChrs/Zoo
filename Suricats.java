/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetzoo;

/**
 *
 * @author storyd
 */
public class Suricats extends Animal {
    @Override
    public void mange(){
        System.out.println("Le suricat a bien mangé des fruits et quelques insects.");
        faim = false;
    }
    
    @Override
    public void parle(){
        System.out.println("Squeak! Squeak!");
    }
    
    @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("Le suricat a faim.");
            this.parle(); 
        }
    }
    
    @Override
    public String toString(){
        return "Type d'animal = Suricat. Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ".";
    }
}
