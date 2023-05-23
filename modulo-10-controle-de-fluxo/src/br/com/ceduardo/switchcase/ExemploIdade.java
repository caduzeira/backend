package br.com.ceduardo.switchcase;

import java.util.Scanner;

public class ExemploIdade {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um animal: ");
        String resultado = s.next();

        switch (resultado){
            case "DOG":
            case "CAT":
                resultado = "Animal dometica";
                break;
            case "TIGER":
                resultado = "Animal selva";
                break;
            default:
                resultado = "Nem um nem outro";
                break;
        }
        System.out.println(resultado);
    }
}
