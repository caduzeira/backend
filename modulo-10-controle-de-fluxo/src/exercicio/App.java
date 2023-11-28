package exercicio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar media do aluno? (s/n)");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("s")) {
            System.out.println("Nota primeiro bimestre: ");
            Float primeiro_bimestre = s.nextFloat();

            System.out.println("Nota segundo bimestre: ");
            Float segundo_bimestre = s.nextFloat();

            System.out.println("Nota terceiro bimestre: ");
            Float terceiro_bimestre = s.nextFloat();

            System.out.println("Nota quarto bimestre: ");
            Float quarto_bimestre = s.nextFloat();

            Float media = (primeiro_bimestre + segundo_bimestre + terceiro_bimestre + quarto_bimestre) / 4;

            if(media >= 7){
                System.out.println("Resultado: " + "APROVADO" + " - " + " Media: " + media);
            }else{
                System.out.println("Resultado: " + "REPROVADO" + " - " + " Media: " + media);
            }
            System.out.println("Deseja gerar mais notas? ");
            resposta = s.next();
        }
    }
}
