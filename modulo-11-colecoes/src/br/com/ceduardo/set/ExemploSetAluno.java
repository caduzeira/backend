package br.com.ceduardo.set;

import br.com.ceduardo.util.Aluno;

import java.util.HashSet;
import java.util.Set;

public class ExemploSetAluno {
    public static void main(String args[]){
        exemploListaSimples();
        exemploRemover();
        exemploConsutando();
    }

    private static void exemploConsutando() {
        System.out.println("****** Exemplo Consutando ******");
        Set<Aluno> conjunto = new HashSet<>();
        Aluno a = new Aluno("João da Silva", "Python", 10.1);
        Aluno b = new Aluno("Antonio Souza", "Java", 5.1);
        Aluno c = new Aluno("Lucia Ferreira", "JavaScript", 9.5);
        Aluno d = new Aluno("Antonio Souza", "Java", 5.1);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto.contains(a));
    }

    private static void exemploRemover() {
        System.out.println("****** Exemplo Removendo ******");
        Set<Aluno> conjunto = new HashSet<>();
        Aluno a = new Aluno("João da Silva", "Python", 10.1);
        Aluno b = new Aluno("Antonio Souza", "Java", 5.1);
        Aluno c = new Aluno("Lucia Ferreira", "JavaScript", 9.5);
        Aluno d = new Aluno("Antonio Souza", "Java", 5.1);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
        conjunto.remove(a);
        System.out.println(conjunto);

        for(Aluno aluno : conjunto){
            System.out.println(aluno);
        }
    }

    /*
    * Para não repetir objetos na linhas de alunos é necessario que a classe
    * Aluno implemente o equals e hashcode
    * */
    private static void exemploListaSimples(){
        System.out.println("****** Exemplo Lista Simples ******");
        Set<Aluno> conjunto = new HashSet<>();
        Aluno a = new Aluno("João da Silva", "Python", 10.1);
        Aluno b = new Aluno("Antonio Souza", "Java", 5.1);
        Aluno c = new Aluno("Lucia Ferreira", "JavaScript", 9.5);
        Aluno d = new Aluno("Antonio Souza", "Java", 5.1);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
    }
}
