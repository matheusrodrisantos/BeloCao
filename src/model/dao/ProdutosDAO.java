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
import model.bean.Produtos;

public class ProdutosDAO {
 
    public void create(Produtos p){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO produtos (nome, preco, tipo, quantidade_estoque)VALUES(?,?,?,?)");
            
            stmt.setString(1, p.getNome());
            stmt.setFloat(2, p.getPreco());
            stmt.setString(3, p.getTipo());
            stmt.setFloat(4, p.getQntd_produto());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<Produtos> readParaNome(String NomePesquisa){
    //Nessa função é pegado os dados do banco de dados e exibe na tabela.
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produtos> produtos1 = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM produtos WHERE nome LIKE ?");
            stmt.setString(1, "%" + NomePesquisa + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Produtos produto = new Produtos();
                
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setTipo(rs.getString("tipo"));
                produto.setQntd_produto(rs.getFloat("quantidade_estoque"));
                
                produtos1.add(produto);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na listagem de dados."+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos1;
    }

    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<Produtos> readParaTipo(String TipoPesquisa){
    //Nessa função é pegado os dados do banco de dados e exibe na tabela.
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produtos> produtos1 = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produtos WHERE tipo LIKE ?");
            stmt.setString(1, "%" + TipoPesquisa + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produtos produto = new Produtos();
                
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setTipo(rs.getString("tipo"));
                produto.setQntd_produto(rs.getFloat("quantidade_estoque"));
                
                produtos1.add(produto);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na listagem de dados."+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos1;
    }

    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<Produtos> read(){
    //Nessa função é pegado os dados do banco de dados e exibe na tabela.
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produtos> produtos1 = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produtos");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produtos produto = new Produtos();
                
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getFloat("preco"));
                produto.setTipo(rs.getString("tipo"));
                produto.setQntd_produto(rs.getFloat("quantidade_estoque"));
                
                produtos1.add(produto);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na listagem de dados."+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos1;
    }
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void update(Produtos p){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE produtos SET nome = ?, preco = ?, tipo = ?, quantidade_estoque = ? WHERE id = ?");
            
            stmt.setString(1, p.getNome());
            stmt.setFloat(2, p.getPreco());
            stmt.setString(3, p.getTipo());
            stmt.setFloat(4, p.getQntd_produto());
            stmt.setInt(5, p.getId());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void delete(Produtos p){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM produtos WHERE id = ?");
            
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}