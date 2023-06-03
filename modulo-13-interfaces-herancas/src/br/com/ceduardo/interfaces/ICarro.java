package br.com.ceduardo.interfaces;

public interface ICarro {
    default void parar(){
        System.out.println("Carro está em parada");
    }

    public void andar();
}
