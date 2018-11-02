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
public class Poisson extends Animal{
    @Override
    public void mange(){
        System.out.println("L'éléphant a bien mangé des <????>.");
        faim = false;
    }
    
    @Override
    public void parle(){
        System.out.println("Blub Glub");
    }
    
    @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("Le poisson a faim. Je suis heureux qu'il n'est pas un shark!");
            this.parle(); 
        }
    }
    
    @Override
    public String toString(){
        return "Type d'animal = Poisson. Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ".";
    }
    
}
