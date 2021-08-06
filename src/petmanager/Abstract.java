/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;
import Classes.clsDoctor;
import Classes.clsVeterinari;


       
public class Abstract {
    //instanciar los objetos veterinaria y doctor
    public static void main(String[] args) {
        clsDoctor doctor1 = new clsDoctor ("Daniel Sanchez", 1056);
        clsVeterinari veterinaria1 = new clsVeterinari ("mimascot", "calle 54c sur 86b 21", "3508311368", doctor1);
    
        veterinaria1.setData(veterinaria1.getName() + " - " + veterinaria1.getAdress() + veterinaria1.getPhone());
    
        String data = veterinaria1.getHospitalInformation();
        String type = veterinaria1.getPatientType();
        String surgery = veterinaria1.Surgery();
        
        System.out.println("data " + data);
        System.out.println("type " + type);
        System.out.println("Surgery" + surgery);
    }
         
}
