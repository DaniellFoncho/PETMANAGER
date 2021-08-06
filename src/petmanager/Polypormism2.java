/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;
import Classes.*;

/**
 *
 * @author daniel
 */
public class Polypormism2 {
    public static void main(String[] args) {
        clsDog dog1 = new clsDog("criolla", false, "01",  "oso", 2015, "negro y blanco",  "sano" );
        clsCat cat1 = new clsCat ("Angora",   "01", "Silvestre", 2021, "negro y blanco", "sano");
        
    
    
    dog1.Soundd();
    
    cat1.Soundd();
    
    }
}


