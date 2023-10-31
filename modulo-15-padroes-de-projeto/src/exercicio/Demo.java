package exercicio;

public class Demo {
    public static void main(String[] args) {
        Contrato cliente = new Contrato("B", true);
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.criar(cliente.getTipoCategoria());
        carro.partida();
    }

    private static Fabrica getFabrica(Contrato cliente) {
        if(cliente.isTemContrato()){
            return new ContratoFabrica();
        }else{
            return new SemContratoFabrica();
        }
    }
}
