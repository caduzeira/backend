package br.com.ceduardo.ifelse;

import java.util.Scanner;

public class ExemploPPT1Console {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade: ");

        int resultado = s.nextInt();

        if(resultado >= 1 && resultado <= 12){
            System.out.println("Você ainda é criança");
        }else if(resultado >= 13 && resultado <= 19){
            System.out.println("Você ainda é adolecente");
        }else{
            System.out.println("Você é adulto");
        }
    }
}
