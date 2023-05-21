// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        operacoesAritmeticas();
        operacoesAtribuicaos();
        operecoesIncrementoDecremento();
        operacoesRelacionais();
    }

    private static void operacoesRelacionais() {
        System.out.println("****Operacões de Relacionais****");
        //todo boolean você declara com is na frente
        int num1 = 10;
        int num2 = 10;

        boolean isMaior = num1 > num2;
        boolean isMaior2 = num1 == num2;
        boolean isMaior3 = num1 != num2;
        boolean isMaior4 = num1 >= num2;
        boolean isMaior5 = num1 <= num2;

        System.out.println("isMaior: " +  isMaior);
        System.out.println("isIgual: " + isMaior2);
        System.out.println("isDiferente: " + isMaior3);
        System.out.println("isMaiorOuIgual: " + isMaior4);
        System.out.println("isMenorOuIgual: " + isMaior4);

        //Operadores logicos
        boolean isDentro = num1 >= 1 && num1 <= 10;

        boolean isDentro2 = num1 >= 1 || num1 <= 10;

        boolean isDentro3 = num1 >= 1 || num1 <= 10;

        System.out.println("isDentroE: " + isDentro);
        System.out.println("isDentroOu: " + isDentro2);
        System.out.println("isDentroNOT: " + isDentro3);
    }

    private static void operecoesIncrementoDecremento() {
        System.out.println("****Operacões de incremento e decremento****");
        int num1 = 10;
        int num2 = 20;

        num1++;
        System.out.println(num1);

        num1--;
        System.out.println(num1);

        //OU

        ++num1;
        System.out.println(num1);

        --num1;
        System.out.println(num1);
    }

    private static void operacoesAtribuicaos() {
        System.out.println("****Operacões de atribuição****");
        int num1 = 0;
        int num2 = 10;
        System.out.println(num2);
        num2 += num2;

        System.out.println(num2);
    }

    public static void operacoesAritmeticas(){
        System.out.println("****Operacões aritmeticas****");
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int resultado = num2 + num1;
        int resultado2 = (num2 + num1) * num3;
        int resultado3 = num2 - num1;
        int resultado4 = num2 * num1;

        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
    }
}