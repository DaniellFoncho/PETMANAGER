package Model;
import Classes.*;
import java.sql.*;
import java.util.LinkedList;
/**
 *
 * @author daniel
 */
public class modelVeterinari {
    DbData dbData;
    

    public modelVeterinari() {
        this.dbData = new DbData();
    }
    public boolean CreateVeterinari(clsVeterinari veterinaria1){
        
              
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "insert into TB_VETERINARY (name, adress,  phone, xx) VALUES (?,?,?,?)";
            PreparedStatement statementVeterinari = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statementVeterinari.setString(1, veterinaria1.getName());
            statementVeterinari.setString(2, veterinaria1.getAdress());
           
            statementVeterinari.setString(4, veterinaria1.getPhone());
            statementVeterinari.setObject(5, veterinaria1.getDoctor());
            int rowsInserted =statementVeterinari.executeUpdate();
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
    public boolean EditVeterinari(clsVeterinari veterinaria1)  {           
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String queryVeterinari = "UPDATE tb_vet SET  id = ?, name = ?, adress = ?, phone = ?";
            PreparedStatement statementVeterinari = conn.prepareStatement(queryVeterinari);
            statementVeterinari.setString(1, veterinaria1.getName());
            statementVeterinari.setString(2, veterinaria1.getAdress());
            statementVeterinari.setString(3, veterinaria1.getPhone());
         
            
            int rowsUpdateVeterinari = statementVeterinari.executeUpdate(); 
           
                   
            return  rowsUpdateVeterinari > 0 ; 
            
                            
            
        } catch (SQLException e)   {
             return false;
       
        }
     }

public boolean DeleteVeterinari(clsVeterinari veterinaria1) {
        try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())) {
            String queryVeterinari = "DELETE FROM tb_doctor WHERE id_doctor = ?";
            PreparedStatement statementVeterinari = conn.prepareStatement(queryVeterinari);
            
            //System.out.println(statementPet);
            int rowsUpdatedVeterinari = statementVeterinari.executeUpdate();
            int rowsUpdatedsetVeterinari = 0;
            
            return rowsUpdatedsetVeterinari > 0 ;
        } catch (SQLException e) {
            return false;
        }
    }

public  clsVeterinari SearchVeterinari(String id)  {   
    clsVeterinari veterinaria1 = null;
    try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "SELECT * FROM tb_doctor AS d  AS d on d.id = d.id_doctor WHERE d.id =?";
            
            PreparedStatement statementVeterinari = conn.prepareStatement(query);                    
            statementVeterinari.setString(1, id);
            ResultSet result = statementVeterinari.executeQuery();
            while (result.next()){
                
                String veterinaria1Name = result.getString(1);
               String veterinaria1Adress = result.getString(2);
               String veterinaria1Phone = result.getString(3);
              
              
                veterinaria1 =new clsVeterinari(veterinaria1Name, veterinaria1Adress, veterinaria1Phone );
              }
                        return veterinaria1;
            
            } catch (SQLException e)   {
             return veterinaria1;
       
        }
     }      
         
public  LinkedList<clsVeterinari> ListVeterinari()  {   
    LinkedList <clsVeterinari> veterinaria1List = new LinkedList<>();
    try (Connection conn = DriverManager.getConnection(dbData.getUrl(), dbData.getUser(), dbData.getPassword())){
            String query = "SELECT * FROM tb_veterinaria AS d   ";
            
            PreparedStatement statementVeterinari = conn.prepareStatement(query);                    
            
            ResultSet result = statementVeterinari.executeQuery();
            while (result.next()){
             
                String veterinaria1Name = result.getString(1);
               String veterinaria1Adress = result.getString(2);
               String veterinaria1Phone = result.getString(3);
              
              
                clsVeterinari doctor1 = new clsVeterinari(veterinaria1Name, veterinaria1Adress, veterinaria1Phone );
                veterinaria1List.add(doctor1);
              }
                        return veterinaria1List;
            
            } catch (Exception e)   {
             return veterinaria1List;
       
        }
     }      
    

}