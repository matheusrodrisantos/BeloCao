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
import model.bean.Vendas;

public class VendasDAO {
    
    
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
    
    public void create(Vendas v){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO vendas (id_cliente, valor_total, data)VALUES(?,?,?)");
            
            stmt.setInt(1, v.getId_cliente());
            stmt.setFloat(2, v.getValor());
            stmt.setString(3, v.getData());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------    
    
    public List<Vendas> readParaData(String DataPesquisa){
    //Nessa função é pegado os dados do banco de dados e exibe na tabela.
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Vendas> vendas1 = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM vendas WHERE data LIKE ?");
            stmt.setString(1, "%" + DataPesquisa + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Vendas vendas = new Vendas();
                
                vendas.setId(rs.getInt("id"));
//                vendas.setId_cliente(rs.getInt("id_cliente"));
                vendas.setData(rs.getString("data"));
                vendas.setValor(rs.getFloat("valor_total"));
                
                
                vendas1.add(vendas);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na listagem de dados."+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return vendas1;
    }
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------- 
    
    public List<Vendas> read(){
    //Nessa função é pegado os dados do banco de dados e exibe na tabela.
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Vendas> vendas1 = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM vendas");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Vendas vendas = new Vendas();
                
                vendas.setId(rs.getInt("id"));
                vendas.setData(rs.getString("data"));
              //vendas.setId_cliente(rs.getInt("id_cliente"));
                vendas.setValor(rs.getFloat("valor_total"));
              //  vendas.setData(rs.getString("data"));
                
                vendas1.add(vendas);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na listagem de dados."+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return vendas1;
    }
    
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------- 
    
     public void update(Vendas v){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE vendas SET id_cliente = ?, valor_total = ?, data = ? WHERE id = ?");
            
            stmt.setInt(1, v.getId_cliente());
            stmt.setFloat(2, v.getValor());
            stmt.setString(3, v.getData());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------- 
    
    public void delete(Vendas v){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM vendas WHERE id = ?");
            
            stmt.setInt(1, v.getId());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    } 
      
}
