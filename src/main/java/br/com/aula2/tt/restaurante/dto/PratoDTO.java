package br.com.aula2.tt.restaurante.dto;

public class PratoDTO {
    private Double preco;
    private String descricao;
    private Integer quantidade;

    public PratoDTO() {
    }

    public PratoDTO(Double preco, String descricao, Integer quantidade) {
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
