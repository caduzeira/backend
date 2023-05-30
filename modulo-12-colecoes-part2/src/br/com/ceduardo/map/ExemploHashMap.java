package br.com.ceduardo.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Permite chaves e valores null. Nõa há garantia que os dados ficarão ordenados
 *
 * Para uma classe que implementa map, quaisquer classes que forem utilizadas como chave
 * devem sobrescrever os métodos hashCode() e equals()
 * */

public class ExemploHashMap {
    public static void main(String args[]){
        exemploListaSimples();
        exemploListaSimplesIterandoValores();
        exemploListaSimplesIterandoChaves();
        exemplosListaSimplesInterandoChaveValor();
    }

    private static void exemplosListaSimplesInterandoChaveValor() {
        System.out.println("****** Exemplo Lista Simples Interando chaves e valores ******");
        Map<Integer,String> lista = new HashMap<>();
        lista.put(1,"Carlos Eduardo");
        lista.put(2, "Amanda Fernanda");
        lista.put(3, "Lucia Ferreira");
        lista.put(4, "Josefa Ferreira");

        System.out.println("****** for comum ******");
        Set<Map.Entry<Integer,String>> entry = lista.entrySet();
        for(Map.Entry<Integer,String> e : entry){
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }

        System.out.println("****** forEach steam ******");
        lista.entrySet().forEach(e -> {
            System.out.println("Chave: "+ e.getKey());
            System.out.println("Valor: " + e.getValue());
        });

        System.out.println("****** forEach stream 1 ******");
        lista.keySet().stream().forEach(System.out::println);

        System.out.println("****** forEach stream 2 ******");
        lista.values().stream().forEach(System.out::println);

        System.out.println("****** forEach stream 3 ******");
        lista.forEach((key, value)-> System.out.println(key + " " + value));

        System.out.println("****** Iterator ******");
        Iterator<Map.Entry<Integer,String>> it = lista.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> entry1 = it.next();
            System.out.println("Chave: " + entry1.getKey());
            System.out.println("Valor: " + entry1.getValue());
        }
    }

    private static void exemploListaSimplesIterandoChaves() {
        System.out.println("****** Exemplo Lista Simples Interando chaves ******");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1,"Carlos Eduardo");
        lista.put(2, "Amanda Fernanda");
        lista.put(3, "Lucia Ferreira");

        for(Integer value : lista.keySet()){
            System.out.println(value);
        }

        System.out.println("");
    }

    private static void exemploListaSimplesIterandoValores() {
        System.out.println("****** Exemplo Lista Simples Iterando Valores******");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1,"Carlos Eduardo");
        lista.put(2, "Amanda Fernanda");
        lista.put(3, "Lucia Ferreira");

        for(String value : lista.values()){
            System.out.println(value);
        }

        System.out.println("");
    }


    private static void exemploListaSimples() {
        System.out.println("****** Exemplo Lista Simples ******");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1,"Carlos Eduardo");
        lista.put(2, "Amanda Fernanda");

        System.out.println(lista);
        System.out.println("");
    }
}
