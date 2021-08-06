/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import Classes.*;
import static java.time.Clock.system;
import java.util.Date;


public class PetManager {
    
    

    public static void main(String[] args) {
        
     // se deben crear los objetos en orden de importancia, primero doctor
     
     clsDoctor doctor1 = new clsDoctor ("Daniel Sanchez", 1056);
     clsVeterinari veterinaria1 = new clsVeterinari ("mimascot", "calle 54c sur 86b 21", "3508311368", doctor1);
     System.out.println (veterinaria1.getName() + " ATENDIDO POR " + veterinaria1.getDoctor().getName() + veterinaria1.getDoctor().getTargeta_profesional());
     
     clsDog dog1 = new clsDog("criolla", false, "01",  "oso", 2015, "negro y blanco",  "sano"  );
     clsCat cat1 = new clsCat ("Angora",   "01", "Silvestre", 2021, "negro y blanco", "sano");
     
   
    
     Date current_date = new Date();
     int current_year = current_date. getYear();
        
     int agePet1 = (int) (current_year - dog1.getborn_year());
     int agePet2 = (int) (current_year - cat1.getborn_year());
        
     if (agePet1 > agePet2 ){
         System.out.println("la mascota " + dog1.getNombre() + " es mayor que la mascota " + cat1.getNombre());
     }else {
         if (agePet2 > agePet1){
             System.out.println(" la mascota " + cat1.getNombre() + " es mayor que la mascota " + dog1.getNombre());
             
         }else{
             System.out.println(" la mascota " + cat1.getNombre() + " tiene la misma edad que la mascota  " + dog1.getNombre());
         }
             
        
         
         
         dog1.Eat();
         cat1.Eat();
         cat1.Move();
         cat1.SelfCleaning();
         cat1.Soundd();
         dog1.WalkAround();
         
     }
         
     
        
        
        
         
}
        
        
    
}
