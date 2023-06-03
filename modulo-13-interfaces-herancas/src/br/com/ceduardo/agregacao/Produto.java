package br.com.ceduardo.agregacao;

public class Produto {

    private Long codigo;

    private String nome;

    private Double preco;

    public void vendido(){
        System.out.println("Vendido");
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
