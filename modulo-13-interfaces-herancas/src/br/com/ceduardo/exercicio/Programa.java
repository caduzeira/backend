package br.com.ceduardo.exercicio;

public class Programa {
    public static void main(String args[]){
        System.out.println("****** Pessoa Fisica ******");
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Carlos");
        pessoaFisica.setEndereco("Rua X");
        pessoaFisica.setCpf("1");
        imprimir(pessoaFisica);

        System.out.println("****** Pessoa Juridica ******");
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Amanda");
        pessoaJuridica.setEndereco("Rua Y");
        pessoaJuridica.setCnpj("1");
        imprimir(pessoaJuridica);
    }

    public static void imprimir(Pessoa pessoa){
        String type = pessoa.getClass().getSimpleName();
        if(type.equalsIgnoreCase("PessoaFisica")){
            System.out.println("Nome: " + pessoa.getNome() + " - " + "Endereço: " + pessoa.getEndereco() + " - " + "CPF: " + pessoa.getIndetificacao());
        } else if (type.equalsIgnoreCase("PessoaJuridica")) {
            System.out.println("Nome: " + pessoa.getNome() + " - " + "Endereço: " + pessoa.getEndereco() + " - " + "CNPJ: " + pessoa.getIndetificacao());
        }else{
            System.out.println("Tipo não identificado");
        }
    }
}
