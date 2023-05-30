package br.com.ceduardo.map;

import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String args[]){
       exemploListaSimples();
    }

    private static void exemploListaSimples(){
        System.out.println("****** Exemplo Lista Simples ******");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "Carlos Eduardo");
        lista.put(2, "Eduardo Carlos");
        lista.put(4, "Amanda Fernanda");

        System.out.println(lista);
        System.out.println("");
    }
}
