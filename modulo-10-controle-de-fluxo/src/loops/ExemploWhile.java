package loops;

public class ExemploWhile {
    public static void main(String[] args) {
        exemploWhile();
    }

    private static void exemploWhile() {
        int count = 0;
        
        // while (count < 2) {
        //     System.out.println("Repetição nr: " + count);
        // } nesse exemplo teriamos um loop infinito pois a condicão nunca mudo, então ainda não é verdadeiro, EXEMPLO CERTO ABAIXO

        while (count < 2) {
            System.out.println("Repetição nr: " + count);
            count++;
        }
    }


}
