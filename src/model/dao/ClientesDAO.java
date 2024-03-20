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

public class ClientesDAO {
    
    public void create(Clientes c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
                 stmt = con.prepareStatement("INSERT INTO cliente (nome, email, documento, telefone, rua, numero, bairro, cidade) VALUES (?,?,?,?,?,?,?,?)");
                 
                 stmt.setString(1,c.getNome());
                 stmt.setString(2,c.getEmail()); 
                 stmt.setLong(3,c.getDocumento());
                 stmt.setLong(4,c.getTelefone());
                 stmt.setString(5,c.getRua());
                 stmt.setInt(6,c.getNumero());
                 stmt.setString(7,c.getBairro());
                 stmt.setString(8,c.getCidade());
                 
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void update(Clientes c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
       
        try{
                 stmt = con.prepareStatement("UPDATE cliente SET nome = ?, email = ?, documento = ?, telefone = ?, rua = ?, numero = ?, bairro = ?, cidade = ? WHERE id = ?");
                 
                 stmt.setString(1,c.getNome());
                 stmt.setString(2,c.getEmail()); 
                 stmt.setLong(3,c.getDocumento());
                 stmt.setLong(4,c.getTelefone());
                 stmt.setString(5,c.getRua());
                 stmt.setInt(6,c.getNumero());
                 stmt.setString(7,c.getBairro());
                 stmt.setString(8,c.getCidade());
                 stmt.setInt(9,c.getId());
                 
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<Clientes> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Clientes> clientes1 = new ArrayList<>();
        try{
            stmt=con.prepareStatement("SELECT * FROM cliente");
            rs=stmt.executeQuery();
            while(rs.next())
            {
                Clientes cliente = new Clientes();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setDocumento(rs.getLong("documento"));
                cliente.setTelefone(rs.getLong("telefone"));
                cliente.setRua(rs.getString("rua"));
                cliente.setNumero(rs.getInt("numero"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                
                clientes1.add(cliente);
            }
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Não foi possivel ler os dados do cliente"+ex);
        }
        finally
        {
            ConnectionFactory.closeConnection(con,stmt,rs);
        }
        return clientes1;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<Clientes> readParaClientes(String NomePesquisaCliente){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Clientes> clientes1 = new ArrayList<>();
        try{
            
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?");
            stmt.setString(1, "%" + NomePesquisaCliente + "%"); 
            
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Clientes cliente = new Clientes();
                
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setDocumento(rs.getLong("documento"));
                cliente.setTelefone(rs.getLong("telefone"));
                cliente.setRua(rs.getString("rua"));
                cliente.setNumero(rs.getInt("numero"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                
                clientes1.add(cliente);
            }
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Não foi possivel ler os dados do cliente"+ex);
        }
        finally
        {
            ConnectionFactory.closeConnection(con,stmt,rs);
        }
        return clientes1;
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
    public void delete(Clientes c)
    {
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement stmt =null;
        
         try{
            stmt = con.prepareStatement("DELETE FROM cliente WHERE id = ?");

            stmt.setInt(1, c.getId());

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