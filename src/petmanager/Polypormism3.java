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
public class Polypormism3 {
     public static void main(String[] args) {
        clsDog dog1 = new clsDog("criolla", false, "01",  "oso", 2015, "negro y blanco",  "sano" );
        
        dog1.WalkAround();
        dog1.WalkAround(3);
        dog1.WalkAround(true );
        
}
}
