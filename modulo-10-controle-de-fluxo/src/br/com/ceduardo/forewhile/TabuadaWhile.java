package br.com.ceduardo.forewhile;

import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar a tabuada de algum numero? ");
        String respota = s.next();

        while (respota.equalsIgnoreCase("Sim")){
            System.out.println("Digite um numero para gerar a tabuada: ");
            int num = s.nextInt();
            for(int i = 0; i <= 10; i++){
                System.out.println(num + " X " + i + " = " + num*i);
            }

            System.out.println("Deseja gerar novamente a tabuada? ");
            respota = s.next();
        }
        System.out.println("Obrigado. ");
    }
}
