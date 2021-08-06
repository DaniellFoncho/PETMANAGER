/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.clsDog;
import Classes.clsPet;
import Classes.*;
/**
 *
 * @author daniel
 */
public class ModelCat {
    

/**
 *
 * @author daniel
 */
public class modelCat {

    public modelCat() {
    }
    public boolean CreatePet(clsCat cat)  {           
        try {
            
            return true;
            
        } catch (Exception e)   {
             return false;
       
        }
     }  
public boolean EditPet(clsCat  pet)  {           
        try {
            
            return true;
            
        } catch (Exception e)   {
             return false;
       
        }
     }

public boolean DeletePet(clsCat cat)  {           
        try {
            
            return true;
            
        } catch (Exception e)   {
             return false;
       
        }
     } 

public  clsPet SearchPet(String code, String type )  {   
    clsCat cat = null;
        
        try {
            
            return cat;
            
        } catch (Exception e)   {
             return cat;
       
        }
     } 
}
}
