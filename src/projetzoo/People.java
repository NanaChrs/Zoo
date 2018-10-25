/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetzoo;

/**
 *
 * @author mathi
 */
public abstract class People {
    protected String name;
    protected String lieu;
    

    public People(String name) {
        this.name = name;
        this.lieu="Accueil";
        
    }

    public People(String name, String lieu) {
        this.name = name;
        this.lieu = lieu;
    }
    
    

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
    
    public String getNom() {
        return name;
    }

    public void setNom(String nom) {
        this.name = nom;
    }
    
    public void talk(String say){
        System.out.println(this.name+": "+say+".");
    }
    
    public abstract String introduceSelf();
    /*public void move(String lieu){
        String lieuActuel=lieu;
        System.out.println("Je suis dans :"+lieuActuel);
        
    }*/
    
    
}
