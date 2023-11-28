package loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero para gerar tabuada: ");
        int valor = s.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(valor + " x " + i + " = " + valor*i);
        }
    }
}
