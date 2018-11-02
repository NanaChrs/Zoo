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
public class Cashier extends Employee {

    public Cashier(String name) {
        super(name);
        talk(introduceSelf());
    }

    public Cashier(int heureDeb, int heureFin, String name) {
        super(heureDeb, heureFin, name);
        talk(introduceSelf());
    }
    
    public String introduceSelf(){
        return "Bonjour ! Je m'appelle "+this.name+". Voulez-vous acheter un ticket ? Pour se faire je dois savoir votre prénom, votre âge et si vous êtes étudiant ou non";
    }
}
