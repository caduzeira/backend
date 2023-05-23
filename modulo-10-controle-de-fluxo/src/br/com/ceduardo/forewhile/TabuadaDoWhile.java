package br.com.ceduardo.forewhile;

import java.util.Scanner;

public class TabuadaDoWhile {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        String respota = "";

        do{
            System.out.println("Digite um número para gerar a tabuada: ");
            int num = s.nextInt();
            for(int i = 0; i <= 10; i++){
                System.out.println(num + " X " + i + " = " + num*i);
            }

            System.out.println("Deseja gerar novamente a tabuada de algum numero? ");
            respota = s.next();
        }while (respota.equalsIgnoreCase("Sim"));
    }
}
