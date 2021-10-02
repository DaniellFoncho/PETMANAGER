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
public class ModelDoctor {
    DbData dbData;
    

    public ModelDoctor() {
        this.dbData = new DbData();
    }
    public boolean CreateDoctor(clsDoctor doctor1){
        
              
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "insert into TB_DOCTOR (adress, name, phone, id) VALUES (?,?,?,?)";
            PreparedStatement statementDoctor = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statementDoctor.setString(1, doctor1.getName());
            statementDoctor.setString(2, doctor1.getAdress());
           
            statementDoctor.setString(4, doctor1.getPhone());
            statementDoctor.setString(5, doctor1.getId());
            int rowsInserted =statementDoctor.executeUpdate();
            if (rowsInserted > 0)  {
                
                    if (rowsInserted > 0)  {
                        return true;
                        
                    }
                }
                
            
            return false;
                   
            
        } catch (SQLException e)   {
             return false;
       
        }
     }  
    public boolean EditDoctor(clsDoctor doctor1)  {           
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String queryDoctor = "UPDATE tb_pet SET  id = ?, name = ?, adress = ?, phone = ?";
            PreparedStatement statementDoctor = conn.prepareStatement(queryDoctor);
            statementDoctor.setString(1, doctor1.getName());
            statementDoctor.setString(2, doctor1.getAdress());
            statementDoctor.setString(4, doctor1.getPhone());
            statementDoctor.setString(5, doctor1.getId());
            
            int rowsUpdateDoctor = statementDoctor.executeUpdate(); 
           
                   
            return  rowsUpdateDoctor > 0 && rowsUpdateDoctor > 0; 
            
                            
            
        } catch (SQLException e)   {
             return false;
       
        }
     }

public boolean DeleteDoctor(clsDoctor doctor1) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String queryDoctor = "DELETE FROM tb_doctor WHERE id_doctor = ?";
            PreparedStatement statementDoctor = conn.prepareStatement(queryDoctor);
            statementDoctor.setString(1, doctor1.getId());
            //System.out.println(statementDog);
           
            statementDoctor.setString(1, doctor1.getId()); 
            //System.out.println(statementPet);
            int rowsUpdatedDoctor = statementDoctor.executeUpdate();
            int rowsUpdatedsetDoctor = 0;
            
            return rowsUpdatedsetDoctor > 0 && rowsUpdatedDoctor > 0;
        } catch (SQLException e) {
            return false;
        }
    }

public  clsDoctor SearchDoctor(String id)  {   
    clsDoctor doctor1 = null;
    try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "SELECT * FROM tb_doctor AS d  AS d on d.id = d.id_doctor WHERE d.id =?";
            
            PreparedStatement statementDoctor = conn.prepareStatement(query);                    
            statementDoctor.setString(1, id);
            ResultSet result = statementDoctor.executeQuery();
            while (result.next()){
                
                String doctor1Name = result.getString(1);
               String doctor1Adress = result.getString(2);
               String doctor1Phone = result.getString(3);
              
              
                doctor1 =new clsDoctor(doctor1Name, doctor1Adress, doctor1Phone );
              }
                        return doctor1;
            
            } catch (SQLException e)   {
             return doctor1;
       
        }
     }      
         
public  LinkedList<clsDoctor> ListDoctor()  {   
    LinkedList <clsDoctor> doctor1List = new LinkedList<>();
    try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "SELECT * FROM tb_doctor AS d   on d.id = d.id_doctor ";
            
            PreparedStatement statementDoctor = conn.prepareStatement(query);                    
            
            ResultSet result = statementDoctor.executeQuery();
            while (result.next()){
             
                String doctor1Name = result.getString(1);
               String doctor1Adress = result.getString(2);
               String doctor1Phone = result.getString(3);
              
              
                clsDoctor doctor1 = new clsDoctor(doctor1Name, doctor1Adress, doctor1Phone );
                doctor1List.add(doctor1);
              }
                        return doctor1List;
            
            } catch (Exception e)   {
             return doctor1List;
       
        }
     }      
    

}
