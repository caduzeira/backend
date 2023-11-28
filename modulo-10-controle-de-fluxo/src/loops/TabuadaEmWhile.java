package loops;

import java.util.Scanner;

public class TabuadaEmWhile {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       System.out.println("Deseja gerar uma tabuada? (S/N)");
       String respota = s.nextLine();

       while (respota.equalsIgnoreCase("s")) {
            System.out.println("Digite um numero para gerar tabuada: ");
            int valor = s.nextInt();

            for(int count = 0; count <= 10; count++){
                System.out.println(count + " x " + valor + " = " + count*valor);
            }

            System.out.println("Deseja gerar outra tabuada? (S/N)");
            respota = s.next();
       }

       System.out.println("Obrigado!!");
    }
}
