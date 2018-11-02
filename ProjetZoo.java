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
public class ProjetZoo{ 
    public static void main (String args [])  {

    /**
     * @param args the command line arguments
     */
 /*   public static void main(String[] args) {
        // TODO code application logic here
        Employee Caissiere = new Cashier("Clara");
        Scanner keyboard = new Scanner(System.in);
        ArrayList <Client> joueurs;
        joueurs = new ArrayList();
        boolean bool=false;
        int personnes=1;
        
        try{
            while(personnes!=0){
               
                Caissiere.talk("En premier lieu, quel est votre prénom ?");
                String line=keyboard.nextLine();
                Caissiere.talk("Deuxièmement, quel âge avez-vous ?");
                int age=keyboard.nextInt();
                keyboard.nextLine();
                Caissiere.talk("Et en dernier êtes vous étudiant ? Entrez 1 pour oui et 0 pour non.");
                int student=keyboard.nextInt();
                keyboard.nextLine();
                joueurs.add(new Client(isBoolean(student), age, line));
                Caissiere.talk("Y a-t-il d'autres personnes avec vous ? 1 pour oui et 0 pour non.");
                student=keyboard.nextInt();
                keyboard.nextLine();
                if (!isBoolean(student)){
                    personnes=0;
                    }
                else{
                    personnes++;
                    Caissiere.talk("Veuillez introduire la prochaine personne");
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println(e+": Vous n'avez pas entré le bon type demandé");
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        
        
    }
     
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
    
    
 /*   public static boolean isBoolean(int bool){
        if (bool==1){return true;}
        else{return false;}
    }
  */  
    
    //test Serpent
    Serpent lucifer = new Serpent();
        System.out.println(lucifer.toString() + "\nMaintenant, changer tous les attributes (true)");
        lucifer.setFaim(true);
        lucifer.setSoif(true);
        lucifer.setMalade(true);
        lucifer.setDormir(true);
        lucifer.setJouer(true);
        System.out.println(lucifer.toString());
        System.out.println("Maintenant, interage avec Lucifer.");
        lucifer.interage();
        lucifer.mange();
        System.out.println("Maintenant, le faim de Lucifer (false) = " + lucifer.getFaim());
        System.out.println(lucifer.toString());
        
        //test Location
        Location loc = new Location(Position.Serpents);
        loc.animals.add(lucifer);
        System.out.println("Ajute Lucifer a le location Serpents. toString() dans location d'ArrayList Animals à position 0 : " + loc.animals.get(0).toString());
    }
    
}
    
