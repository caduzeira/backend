package exercicio;

public class SemContratoFabrica extends Fabrica {

    @Override
    Carro retrieveCarro(String tipoContrato) {
        if("A".equalsIgnoreCase(tipoContrato)){
            return new TipoVeiculo("CG Start", "Honda", "Vermelho", 160, "Moto", "Gasolina");
        }else if("B".equalsIgnoreCase(tipoContrato)){
            return new TipoVeiculo("Strada", "Fiat", "Azul", 107, "Carro", "Diesel");
        }else if("C".equalsIgnoreCase(tipoContrato)){
            return new TipoVeiculo("Van de Escola", "Mercedes", "Cinza", 200, "Van", "Alcool");
        }else if("D".equalsIgnoreCase(tipoContrato)){
            return new TipoVeiculo("MB 2544", "Mercedes", "Vermelha", 400, "Caminhão", "Diesel");
        }else{
            return null;
        }
    }
    
}
