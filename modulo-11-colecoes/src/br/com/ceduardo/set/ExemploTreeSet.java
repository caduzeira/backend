package br.com.ceduardo.set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String args[]){
        /*
        * Não repete valores na lista
        * Tem ordem natural dos objetos
        * */
        exemploListaSimples();
    }
    private static void exemploListaSimples(){
        System.out.println("****** Exemplo Lista Simples ******");
        Set<String> lista = new TreeSet<>();
        lista.add("João Silva");
        lista.add("Antonio da Silva");
        lista.add("Lucia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }
}
