package switchcase;

import java.util.Scanner;

public class ExemploSwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();

        switch (idade) {
            case 0:
            case 5:
                System.out.println("Você é um bebe");
                break;
            case 6:
            case 10:
                System.out.println("Você é uma criança");
            case 11:
            case 18:
                System.out.println("Você é um adolescente");
            default:
                System.out.println("Você é um adulto");
                break;
        }
    }
}
