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
public class Polypormism {
     public static void main(String[] args) {
        
     // se deben crear los objetos en orden de importancia, primero doctor
     
     clsDoctor doctor1 = new clsDoctor ("Daniel Sanchez", 1056);
     clsVeterinari veterinaria1 = new clsVeterinari ("mimascot", "calle 54c sur 86b 21", "3508311368", doctor1);
     System.out.println (veterinaria1.getName() + " ATENDIDO POR " + veterinaria1.getDoctor().getName() + veterinaria1.getDoctor().getTargeta_profesional());
     
     clsDog dog1 = new clsDog("criolla", false, "01",  "oso", 2015, "negro y blanco",  "sano"  );
     clsCat cat1 = new clsCat ("Angora",   "01", "Silvestre", 2021, "negro y blanco", "sano");
     
     String careDog = veterinaria1.Petcare(dog1);
     System.out.println ("El estado de salud de " + dog1.getNombre() + " " + careDog );
     
     String careCat = veterinaria1.Petcare(cat1);
     System.out.println ("El estado de salud de " + cat1.getNombre() + " " + careCat );
     
     
 }
 }    
