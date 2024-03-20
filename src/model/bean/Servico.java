package model.bean;

/**
 *
 * @author iuri_
 */
public class Servico {

    private int id;
    private String tipo;
    private float valor;
    private String descricao;
   
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return getTipo(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
