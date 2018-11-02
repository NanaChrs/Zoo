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
public class Oiseau extends Animal{
     @Override
    public void mange(){
        System.out.println("Le oiseau a bien mangé des graines.");
        faim = false;
    }
    
    @Override
    public void parle(){
        System.out.println("Chirp! Chirp! Chirp!");
    }
    
    @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("Le oiseau a faim. Jetez des graines pour lui.");
            this.parle(); 
        }
    }
    
    @Override
    public String toString(){
        return "Type d'animal = Oiseau. Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ".";
    }
}
