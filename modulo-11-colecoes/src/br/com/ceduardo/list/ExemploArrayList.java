package br.com.ceduardo.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
    public static void main(String args[]){
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();
    }

    private static void exemploNumeros() {
        System.out.println("***** Exemplo Numeros");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(4);
        numeros.add(10);
        System.out.println(numeros);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("***** Exemplo Lista Simples Ordem Ascendente");
        List<String> lista = new ArrayList<>();
        lista.add("Carlos Eduardo");
        lista.add("Josefa Alves");
        lista.add("Amanda Fernanda");
        Collections.sort(lista);//Ordenar coleções
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimples() {
        System.out.println("***** Exemplo Lista Simples *****");
        List<String> lista = new ArrayList<>();
        lista.add("Carlos Eduardo");
        lista.add("Amanda Fernanda");
        lista.add("Josefa Alves");
        System.out.println(lista);
        System.out.println("");
    }
}
