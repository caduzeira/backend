package exercicio;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> nome = new ArrayList<>();
        nome.add("Carlos");
        nome.add("Eduardo");
        nome.add("Ferreira");
        dados(nome);

        List<Integer> idade = new ArrayList<>();
        idade.add(10);
        idade.add(20);
        idade.add(50);
        dados(idade);
    }

    public static void dados(List<?> lista){
        for(Object st : lista){
            System.out.println("Dado: " +  lista);
        }
    }
}
