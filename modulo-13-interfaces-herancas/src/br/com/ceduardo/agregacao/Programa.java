package br.com.ceduardo.agregacao;

public class Programa {
    public static void main(String args[]){
        Produto produto = criarProduto(1l,10d,"tv");

        Vendedor vendedor = criarVendedor("Carlos",10d);

        Comprador comprador = criarComprador("Amanda",50d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produto);

        venda.concretizarVenda();
    }

    private static Comprador criarComprador(String nome, Double verba) {
        Comprador comprador = new Comprador(nome,verba);
        return comprador;
    }

    private static Vendedor criarVendedor(String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(comissao);
        vendedor.setNome(nome);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();

        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;
    }
}
