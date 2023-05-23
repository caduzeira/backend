package br.com.ceduardo.forewhile;

public class ExemploPPT3 {
    public static void main(String args[]){
        for(int c = 1; c <= 100; c++){
            if(c%5!=0){
                continue;
            }
            System.out.println("Contador: " + c);
        }
    }
}
