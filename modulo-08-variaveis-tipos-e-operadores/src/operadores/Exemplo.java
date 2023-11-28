package operadores;

public class Exemplo {
    public static void main(String[] args) {
       operadoresAritmeticos();
    }

    private static void operadoresAritmeticos() {
        int num1 = 10;
        int num2 = 20;

        int soma = num1 + num2;
        System.out.println("SOMA:" + soma);

        int subtracao = num1 - num2;
        System.out.println("SUBTRAÇÃO: " + subtracao);

        int divisao = num1 / num2;
        System.out.println("DIVISÃO: " + divisao);

        int multiplicacao = num1 * num2;
        System.out.println("MULTIPLICAÇÃO: " + multiplicacao);

        int mistura = (num1 + num2) / 2;
        System.out.println("MISTURA: " + mistura);
    }
}
