package ifelse;

import java.util.Scanner;

public class ExemploAnimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String texto = s.nextLine();
        String animal = qualAnimal(texto);
        System.out.println(animal);
    }

    private static String qualAnimal(String texto) {
        String result;
        if(texto.equalsIgnoreCase("DOG") || texto.equalsIgnoreCase("CAT")){
            result = "É uma animal domestico";
        }else if(texto.equalsIgnoreCase("TIGER") || texto.equalsIgnoreCase("BEER")){
            result = "É um animal selvagem";
        }else{
            result = "Não está incluso em nem uma categoria";
        }

        return result;
    }
}
