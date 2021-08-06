/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author daniel
 */
public class clsVeterinari extends AbsHospital {
    private String name;
    private String adress;
    private String phone;
    private clsDoctor doctor;

    public clsVeterinari(String name, String adress, String phone, clsDoctor doctor) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.doctor = doctor;
    }
    public String Petcare(clsPet pet){
        System.out.println("Atendiendo a la mascota " + pet.getNombre());
        return pet.getHealtstatus();

        
    }
    
    
    
    
    @Override
    public String getPatientType(){
        return "Animal";
        
               
    }
    @Override
    public String Surgery(){
        return "Surgery animal data";
        
               
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    
    
    /**
     * 
     * @return 
     */
    
     public String getAdress() {
        return adress;
    }
     
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the doctor
     */
    public clsDoctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(clsDoctor doctor) {
        this.doctor = doctor;
    }

    
    
    
    
    
    
}
