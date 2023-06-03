package br.com.ceduardo.exercicio;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getIndetificacao() {
        return cpf;
    }
}
