package br.com.ceduardo.interfaces;

public class Caminhao implements ICarro{
    @Override
    public void andar() {
        System.out.println("Caminhão andando");
    }

    public void parar(){
        System.out.println("Caminhão parando");
    }
}
