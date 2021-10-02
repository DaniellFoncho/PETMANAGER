/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.*;
import Model.*;
import Model.ModelCat.modelCat;
import java.util.LinkedList;

/**
 *
 * @author daniel
 */
public class ctlPet {
     
    
private modelDog modelDog;
private modelCat modelCat;


    public ctlPet() {
        this.modelDog = new modelDog ();
    }
       

    public boolean CreatePet(clsPet pet)  {           
        try {
            switch (pet.getAnimalType()){
               case "Cat":
                   this.modelCat.CreatePet((clsCat)pet);
                   break;
               case "Dog":
                   this.modelDog.CreatePet((clsDog)pet);
                
                    break;
            }
            return true;
            
        } catch (Exception e)   {
             return false;
       
        }
     }  
public boolean EditPet(clsPet pet)  {           
        try {
            switch (pet.getAnimalType()){
               case "Cat":
                   this.modelCat.EditPet((clsCat)pet);
                   break;
               case "Dog":
                   this.modelDog.EditPet((clsDog)pet);
                
                    break;
            }
            return true;
            
        } catch (Exception e)   {
             return false;
       
        }
     }

public boolean DeletePet(clsPet pet)  {           
        try {
            switch (pet.getAnimalType()){
               case "Cat":
                this.modelCat.DeleteCat((clsCat)pet);
                   break;
               case "Dog":
                this.modelDog.DeleteDog((clsDog)pet);
                    break;
            }
            return true;
            
        } catch (Exception e)   {
             return false;
       
        }
     } 

public  clsPet SearchPet(String code, String type )  {   
    clsPet pet = null;
        
        try {
            switch (type){
               case "Cat":
                    pet= pet = this.modelCat.SearchPet(code);
                   break;
               case "Dog":
                     pet = this.modelDog.SearchPet(code);
                    break;
            }
            return pet;
            
        } catch (Exception e)   {
             return null;
       
        }
     } 
public  LinkedList<clsPet> ListPet( String type )  {   
   LinkedList<clsPet> petList = null;
        
        try {
            switch (type){
               case "Cat":
                    petList = this.modelCat.ListPet();
                   break;
               case "Dog":
                     petList = this.modelDog.ListPet();
                    break;
            }
            return petList;
            
        } catch (Exception e)   {
             return null;
       
        }
     } 
} 