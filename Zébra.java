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
public class Zébra extends Animal{
    @Override
    public void mange(){
        System.out.println("Le zébra a bien mangé des herbes.");
        faim = false;
    }
    
    @Override
    public void parle(){
        System.out.println("*bruit de zébra*");
    }
    
    @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("Le zébra a faim.");
            this.parle(); 
        }
    }
    
    @Override
    public String toString(){
        return "Type d'animal = Zébra. Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ".";
    }
}
