package casting;

public class App {
    public static void main(String[] args) {
        //CASTING EXPLICITO - Não muito recomendado
        int num1 = 10;
        short num2 = (short) num1;

        long numL = 1111111111111111111l;
        int numI = (int) numL;
        System.out.println(num2);
        System.out.println(numI);

        //CASTING IMPLICITO
        
        int idade = 10;
        long idadeL = idade;
        System.out.println("Idade: " + idadeL);
    }
}
