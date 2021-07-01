package br.com.aula2.tt.restaurante.entities;

import java.math.BigDecimal;

public class Prato {
    private Long id;
    private BigDecimal preco;
    private String descricao;
    private Double quantidade;

    public Prato(Long id, BigDecimal preco, String descricao, Double quantidade) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}
