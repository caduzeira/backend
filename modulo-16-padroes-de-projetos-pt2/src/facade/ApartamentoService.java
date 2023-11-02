package facade;

public class ApartamentoService implements IApartamento{

    public Boolean cadastraApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isApartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isValidarCampos(apartamento);
        Boolean isCadastradoNoBanco = cadastrarNoBanco(apartamento);
        if(isCadastrado && !isCamposValidos && isCadastradoNoBanco){
            return false;
        }
        return null;
    }

    private Boolean cadastrarNoBanco(Apartamento apartamento){
        return true;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento){
        //Ir no banco e verificar se está cadastrado
        return false;
    }

    private Boolean isValidarCampos(Apartamento apartamento){
        return true;
    }
}
