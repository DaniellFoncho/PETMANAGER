/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Classes.*;
import Model.*;

import java.util.LinkedList;
/**
 *
 * @author daniel
 */
public class ctlDoctor {
    private ModelDoctor modelDoctor;
    
    public boolean CreateDoctor(clsDoctor doctor1)  {           
        
            

            this.modelDoctor.CreateDoctor((clsDoctor)doctor1);
                   
            
            return true;
            
     
     } 
 

    public boolean EditDoctor(clsDoctor doctor1)  {           
        this.modelDoctor.EditDoctor((clsDoctor)doctor1);
        return false;
                   
            
           
            }
      
        
     

  public boolean DeleteDoctor(clsDoctor doctor1)  {           
         this.modelDoctor.DeleteDoctor((clsDoctor)doctor1);
        return false;
                   
            
           
            }

     
      
  public  clsDoctor SearchDoctor(String Id, String Name )  {   
    clsDoctor doctor1 = null;
        
        
               doctor1= doctor1 = this.modelDoctor.SearchDoctor(Id);
                 
            
            return doctor1;
            
       
       
        }
        
        
public  LinkedList<clsPet> ListDoctor( String type )  {   
   LinkedList<clsDoctor> doctorList = null;
        
        this.modelDoctor.ListDoctor();
        return null;
              
        }
     } 

    