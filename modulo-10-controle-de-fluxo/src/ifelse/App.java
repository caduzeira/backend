package ifelse;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        exemploScanner();
        exemploCondicionais();
        exemploCondicionais2();
        exemploCondicionais3();
    }

    private static void exemploCondicionais3() {
        int result = 5;
        if(result > 1 && result < 5){
            System.out.println("Valor entre 1 e 5");
        }else if(result >= 5 && result <= 10){
            System.out.println("Valor entre 5 e 10");
        }else{
            System.out.println("Valor fora disso");
        }
    }

    private static void exemploScanner() {
        System.out.println("**********EXEMPLO SCANNER**********");
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        
        System.out.println("Digite seu nome: ");
        String nome = s.nextLine();

        System.out.println("Digite sua altura: ");
        Double altura = s.nextDouble();
        
        System.out.println("Ola, " + nome + "Você tem " + idade + " de idade " + "e" + altura + " de altura");

    }

    private static void exemploCondicionais2() {
        System.out.println("**********EXEMPLO 2**********");
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int result = s.nextInt();

        if(result > 1 && result < 5 ){
            System.out.println("Resultado ente 1 e 5");
        }else if(result >= 5 && result < 8){
            System.out.println("Resultado ente 5 e 8");
        }else{
            System.out.println("Resultado não se encaixa nas alteriores");
        }
    }

    private static void exemploCondicionais() {
        System.out.println("**********EXEMPLO**********");

        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int result = s.nextInt();

        if(result > 1){
            System.out.println("Resultado maior que 1");
        }else{
            System.out.println("Resultado menor que 1");
        }
    }
}
