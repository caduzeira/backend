package br.com.ceduardo.forewhile;

import java.util.Scanner;

public class TabuadaFor {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero para ver a tabuada: ");
        int valor = s.nextInt();
        for(int i = 0; i <= 10; i++){
            System.out.println(valor + " X " + i + " = " + valor*i);
        }
    }
}
