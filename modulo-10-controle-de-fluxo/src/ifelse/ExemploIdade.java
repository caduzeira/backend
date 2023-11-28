package ifelse;

import java.util.Scanner;

public class ExemploIdade {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    private static String getIdade(int idade) {
       if(idade < 0 || idade > 115){
            return "Digite uma idade valida";
       } else {
            if(idade >= 0 && idade <= 5 ){
                return "Você é um bebê";
            }else if(idade >= 6 && idade <= 10){
                return "Você é uma criança";
            }else if(idade >= 11 && idade <= 24){
                return "Você é um adolescente";
            }else if(idade >= 25 && idade <= 47){
                return "Você é adulto";
            }else if(idade >= 48 && idade <= 64){
                return "Você é veio";
            }else {
                return "Você é um idoso";
            }
       }
    }
}
