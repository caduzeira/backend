package br.com.ceduardo.exercicios;

import java.util.*;

public class SeparandoPorSexo {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite nome e o sexo separando por virgula (Exemplo:Nome-M ou F, Nome-M ou F");
        String resposta = s.nextLine();

        String[] lista = resposta.split(",");

        Map<String,String> masculino = new HashMap<>();
        Map<String,String> feminino = new HashMap<>();

        for(String nS:lista){
            String[] separar = nS.split("-");
            if(separar[1].equalsIgnoreCase("M")){
                masculino.put(separar[0], separar[1]);
            }else if(separar[1].equalsIgnoreCase("F")){
                feminino.put(separar[0], separar[1]);
            }else {
                System.out.println("Preencha os sexo da forma certa");
            }
        }
        System.out.println("Masculinos: " + masculino);
        System.out.println("Femininos: " + feminino);
    }
}
