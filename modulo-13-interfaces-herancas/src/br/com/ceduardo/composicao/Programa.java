package br.com.ceduardo.composicao;

public class Programa {
    public static void main(String args[]){
        Banco banco = new Banco();
        banco.setCdigo(10l);
        banco.setNome("Banco Pires");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(10d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(10d);
    }
}
