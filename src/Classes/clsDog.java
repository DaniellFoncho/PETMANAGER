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
public class clsDog extends clsPet {
    int dogId;
    private String breed;
    private boolean pedigree;
    
    
    
    //constructor

    public clsDog(int dogId, String breed, boolean pedigree, int petId, String codigo, String nombre, int born_year, String color, String healtstatus) {
        super(petId, nombre,  codigo, healtstatus, color, born_year);
        this.breed = breed;
        this.pedigree = pedigree;
    }

    

 
    
    

    

    
     
    
    
    
    //metodos
    
    public void WalkAround(){
        System.out.print("The dog" + super.getNombre() + " is WalkAround");
    }
    public void WalkAround(int km){
        System.out.print("The dog" + super.getNombre() + " is Walking" + km +" km.");
    } 
    public void WalkAround(boolean dogLeash){
        String hasLeash = dogLeash ? "con correa" : "sin correa ";
        System.out.print("The dog" + super.getNombre() + " is Walking " + hasLeash );
        } 
    
    
    //reescritura 
    
     @Override
    public void Soundd (){
        System.out.print("The dog  " + getNombre() + "  says   guau. ");
   
    
    
    }    
    
    
     //ahora reescribimos los metodos de la clase pet que heredaron de la firma del interface
    
    @Override
    public String getAnimalType(){
        return "Dog";
        
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
     * @return the pedigree
     */
    public boolean getPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    /**
     * @return the dogId
     */
    public int getDogId() {
        return dogId;
    }

    /**
     * @param dogId the dogId to set
     */
    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public boolean isPedigree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      }
