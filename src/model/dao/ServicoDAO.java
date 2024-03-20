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
import model.bean.Servico;
//import java.awt.List;

/**
 *
 * @author iuri_
 */
public class ServicoDAO {
 
    public void create(Servico ser){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO servico (tipo, valor, descricao)VALUES(?,?,?)");
            
            stmt.setString(1, ser.getTipo());
            stmt.setFloat(2, ser.getValor());
            stmt.setString(3, ser.getDescricao());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<Servico> readParaTipo(String TipoPesquisa){
    //Nessa função é pegado os dados do banco de dados e exibe na tabela.
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Servico> servico1 = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM servico WHERE tipo LIKE ?");
            stmt.setString(1, "%" + TipoPesquisa + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Servico servico = new Servico();
                
                servico.setId(rs.getInt("id"));
                servico.setTipo(rs.getString("tipo"));
                servico.setValor(rs.getFloat("valor"));
                servico.setDescricao(rs.getString("descricao"));
                
                
                servico1.add(servico);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na listagem de dados."+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return servico1;
    }

    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public List<Servico> readParaTipo(String TipoPesquisa){
//    //Nessa função é pegado os dados do banco de dados e exibe na tabela.
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        
//        List<Produtos> produtos1 = new ArrayList<>();
//        
//        try {
//            stmt = con.prepareStatement("SELECT * FROM produtos WHERE tipo LIKE ?");
//            stmt.setString(1, "%" + TipoPesquisa + "%");
//            
//            rs = stmt.executeQuery();
//            
//            while(rs.next()){
//                Servico servico = new Servico();
//                
//                servico.setId(rs.getInt("id"));
//                servico.setTipo(rs.getString("tipo"));
//                servico.setValor(rs.getFloat("valor"));
//                servico.setDescricao(rs.getString("descricao"));
//                
//                produtos1.add(produto);
//            }
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Falha na listagem de dados."+ex);
//        }finally{
//            ConnectionFactory.closeConnection(con, stmt, rs);
//        }
//        
//        return produtos1;
//    }

    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<Servico> read(){
    //Nessa função é pegado os dados do banco de dados e exibe na tabela.
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Servico> servico1 = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM servico");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Servico servico = new Servico();
                
                servico.setId(rs.getInt("id"));
                servico.setTipo(rs.getString("tipo"));
                servico.setValor(rs.getFloat("valor"));
                servico.setDescricao(rs.getString("descricao"));
                
                servico1.add(servico);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na listagem de dados."+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return servico1;
    }
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void update(Servico ser){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE servico SET tipo = ?, valor = ?, descricao = ? WHERE id = ?");
            
            stmt.setString(1, ser.getTipo());
            stmt.setFloat(2, ser.getValor());
            stmt.setString(3, ser.getDescricao());
            stmt.setInt(4, ser.getId());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void delete(Servico ser){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM servico WHERE id = ?");
            
            stmt.setInt(1, ser.getId());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}