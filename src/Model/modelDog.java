/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Classes.*;
import java.sql.*;
import java.util.LinkedList;

/**
 *
 * @author daniel
 */
public class modelDog {
    
    DbData dbData;
    

    public modelDog() {
        this.dbData = new DbData();
    }
    public boolean CreatePet(clsDog dog){
        
              
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "insert into TB_PET (code, name, born_year, color, health_status) VALUES (?,?,?,?,?)";
            PreparedStatement statementPet = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statementPet.setString(1, dog.getCodigo());
            statementPet.setString(2, dog.getNombre());
            statementPet.setInt(3, (int) dog.getborn_year());
            statementPet.setString(4, dog.getColor());
            statementPet.setString(5, dog.getHealtstatus());
            int rowsInserted =statementPet.executeUpdate();
            if (rowsInserted > 0)  {
                ResultSet generatedKeys = statementPet.getGeneratedKeys();
                if(generatedKeys.next()){
                    int idPet = generatedKeys.getInt(1);
                    query = "INSERT INTO  tb cat (breed, pedigree, id pet) VALUES (?,?,?)";
                    PreparedStatement statementDog = conn.prepareStatement(query);
                    statementDog.setString (1, dog.getBreed());
                    statementDog.setBoolean (2, dog.isPedigree());
                    statementDog.setInt (3, idPet);
                    rowsInserted = statementDog.executeUpdate();
                    if (rowsInserted > 0)  {
                        return true;
                        
                    }
                }
                
            }
            return false;
                   
            
        } catch (SQLException e)   {
             return false;
       
        }
     }  
public boolean EditPet(clsDog dog)  {           
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String queryPet = "UPDATE tb_pet SET  code = ?, name = ?, born_year = ?, color = ?, health_status = ?, WHERE id = ?";
            PreparedStatement statementPet = conn.prepareStatement(queryPet);
            statementPet.setString(1, dog.getCodigo());
            statementPet.setString(2, dog.getNombre());
            statementPet.setInt(3, (int) dog.getborn_year());
            statementPet.setString(4, dog.getColor());
            statementPet.setString(5, dog.getHealtstatus());
            statementPet.setInt(6,  dog.getPetId());
            
            
            String queryDog = "UPDATE tb_dog SET breed = ?, pedigree = ? WHERE id = ?";
            PreparedStatement statementDog = conn.prepareStatement(queryDog);
            statementDog.setString (1, dog.getBreed());
            statementDog.setBoolean (2, dog.isPedigree());
            statementDog.setInt (3, dog.getDogId());
            int rowsUpdatePet = statementPet.executeUpdate(); 
            int rowsUpdateDog = statementDog.executeUpdate();
                   
            return  rowsUpdatePet > 0 && rowsUpdateDog > 0;                   
            
        } catch (SQLException e)   {
             return false;
       
        }
     }

public boolean DeleteDog(clsDog dog) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String queryDog = "DELETE FROM tb_dog WHERE id_pet = ?";
            PreparedStatement statementDog = conn.prepareStatement(queryDog);
            statementDog.setInt(1, dog.getPetId());
            //System.out.println(statementDog);
            String queryPet = "DELETE FROM tb_pet WHERE id = ?";
            PreparedStatement statementPet = conn.prepareStatement(queryPet);
            statementPet.setInt(1, dog.getPetId()); 
            //System.out.println(statementPet);
            int rowsUpdatedDog = statementDog.executeUpdate();
            int rowsUpdatedPet = statementPet.executeUpdate();
            return rowsUpdatedPet > 0 && rowsUpdatedDog > 0;
        } catch (SQLException e) {
            return false;
        }
    }

public  clsPet SearchPet(String code)  {   
    clsDog dog = null;
    try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "SELECT * FROM tb_pet AS p INNER JOIN tb_dog A d on p.id = d.id_pet WHERE p.code =?";
            
            PreparedStatement statementPet = conn.prepareStatement(query);                    
            statementPet.setString(1, code);
            ResultSet result = statementPet.executeQuery();
            while (result.next()){
                int petId  = result.getInt(1);
                String petCode = result.getString(2);
                String petName = result.getString(3);
                int petBornYear  = result.getInt(4);
                String petColor = result.getString(5);
                String petHealthStatus = result.getString(6);
                int dogId  = result.getInt(7);
                String petBreed = result.getString(8);
                boolean petPedigree = result.getBoolean(9);
                dog =new clsDog(dogId, petBreed, petPedigree, petId, petCode ,petName, petBornYear, petColor, petHealthStatus);
              }
                        return dog;
            
            } catch (SQLException e)   {
             return dog;
       
        }
     }      
         
public  LinkedList<clsPet> ListPet()  {   
    LinkedList <clsPet> dogList = new LinkedList<>();
    try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "SELECT * FROM tb_pet AS p INNER JOIN tb_dog A d on p.id = d.id_pet ";
            
            PreparedStatement statementPet = conn.prepareStatement(query);                    
            
            ResultSet result = statementPet.executeQuery();
            while (result.next()){
                int petId  = result.getInt(1);
                String petCode = result.getString(2);
                String petName = result.getString(3);
                int petBornYear  = result.getInt(4);
                String petColor = result.getString(5);
                String petHealthStatus = result.getString(6);
                int dogId  = result.getInt(7);
                String petBreed = result.getString(8);
                boolean petPedigree = result.getBoolean(9);
                clsDog dog =new clsDog(dogId, petBreed, petPedigree, petId, petCode ,petName, petBornYear, petColor, petHealthStatus);
                dogList.add(dog);
              }
                        return dogList;
            
            } catch (Exception e)   {
             return dogList;
       
        }
     }      
    
}
