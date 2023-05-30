package br.com.ceduardo.exercicios;

import java.util.*;

public class NomesPorVirgula {
    public static void main(String args[]){
     Scanner s = new Scanner(System.in);

     System.out.println("Digite nomes separados por virgula");
     String entrada = s.next();

     String[] lista = entrada.split(",");

     List<String> listaNomes = new LinkedList<>();
     for(String n : lista){
         listaNomes.add(n);
     }

     System.out.println("****** Antes de ordenado ******");
     for(String n:listaNomes){
         System.out.println(n);
     }
     System.out.println("****** Depois de ordenado ******");
     Collections.sort(listaNomes);
     for(String n:listaNomes){
         System.out.println(n);
     }
    }
}