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
import model.bean.Desc_vendas;

public class Desc_vendasDAO {
    
    
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
    
    public void create(Desc_vendas dv){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO descricao_venda (id_venda, id_produto, quantidade_vendida)VALUES(?,?,?)");
            
            stmt.setInt(1, dv.getId_venda());
            stmt.setInt(2, dv.getId_produto());
            stmt.setInt(3, dv.getQntd_vendida());
            
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
    
    public List<Desc_vendas> readParaId_venda(String Id_vendaPesquisa){
    //Nessa função é pegado os dados do banco de dados e exibe na tabela.
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Desc_vendas> desc_venda1 = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT descricao_venda.id_venda, produtos.nome, descricao_venda.quantidade_vendida from descricao_venda INNER JOIN produtos on descricao_venda.id_produto = produtos.id WHERE id_venda LIKE ?");
            stmt.setString(1, "%" + Id_vendaPesquisa + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Desc_vendas desc_venda = new Desc_vendas();
                
                desc_venda.setId_venda(rs.getInt("id_venda"));
                desc_venda.setNome(rs.getString("produtos.nome"));
                desc_venda.setQntd_vendida(rs.getInt("quantidade_vendida"));
                
                desc_venda1.add(desc_venda);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na listagem de dados."+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return desc_venda1;
    }
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------- 
    
    public List<Desc_vendas> read(){
    //Nessa função é pegado os dados do banco de dados e exibe na tabela.
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Desc_vendas> desc_venda1 = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT descricao_venda.id_venda, produtos.nome, descricao_venda.quantidade_vendida from descricao_venda INNER JOIN produtos on descricao_venda.id_produto = produtos.id");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Desc_vendas desc_venda = new Desc_vendas();
                
//                desc_venda.setId(rs.getInt("id"));
                desc_venda.setId_venda(rs.getInt("id_venda"));
                desc_venda.setNome(rs.getString("produtos.nome"));
                desc_venda.setQntd_vendida(rs.getInt("quantidade_vendida"));
                
                desc_venda1.add(desc_venda);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na listagem de dados."+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return desc_venda1;
    }
    
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------- 
    
     public void update(Desc_vendas dv){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE descricao_venda SET id_venda = ?, id_produto = ?, quantidade_vendida = ? WHERE id = ?");
            
            stmt.setInt(1, dv.getId_venda());
            stmt.setInt(2, dv.getId_produto());
            stmt.setInt(3, dv.getQntd_vendida());

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
    
    public void delete(Desc_vendas dv){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM descricao_venda WHERE id = ?");
            
            stmt.setInt(1, dv.getId());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    } 
      
}