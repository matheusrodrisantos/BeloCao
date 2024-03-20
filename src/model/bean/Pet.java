
package model.bean;

import javax.swing.JTextField;

public class Pet {
    private int id;
    private int id_cliente;
    private String nome_pet;
    private String nome_dono;
    private String raca;
    private String nascimento; 
    private String descricao;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_cliente() {
        return id;
    }
    public void setId_cliente(int id_cliente) {
        this.id = id_cliente;
    }
    /**
     * @return the nome
     */
    public String getNome_pet() {
        return nome_pet;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome_pet(String nome_pet) {
        this.nome_pet = nome_pet;
    }
    
    public String getNome_dono() {
        return nome_dono;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome_dono(String nome_dono) {
        this.nome_dono = nome_dono;
    }

    /**
     * @return the email
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param email the email to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the documento
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * @param documento the documento to set
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the telefone
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
