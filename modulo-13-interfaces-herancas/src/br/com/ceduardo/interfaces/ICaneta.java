package br.com.ceduardo.interfaces;

public interface ICaneta {
    public void escrever(String texto);

    public String getCor();

    default void escreverComumATodos(){
        System.out.println("Escrita igual a todas");
    }
}
