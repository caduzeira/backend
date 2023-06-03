package br.com.ceduardo.interfaces;

import br.com.ceduardo.interfaces.*;

public class ClasseTeste {
    public static void main(String args[]){
        System.out.println("****** Caneta Esferografica ******");
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Carlos");
        caneta.getCor();
        caneta.escreverComumATodos();

        System.out.println("****** Giz ******");
        ICaneta giz = new Giz();
        giz.escrever("Ola Carlos");
        giz.getCor();
        giz.escreverComumATodos();

        System.out.println("****** Carro Passeio ******");
        ICarro carro = new CarroPasseio();
        carro.andar();
        carro.parar();

        System.out.println("****** Caminhão ******");
        ICarro caminhao = new Caminhao();
        caminhao.andar();
        caminhao.parar();
    }
}
