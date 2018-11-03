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
public class Éléphant extends Animal{
    @Override
    public void mange(){
        System.out.println("L'éléphant a bien mangé des grandes feuilles.");
        faim = false;
    }
    
    @Override
    public void parle(){
        System.out.println("*bruit d'éléphant*");
    }
    
    @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("L'éléphant a faim. Il a un appétit enorme!");
            this.parle(); 
        }
    }
    
    @Override
    public String toString(){
        return "Type d'animal = Éléphant. Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ".";
    }
}
