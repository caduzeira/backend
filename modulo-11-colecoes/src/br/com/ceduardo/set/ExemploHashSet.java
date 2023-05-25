package br.com.ceduardo.set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String args[]){
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNovo();
    }

    private static void exemploNovo() {
        System.out.println("****** Exemplo Novo ******");
        Set<Integer> inteiro = new HashSet<>();
        inteiro.add(1);
        inteiro.add(2);
        inteiro.add(3);
        System.out.println(inteiro);
        System.out.println("");
    }

    private static void exemploListaSimples(){
        System.out.println("****** Exemplo Lista Simples ******");
        Set<String> lista = new HashSet<>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lucia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente(){

    }

}
