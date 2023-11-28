package loops;

import java.util.ArrayList;
import java.util.List;

public class ExemploFor {
    public static void main(String[] args) {
        exemploFor();
        exemploForLista();
        exemploBreak();
        exemploContinue();
    }

    private static void exemploContinue() {
        System.out.println("********** EXEMPLO FOR CONTINUE **********");
        for(int count = 1; count <= 100; count++){
            //VERIFICANDO SE É MULTIPLO DE 5
            if(count%5!=0){
                continue;
            }
            System.out.println("Contador: " + count);
        }
    }

    private static void exemploBreak() {
        System.out.println("********** EXEMPLO FOR BREAK **********");
        for(int count = 1; count <= 1000; count++){
            System.out.println("Esta é a repetição nr: " + count);

            if(count == 10){
                break;
            }
        }
    }

    private static void exemploForLista() {
        System.out.println("********** EXEMPLO FOR LIST **********");
        List<Integer> valores = new ArrayList<>();
        for(int i = 0; i <= 10; i++){
            System.out.println("Linha " + i);
            valores.add(i);
        }
        System.out.println(valores);

        for(Integer i : valores){
            System.out.println("Exemplo Com Array: " + i);
        }
        valores.forEach(num -> System.out.println("ForEach: " + num));
    }

    public static void exemploFor(){
        System.out.println("********** EXEMPLO FOR **********");
        for(int i = 0; i <= 10; i++){
            System.out.println("Linha " + i);
        }
    }
}
