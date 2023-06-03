package br.com.ceduardo.abstrata;

public class Comissionado extends Empregado{

    private Double totalVenda;

    private Double totalComicao;

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Double getTotalComicao() {
        return totalComicao;
    }

    public void setTotalComicao(Double totalComicao) {
        this.totalComicao = totalComicao;
    }

    @Override
    public Double vencimento() {
        return totalVenda*totalComicao;
    }
}
