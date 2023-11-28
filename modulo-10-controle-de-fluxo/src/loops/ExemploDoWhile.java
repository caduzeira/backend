package loops;

import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String respota = "";
        do{
            System.out.println("Digite um numero para gerar a tabuada: ");
            int num = s.nextInt();

            for(int i = 0; i <= 10;i++){
                System.out.println(num + " x " + i + " = " + i*num);
            }

            System.out.println("Deseja gerar novamente a tabuada? (s/n)");
            respota = s.next();
        } while (respota.equalsIgnoreCase("S"));
    }
}
