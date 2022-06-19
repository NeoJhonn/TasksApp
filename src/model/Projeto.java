package model;

import java.util.Date;

/**
 *
 * @author Neojhon
 */
public class Projeto {

    /**
     * Atributos
     */
    private int id;
    private String nome;
    private String descricao;
    private Date createdAt;
    private Date updatedAt;

    /**
     * Construtor 1
     */
    public Projeto(int id, String nome, String descricao, Date createdAt, Date updatedAt) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Construtor 2
     */
    public Projeto() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    /**
     * Getters e Setters
     */
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        return this.nome;
    }

}
