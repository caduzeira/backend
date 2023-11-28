package generics;

import java.util.ArrayList;
import java.util.List;

import generics.fruta.Banana;
import generics.fruta.IFruta;
import generics.fruta.Maca;

public class App {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Carlos");
        lista.add("1");
        imprimir(lista);
        imprimir2(lista);

        List<Long> listaLong = new ArrayList<>();
        listaLong.add(1l);
        listaLong.add(2l);
        imprimir(listaLong);
        imprimir2(listaLong);

        String primeiroList = pegarPrimeiroLista(lista);
        System.out.println(primeiroList);

        Long primeiroLong = pegarPrimeiroLista(listaLong);
        System.out.println(primeiroLong);

        List<IFruta> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());
        imprimirFrutas(frutas);
    }

    private static void imprimirFrutas(List<? extends IFruta> lista){
        for(IFruta fruta : lista){
            System.out.println(fruta);
        }
    }

    private static void imprimir2(List<?> lista) {
        for(Object st: lista){
            System.out.println("Qualquer coisa: " + st);
        }
    }

    public static <T> void imprimir(List<T> lista){
        for(T st : lista){
            System.out.println(st);
        }
    }

    public static <T> T pegarPrimeiroLista(List<T> lista){
        return lista.get(0);
    }
}
