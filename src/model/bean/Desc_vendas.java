package model.bean;

public class Desc_vendas {
    
    private int id;
    private int id_venda;
    private int id_produto;
    private int qntd_vendida;
    private String nome;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getQntd_vendida() {
        return qntd_vendida;
    }

    public void setQntd_vendida(int qntd_vendida) {
        this.qntd_vendida = qntd_vendida;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
