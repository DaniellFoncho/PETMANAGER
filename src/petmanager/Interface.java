/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;
import Classes.clsDog;
import Classes.clsCat;


/**
 *
 * @author daniel
 */
public class Interface {
    public static void main(String[] args) {
        clsDog dog1 = new clsDog("criolla", false, "01",  "oso", 2015, "negro y blanco",  "sano" );
        clsCat cat1 = new clsCat ("Angora",   "01", "Silvestre", 2021, "negro y blanco", "sano");
        
        System.out.println(dog1.getNombre() + " es animal de tipo " + dog1.getAnimalType());
        System.out.println( dog1.getNombre() + " tiene el total de " + dog1.getNumberofBones()+ " Huesos ");
        
        
        System.out.println(cat1.getNombre() + " es animal de tipo " + cat1.getAnimalType());
        System.out.println( cat1.getNombre() + " tiene el total de " + cat1.getNumberofBones()+ " Huesos ");
    }
    
}
