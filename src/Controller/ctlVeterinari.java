
 
package Controller;
import Classes.*;
import Model.*;

import java.util.LinkedList;


 
public class ctlVeterinari {

    public  boolean EditVeterinari(clsVeterinari veterinaria1) {
        
        this.modelVeterinari.EditVeterinari((clsVeterinari)veterinaria1);
        return false;
    }

   
    private modelVeterinari modelVeterinari;
    
    public boolean CreateVeterinari(clsVeterinari veterinaria1)  {           
        
            

            this.modelVeterinari.CreateVeterinari((clsVeterinari)veterinaria1);
                   
            
            return true;
            
     
     } 
 

    
      
        
     

  public boolean DeleteVeterinari(clsVeterinari veterinaria1)  {           
         this.modelVeterinari.DeleteVeterinari((clsVeterinari)veterinaria1);
        return false;
                   
            
           
            }

     
      
  public  clsVeterinari SearchVeterinari(String Id, String Name )  {   
    clsVeterinari veterinaria1 = null;
        
        
               veterinaria1 = veterinaria1 = this.modelVeterinari.SearchVeterinari(Id);
                 
            
            return veterinaria1;
            
       
       
        }
        
        
public  LinkedList<clsPet> ListVeterinari( String type )  {   
   LinkedList<clsVeterinari> veterinariList = null;
        
        this.modelVeterinari.ListVeterinari();
        return null;
              
        }
}