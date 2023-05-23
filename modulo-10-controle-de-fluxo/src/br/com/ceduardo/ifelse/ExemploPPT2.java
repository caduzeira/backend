package br.com.ceduardo.ifelse;

public class ExemploPPT2 {
    public static void main(String args[]){
        int resultado = 5;

        if(resultado > 1 && resultado < 5){
            System.out.println("Resultado está entre 1 e 5");
        }else if(resultado >= 5 && resultado < 8){
            System.out.println("Resultado está entre 5 e 8");
        }else{
            System.out.println("Resultado menor que 1");
        }
    }
}
