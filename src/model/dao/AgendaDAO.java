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
import model.bean.Agenda;
//import java.awt.List;

/**
 *
 * @author iuri_
 */
public class AgendaDAO {
 
    public void create(Agenda ag){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO agenda (id_agenda, data, hora, id_servico, id_cliente, comentario) VALUES (?, ?, ?, ?, ?, ?)");
            
            stmt.setInt(1, ag.getId_agenda());
            stmt.setString(2, ag.getData());
            stmt.setString(3, ag.getHora());
            stmt.setInt(4, ag.getId_servico());
            stmt.setInt(5, ag.getId_cliente());
            stmt.setString(6, ag.getComentario());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    
    public void createAgendaServ(Agenda ag){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO agenda (id_agenda, data, hora, id_servico, id_cliente, comentario) VALUES (?, ?, ?, ?, ?, ?)");
//            SELECT agenda.id_agenda, cliente.nome, servico.tipo, servico.valor, agenda.data, agenda.hora, agenda.comentario from agenda INNER JOIN cliente on agenda.id_cliente = cliente.id INNER JOIN servico on agenda.id_servico = servico.id WHERE data LIKE ?
            
            stmt.setInt(1, ag.getId_agenda());
            stmt.setString(2, ag.getData());
            stmt.setString(3, ag.getHora());
            stmt.setInt(4, ag.getId_servico());
            stmt.setInt(5, ag.getId_cliente());
            stmt.setString(6, ag.getComentario());
            
            /*
            stmt.setInt(1, ag.getId_agenda());
            stmt.setString(2, ag.getNome());
            stmt.setString(3, ag.getTipo());
            stmt.setFloat(4, ag.getValor());
            stmt.setString(5, ag.getData());
            stmt.setString(6, ag.getHora());
            stmt.setString(7, ag.getComentario());   
            */         
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    

//------------------------------------------------------------------------------------------    
//------------------------------------------------------------------------------------------    
//------------------------------------------------------------------------------------------    
    
    
    public List<Agenda> readParaData(String DataPesquisa){
    //Nessa função é pegado os dados do banco de dados e exibe na tabela.
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Agenda> agenda1 = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT agenda.id_agenda, cliente.nome, servico.tipo, servico.valor, agenda.data, agenda.hora, agenda.comentario from agenda INNER JOIN cliente on agenda.id_cliente = cliente.id INNER JOIN servico on agenda.id_servico = servico.id WHERE data LIKE ?");
            stmt.setString(1, "%" + DataPesquisa + "%");
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Agenda agenda = new Agenda();
                
                agenda.setId_agenda(rs.getInt("id_agenda"));
                agenda.setNome(rs.getString("cliente.nome"));
                agenda.setTipo(rs.getString("servico.tipo"));
                agenda.setValor(rs.getFloat("servico.valor"));
                agenda.setData(rs.getString("data"));
                agenda.setHora(rs.getString("hora"));
                agenda.setComentario(rs.getString("comentario"));
               
                agenda1.add(agenda);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na listagem de dados."+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return agenda1;
    }

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<Agenda> read(){
    //Nessa função é pegado os dados do banco de dados e exibe na tabela.
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Agenda> agenda1 = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT agenda.id_agenda, cliente.nome, servico.tipo, servico.valor, agenda.data, agenda.hora, agenda.comentario from agenda INNER JOIN cliente on agenda.id_cliente = cliente.id INNER JOIN servico on agenda.id_servico = servico.id");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Agenda agenda = new Agenda();
                
                agenda.setId_agenda(rs.getInt("id_agenda"));
                agenda.setNome(rs.getString("cliente.nome"));
                agenda.setTipo(rs.getString("servico.tipo"));
                agenda.setValor(rs.getFloat("servico.valor"));
                agenda.setData(rs.getString("data"));
                agenda.setHora(rs.getString("hora"));
                agenda.setComentario(rs.getString("comentario"));
               
                agenda1.add(agenda);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na listagem de dados."+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return agenda1;
    }
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void update(Agenda ag){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE agenda SET data = ?, hora = ?, comentario = ? WHERE id_agenda = ?");
            
            
            stmt.setString(1, ag.getData());
            stmt.setString(2, ag.getHora());
            stmt.setString(3, ag.getComentario());
            stmt.setInt(4, ag.getId_agenda());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar!" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Agenda ag){
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM agenda WHERE id_agenda = ?");
            
            stmt.setInt(1, ag.getId_agenda());

            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}