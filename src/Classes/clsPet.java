/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interface.*;


public class clsPet implements Ianimal, Ivertebrate {
    
    int petId;
    private String nombre;
   
    private String codigo;
    private String healtstatus;
    private String color;
    private float born_year;
    private clsVeterinari veterinari;
    
    public clsPet( int petId, String nombre,  String codigo, String healtstatus, String color, float born_year ) {
        
        this.petId = petId;
        this.nombre = nombre;
        
        this.codigo = codigo;
        this.healtstatus = healtstatus;
        this.color      = color;
        this.born_year  = born_year;
        
    }
    
    //firmas
   
    
    @Override
    public String getAnimalType(){
        return "domestico.";
        
    }
    @Override
    public int getNumberofBones(){
        return 0;


    }
      


   //metodos
    
    public void Eat (){
        System.out.print("The pet" + getNombre() + "is eating");
    }
    public void Move (){
        System.out.print("The pet" + getNombre() + "is moving");
    }
    public void Soundd (){
        System.out.print("The pet" + getNombre() + "is Sounding");
    }
    
   
    
 

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
 

    
    
    
    /**
     * @return the peso
     */
    

    /**
     * @param peso the peso to set
     */
    
        
        
        
    
 /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the peso to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
    
    
    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
    public String getHealtstatus(){
        return healtstatus;
    }

    public void setHealtstatus(String healtstatus) {
        this. healtstatus = healtstatus;
    }
    
    
    
    
    
    
    public float getborn_year() {
        return born_year;
    }

    
    public void setBorn_year(float born_year) {
        this.born_year = born_year;
    }
    
    
    /**
     * @return the veterinari
     */
    public clsVeterinari getVeterinari() {
        return veterinari;
    }

    /**
     * @param veterinari the veterinari to set
     */
    public void setVeterinari(clsVeterinari veterinari) {
        this.veterinari = veterinari;
    }

    /**
     * @return the petId
     */
    public int getPetId() {
        return petId;
    }

    /**
     * @param petId the petId to set
     */
    public void setPetId(int petId) {
        this.petId = petId;
    }
    
    
    
}





