
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Clientes;
import model.bean.Pet;


public class PetDAO {
    
    public void create(Pet pt){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
                 stmt = con.prepareStatement("INSERT INTO pet (nome_dono, nome_pet, raca, nascimento, descricao) VALUES (?,?,?,?,?)");
                 
                 stmt.setString(1,pt.getNome_dono());
                 stmt.setString(2,pt.getNome_pet());
                 stmt.setString(3,pt.getRaca()); 
                 stmt.setString(4,pt.getNascimento());
                 stmt.setString(5,pt.getDescricao());
                 
                 
                 stmt.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } 
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao salvar!"+ex);
        }
       finally
        {
            ConnectionFactory.closeConnection(con,stmt);
        }
    }

    public void update(Pet pt){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
                 stmt = con.prepareStatement("UPDATE pet SET nome_dono = ?, nome_pet = ?, raca = ?, nascimento = ?, descricao = ?  WHERE id = ?");
                 
                 stmt.setString(1,pt.getNome_dono());
                 stmt.setString(2,pt.getNome_pet());
                 stmt.setString(3,pt.getRaca()); 
                 stmt.setString(4,pt.getNascimento());
                 stmt.setString(5,pt.getDescricao());

                 stmt.executeUpdate();
                 
                 JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } 
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Erro ao salvar!"+ex);
        }
       finally
        {
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
    
    public List<Pet> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Pet> pet1 = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM pet");
            rs=stmt.executeQuery();
            while(rs.next())
            {
                Pet pet = new Pet();
                pet.setId(rs.getInt("id"));
                pet.setNome_dono(rs.getString("nome_dono"));
                pet.setNome_pet(rs.getString("nome_pet"));
                pet.setRaca(rs.getString("raca"));
                pet.setNascimento(rs.getString("nascimento"));
                pet.setDescricao(rs.getString("descricao"));
                
                pet1.add(pet);
            }
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Não foi possivel ler os dados do pet"+ex);
        }
        finally
        {
            ConnectionFactory.closeConnection(con,stmt,rs);
        }
        return pet1;
    }

    public List<Pet> readParaPet(String NomePesquisaPet){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Pet> pet1 = new ArrayList<>();
        try{
            
            stmt = con.prepareStatement("SELECT * FROM pet WHERE nome_dono LIKE ?");
            stmt.setString(1, "%" + NomePesquisaPet + "%");            
            while(rs.next())
            {
                Pet pet = new Pet();
                    
                pet.setId(rs.getInt("id"));
               // pet.setId_cliente(rs.getInt("id_cliente"));
                pet.setNome_dono(rs.getString("nome_dono"));
                pet.setNome_pet(rs.getString("nome_pet"));
                pet.setRaca(rs.getString("raca"));
                pet.setNascimento(rs.getString("nascimento"));
                pet.setDescricao(rs.getString("descricao"));
                
                pet1.add(pet);
            }
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Não foi possivel ler os dados do pet"+ex);
        }
        finally
        {
            ConnectionFactory.closeConnection(con,stmt,rs);
        }
        return pet1;
    }
    
//    public void update(Clientes c)
//    {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        
//        try{
//            stmt = con.prepareStatement("UPDATE cliente SET nome = ?, email = ?, documento = ?, telefone = ?, rua = ?, numero = ?, bairro = ?, cidade = ? WHERE id = ?");
//                
//                stmt.setString(1,c.getNome());
//                stmt.setString(2,c.getEmail()); 
//                stmt.setInt(3,c.getDocumento());
//                stmt.setLong(4,c.getTelefone());
//                stmt.setString(5,c.getRua());
//                stmt.setInt(6,c.getNumero());
//                stmt.setString(7,c.getBairro());
//                stmt.setString(8,c.getCidade());
//                stmt.setInt(9, c.getId());
//                 
//                stmt.executeUpdate();
//        }
//        catch(SQLException ex)
//        {
//            JOptionPane.showMessageDialog(null,"Erro ao atualizar o cliente"+ex);
//        }
//        finally
//        {
//           ConnectionFactory.closeConnection(con,stmt);
//        }
//        
//    }
    public void delete(Pet pt)
    {
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement stmt =null;
        
         try{
            stmt = con.prepareStatement("DELETE FROM pet WHERE id = ?");

            stmt.setInt(1, pt.getId());

            stmt.executeUpdate();         
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
         }
         catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir"+ex);
         }
         finally
         {
             ConnectionFactory.closeConnection(con, stmt);
         }
    }
    
}
