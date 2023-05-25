package br.com.ceduardo.util;

import java.util.Comparator;

public class ComparaNotaAluno implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o2, Aluno o1) {
        return Double.compare(o1.getNota(),o2.getNota());
    }
}
