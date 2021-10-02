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
public class clsDoctor {
    private String name;
    private String adress;
    private String phone;
    private String Id;

    public clsDoctor(String name, String adress, String phone,  String Id) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.Id = Id;
    }

    public clsDoctor(String doctor1Name, String doctor1Adress, String doctor1Phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the targeta_profesional
     */
    public String getId() {
        return Id;
    }


     
    public void setId(String LicenceDoctor) {
        this.Id = LicenceDoctor;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
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
    
    
    
    
}
