package model.bean;

/**
 *
 * @author iuri_
 */
public class Agenda {

    private int id_agenda;
    private int id_cliente;
    private int id_servico;
    private String data;
    private String hora;
    private String comentario;
    private String nome;
    private String tipo;
    private float valor;
    

    public int getId_agenda() {
        return id_agenda;
    }
    
    public int getId_cliente() {
        return id_cliente;
    }
    
    public int getId_servico() {
        return id_servico;
    }
    
    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }
    
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

     public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String toString() {
        return getTipo(); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getString(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
