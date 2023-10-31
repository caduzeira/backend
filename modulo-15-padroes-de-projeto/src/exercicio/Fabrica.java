package exercicio;

public abstract class Fabrica {
    
    public Carro criar(String tipoContrato){
        Carro carro = retrieveCarro(tipoContrato);
        carro = preparaCarro(carro);
        return carro;
    }

    private Carro preparaCarro(Carro carro) {
        carro.limpeza();
        carro.combustivel();
        carro.mecanica();
        return carro;
    }

    abstract Carro retrieveCarro(String tipoContrato);
}
