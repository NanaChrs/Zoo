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
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test lion
        Lion leo = new Lion();
        System.out.println(leo.toString() + "\nMaintenant, changer tous les attributes (true)");
        leo.setFaim(true);
        leo.setSoif(true);
        leo.setMalade(true);
        leo.setDormir(true);
        leo.setJouer(true);
        System.out.println(leo.toString());
        System.out.println("Maintenant, interage avec Leo.");
        leo.interage();
        leo.mange();
        System.out.println("Maintenant, le faim de Leo (false) = " + leo.getFaim());
        System.out.println(leo.toString());
        
        //test Location
        Location loc = new Location(Position.Lions);
        loc.animals.add(leo);
        System.out.println("Ajute Leo a le location Lions. toString() dans location d'ArrayList Animals à position 0 : " + loc.animals.get(0).toString());
    }
    
}
