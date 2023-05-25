package br.com.ceduardo.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
    public static void main(String args[]){
        /*
        * Elementos interados na ordem em que foram inseridos
        * */
        exemploListaSimples();
    }
    private static void exemploListaSimples(){
        System.out.println("****** Exemplo Lista Simples ******");
        Set<String> lista = new LinkedHashSet<>();
        lista.add("Carlos Eduardo");
        lista.add("Antonio Silva");
        lista.add("Lucia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }
}
