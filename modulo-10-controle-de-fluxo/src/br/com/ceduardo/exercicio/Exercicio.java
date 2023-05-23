package br.com.ceduardo.exercicio;

import java.util.Scanner;

public class Exercicio {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar media de notas? ");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("Sim")){
            System.out.println("Nota primeiro bimestre: ");
            Float primeiro = s.nextFloat();

            System.out.println("Nota segundo bimestre: ");
            Float segundo = s.nextFloat();

            System.out.println("Nota terceiro bimestre: ");
            Float terceiro = s.nextFloat();

            System.out.println("Nota quarto bimestre: ");
            Float quarto = s.nextFloat();

            Float media = (primeiro + segundo + terceiro + quarto) / 4;

            if(media >= 7 ){
                System.out.println("Resultado: Aprovado");
                System.out.println("Media: " + media);
            }else if(media >= 5){
                System.out.println("Resultado: Recuperação");
                System.out.println("Media: " + media);
            }else{
                System.out.println("Resultado: Reprovado");
                System.out.println("Media: " + media);
            }

            System.out.println("Deseja gerar novamente a tabuada? ");
            resposta = s.next();
        }
        System.out.println("Obrigado");
    }
}
