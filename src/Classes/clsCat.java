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
public class clsCat extends clsPet{
    private int catId;
    private  String breed;

    public clsCat(int catId, String breed,int petId, String codigo, String nombre, int born_year, String color, String healtstatus) {
        super(petId,  nombre, codigo, healtstatus, color, born_year);
        this.breed = breed;
        this.catId = catId;
    }


    

   
    public void SelfCleaning (){
        System.out.print(" The cat " + super.getNombre() + " is selfcleaning ");
    }

    @Override
    public void Soundd (){
        System.out.print(" The cat  " + getNombre() + " says   miau. ");
    }
    
    
    
    //ahora reescribimos los metodos de la clase pet que heredaron de la firma del interface
    
    @Override
    public String getAnimalType(){
        return "cat.";
        
    }
    @Override
    public int getNumberofBones(){
        return 230;
        
     }   
    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the catId
     */
    public int getCatId() {
        return catId;
    }

    /**
     * @param catId the catId to set
     */
    public void setCatId(int catId) {
        this.catId = catId;
    }
    
    
}
