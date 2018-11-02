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
public class Singe extends Animal {
    
    @Override
    public void mange(){
        System.out.println("Le singe a bien mangé une banane.");
        faim = false;
    }
    
    @Override
    public void parle(){
        System.out.println("Ohh Ohh AHH AHH");
    }
    
    @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("Le singe a faim. As-tu une banane?");
            this.parle(); 
        }
    }
    
    @Override
    public String toString(){
        return "Type d'animal = Singe. Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ".";
    }
    
}
