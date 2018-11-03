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
public class Girafe extends Animal{
    @Override
    public void mange(){
        System.out.println("Le girafe a bien mangé des feuilles au haut de l'arbre.");
        faim = false;
    }
    
    @Override
    public void parle(){
        System.out.println("*bruit de girafe*");
    }
    
    @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("Le girafe a faim.");
            this.parle(); 
        }
    }
    
    @Override
    public String toString(){
        return "Type d'animal = Girafe. Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ".";
    }
    
}
