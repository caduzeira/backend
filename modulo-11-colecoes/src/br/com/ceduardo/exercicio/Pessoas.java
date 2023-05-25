package br.com.ceduardo.exercicio;

import br.com.ceduardo.exercicio.util.Pessoa;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pessoas {
    public static void main(String args[]){
        exercicioPessoas();
    }

    private static void exercicioPessoas() {
        List<Pessoa> listaHomem = new ArrayList<>();
        List<Pessoa> listaMulher = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("DIGITE SIM PARA INSERIR SEUS DADOS NO ARRAY");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("Sim")){
            System.out.println("Qual seu nome?");
            String nome = s.next();

            System.out.println("Seu sexo é masculino ou feminino?");
            String sexo = s.next();

            System.out.println("Qual sua idade?");
            Integer idade = s.nextInt();

            if(sexo.equalsIgnoreCase("Masculino")){
                Pessoa a = new Pessoa(nome,sexo,idade);
                listaHomem.add(a);
            }else if(sexo.equalsIgnoreCase("Feminino")){
                Pessoa b = new Pessoa(nome,sexo,idade);
                listaMulher.add(b);
            }else{
                System.out.println("Digite um sexo valido");
            }
            System.out.println("Quer colocar mais uma pessoa?");
            resposta = s.next();
        }
        System.out.println("Obrigado, sua lista fico assim");
        System.out.println("Para homens" + listaHomem);
        System.out.println("Para Mulheres" + listaMulher);
    }
}
