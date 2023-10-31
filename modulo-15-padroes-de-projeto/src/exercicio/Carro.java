package exercicio;

public abstract class Carro {
    
    private String nome;
    private String modelo;
    private String cor;
    private int potencia;
    private String tipoVeiculo;
    private String combustivel;

    public Carro(String nome, String modelo, String cor, int potencia, String tipoVeiculo, String combustivel) {
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
        this.tipoVeiculo = tipoVeiculo;
        this.combustivel = combustivel;
    }

    public void partida(){
        System.out.println("Modelo: " + nome);
        System.out.println("Marca: " + modelo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Tipo de veiculo: " + tipoVeiculo);
    }

    public void limpeza(){
        System.out.println("Limpeza: " + "OK");
        System.out.println("Cor: " + cor);
    }

    public void mecanica(){
        System.out.println("Mecanica: " + "OK");
        System.out.println("Combustivel: " + combustivel);
    }

    public void combustivel(){}
}
