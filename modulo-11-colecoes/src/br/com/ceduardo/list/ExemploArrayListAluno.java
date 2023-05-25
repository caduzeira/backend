package br.com.ceduardo.list;

import br.com.ceduardo.util.Aluno;
import br.com.ceduardo.util.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {
    public static void main(String args[]){
        exemploListaSimplesOrdenadaClasseExterna();
        exemploListaSimplesOrdenadaComparatorAluno();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {
        System.out.println("****** Exemplo Lista Simples Ordenada Classe Externa");
        List<Aluno> lista = new ArrayList<>();
        Aluno a = new Aluno("Carlos Eduardo","Python",10.5);
        Aluno b = new Aluno("Amanda Fernanda","Java",10.5);
        lista.add(a);
        lista.add(b);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno(){
        System.out.println("****** Exemplo Lista Simples Ordenada Comparator aluno");
        List<Aluno> lista = new ArrayList<>();

        Aluno a = new Aluno("Carlos Eduardo","Python",10.5);
        Aluno b = new Aluno("Amanda Fernanda","Java",10.5);
        lista.add(a);
        lista.add(b);
        System.out.println("Lista sem ordenação " + lista);
        Collections.sort(lista);
        System.out.println("Lista com ordenação " + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista,comparaNotaAluno);
        System.out.println("Lista com ordenação por nota " + lista);
    }
}
