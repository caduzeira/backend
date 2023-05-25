package br.com.ceduardo.list;

/*
* Ao contrario do ArrayList, as buscas são lentas e inserções e exclusões são rapidas
*
* */

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinledList {
    public static void main(String args[]){
        exemploListaSimples();
        exemploListaSimplesOrdenada();
    }

    private static void exemploListaSimples(){
        System.out.println("****** Exemplo Lista Simples ******");
        List<String> lista = new LinkedList<>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lucia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenada(){
        System.out.println("****** Exemplo Lista Simples Ordenada ******");
        List<String> lista = new LinkedList<>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lucia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");

        lista.remove(0);
        System.out.println(lista);
        boolean contem = lista.contains("João da Silva");
        System.out.println(contem);

        for(String nome: lista){
            System.out.println(nome);
        }

        System.out.println(lista.get(0));
    }
}
