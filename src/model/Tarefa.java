package model;

import java.util.Date;

/**
 *
 * @author Neojhon
 */
public class Tarefa {

    /**
     * Atributos
     */
    private int id;
    private int idProjetos;// essa vai ser a chave estrangeira(Foreign Key)
    private String nome;
    private String descricao;
    private boolean completada;
    private String observacoes;
    private Date prazo;
    private Date createdAt;
    private Date updatedAt;

    /**
     * Construtor 1
     */
    public Tarefa(int id, int idProjetos, String nome, String descricao, boolean completada, String observacoes, Date prazo, Date createdAt, Date updatedAt) {
        this.id = id;
        this.idProjetos = idProjetos;
        this.nome = nome;
        this.descricao = descricao;
        this.completada = completada;
        this.observacoes = observacoes;
        this.prazo = prazo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Construtor 2
     */
    public Tarefa() {
        //cria um data quando não for passado
        //nenhum parêmetro para o Construtor
        this.prazo = new Date();
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

    public int getIdProjetos() {
        return idProjetos;
    }

    public void setIdProjetos(int idProjetos) {
        this.idProjetos = idProjetos;
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

    public boolean ehCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
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
        return "Tarefa{" + "id=" + id + ", idProjetos=" + idProjetos + ", nome=" + nome + ", descrição=" + descricao + ", completada=" + completada + ", observações=" + observacoes + ", prazo=" + prazo + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
}
