package model.bean;

/**
 *
 * @author iuri_
 */
public class Produtos {

    private int id;
    private String nome;
    private float preco;
    private String tipo;
    private float qntd_produto;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getQntd_produto() {
        return qntd_produto;
    }

    public void setQntd_produto(float qntd_produto) {
        this.qntd_produto = qntd_produto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
