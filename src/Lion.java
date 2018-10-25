/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author storyd
 */
public class Lion extends Animal{
    //Constructor
    public Lion(){
        
    }
    
    @Override
    public void mange(){
        System.out.println("Le lion a bien mangé du viande.");
        faim = false;
    }
    
    @Override
    public void parle(){
        System.out.println("Roar!");
    }
    @Override
    public void interage(){
        if(faim == true){
            this.parle();
            System.out.println("Ohh la! Le lion a faim et il essaie de manger des gens!");
            this.parle(); 
            System.out.println("Donne-lui de la viande. Dépêches-toi!!");
        }
    }
    
    @Override
    public String toString(){
        return "Type d'animal = Lion. Faim = " + getFaim() + ". Soif = " + getSoif() + ". Malade = " + getMalade() + ". Dormir = " + getDormir() + ". Jouer = " + getJouer() + ".";
    }
}
