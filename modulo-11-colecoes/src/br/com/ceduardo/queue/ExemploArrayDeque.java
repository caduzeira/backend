package br.com.ceduardo.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploArrayDeque {
    public static void main(String args[]){
        inserindoNaFila();
        removendoDaFila();
        acessandoFila();
    }

    private static void acessandoFila() {
        System.out.println("***** ACESSANDO ******");
        Deque<String> ad = new ArrayDeque<>();
        ad.add("RED");
        ad.add("BLUE");
        ad.add("PINK");

        Deque<String> d = new ArrayDeque<>();
        d.add("GREEN");
        d.add("ORANGE");

        ad.addAll(d);

        System.out.println(ad);
        System.out.println(ad.contains("White"));
        System.out.println(d.contains("Brown"));
        System.out.println(d.containsAll(d));

        System.out.println("Output of elemnt: " + ad.element());
        System.out.println("Get first element using getFirst: " + ad.getFirst());
        System.out.println("Get last element using getLast: " + ad.getLast());
        System.out.println("Output of peek: " + ad.peek());
        System.out.println("Get last element using peeklast: " + ad.peekLast());
        System.out.println("");
    }

    private static void removendoDaFila() {
        System.out.println("***** REMOVENDO ******");
        Deque<String> lista = new ArrayDeque<>();
        lista.add("Green");
        lista.add("Purple");
        lista.add("Orange");
        lista.add("Brown");

        String val = lista.remove();
        lista.remove("Brown");

        System.out.println(lista);

        lista.removeFirst();
        lista.removeLast();

        System.out.println("Elemente in the the ArrayDque after removing first and removeLast" + lista);

        lista.poll();
        lista.pollFirst();
        lista.pollLast();
    }

    private static void inserindoNaFila() {
        Deque<String> d = new ArrayDeque<>();
        d.add("Delhi");
        d.addFirst("Bangalore");
        d.addLast("Chennai");

        System.out.println(d);
    }
}
