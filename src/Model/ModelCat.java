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
public class ModelCat {
    DbData dbData;
public ModelCat() {
    this.dbData = new DbData();
    
    }
/**
 *
 * @author daniel
 */
public class modelCat {
    
    
    

    
    public boolean CreatePet(clsCat cat)  {           
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "insert into TB_PET (code, name, born_year, color, health_status) VALUES (?,?,?,?,?)";
            PreparedStatement statementPet = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statementPet.setString(1, cat.getCodigo());
            statementPet.setString(2, cat.getNombre());
            statementPet.setInt(3, (int) cat.getborn_year());
            statementPet.setString(4, cat.getColor());
            statementPet.setString(5, cat.getHealtstatus());
            int rowsInserted =statementPet.executeUpdate();
            if (rowsInserted > 0)  {
                ResultSet generatedKeys = statementPet.getGeneratedKeys();
                if(generatedKeys.next()){
                    int idPet = generatedKeys.getInt(1);
                    query = "INSERT INTO  tb cat (breed,  id pet) VALUES (?,?)";
                    PreparedStatement statementCat = conn.prepareStatement(query);
                    statementCat.setString (1, cat.getBreed());
                    statementCat.setInt (2, idPet);
                    rowsInserted = statementCat.executeUpdate();
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
public boolean EditPet(clsCat  cat)  {           
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String queryPet = "UPDATE tb_pet SET  code = ?, name = ?, born_year = ?, color = ?, health_status = ?, WHERE id = ?";
            PreparedStatement statementPet = conn.prepareStatement(queryPet);
            statementPet.setString(1, cat.getCodigo());
            statementPet.setString(2, cat.getNombre());
            statementPet.setInt(3, (int) cat.getborn_year());
            statementPet.setString(4, cat.getColor());
            statementPet.setString(5, cat.getHealtstatus());
            statementPet.setInt(6,  cat.getPetId());
            
            
            String queryDog = "UPDATE tb_cat SET breed = ?, WHERE id = ?";
            PreparedStatement statementDog = conn.prepareStatement(queryDog);
            statementDog.setString (1, cat.getBreed());
            
            statementDog.setInt (2, cat.getCatId());
            int rowsUpdatePet = statementPet.executeUpdate(); 
          
                   
            return  rowsUpdatePet > 0 ;             
            
        } catch (SQLException e)   {
             return false;
       
        }
     }

public boolean DeleteCat(clsCat cat) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String queryCat = "DELETE FROM tb_dog WHERE id_pet = ?";
            PreparedStatement statementCat = conn.prepareStatement(queryCat);
            statementCat.setInt(1, cat.getPetId());
            //System.out.println(statementDog);
            String queryPet = "DELETE FROM tb_pet WHERE id = ?";
            PreparedStatement statementPet = conn.prepareStatement(queryPet);
            statementPet.setInt(1, cat.getPetId()); 
            //System.out.println(statementPet);
            int rowsUpdatedDog = statementCat.executeUpdate();
            int rowsUpdatedPet = statementPet.executeUpdate();
            return rowsUpdatedPet > 0 && rowsUpdatedDog > 0;
        } catch (SQLException e) {
            return false;
        }
    } 

public  clsPet SearchPet(String code)  {   
    clsCat cat = null;
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
                int catId  = result.getInt(7);
                String petBreed = result.getString(8);
               
                   cat = new clsCat(catId, petBreed, petId, petCode, petName, petBornYear, petColor, petHealthStatus);

              }
                        return cat;
            
            } catch (SQLException e)   {
             return cat;
       
        }
     }      

        
public  LinkedList<clsPet> ListPet()  {   
    LinkedList <clsPet> catList = new LinkedList<>();
    try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "SELECT * FROM tb_pet AS p INNER JOIN tb_cat A d on p.id = d.id_pet ";
            
            PreparedStatement statementPet = conn.prepareStatement(query);                    
            
            ResultSet result = statementPet.executeQuery();
            while (result.next()){
                int petId  = result.getInt(1);
                String petCode = result.getString(2);
                String petName = result.getString(3);
                int petBornYear  = result.getInt(4);
                String petColor = result.getString(5);
                String petHealthStatus = result.getString(6);
                int catId  = result.getInt(7);
                String petBreed = result.getString(8);
                
                clsCat cat =new clsCat(catId, petBreed,  petId, petCode ,petName, petBornYear, petColor, petHealthStatus);
                catList.add(cat);
              }
                        return catList;
            
            } catch (Exception e)   {
                  return catList; 
            }
       
                
        }  
}
}
