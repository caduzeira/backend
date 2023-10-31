package exercicio;

public class ContratoFabrica extends Fabrica {

    Carro retrieveCarro(String tipoContrato) {
        if("A".equalsIgnoreCase(tipoContrato)){
            return new TipoVeiculo("CG Titan", "Honda", "Vermelho", 160, "Moto", "Gasolina");
        }else if("B".equalsIgnoreCase(tipoContrato)){
            return new TipoVeiculo("Argo", "Fiat", "Azul", 107, "Carro", "Diesel");
        }else if("C".equalsIgnoreCase(tipoContrato)){
            return new TipoVeiculo("Sprinter Van", "Mercedes", "Cinza", 200, "Van", "Alcool");
        }else if("D".equalsIgnoreCase(tipoContrato)){
            return new TipoVeiculo("MB 2544", "Mercedes", "Vermelha", 400, "Caminhão", "Diesel");
        }else{
            return null;
        }
    }
    
}
