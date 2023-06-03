package br.com.ceduardo.abstrata;

public class Programa {
    public static void main(String args[]){
        System.out.println("****** Assalariado ******");
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Carlos");
        empregado.setSobreNome("Eduardo");
        empregado.setSalario(100.1);
        imprimir(empregado);

        System.out.println("****** Comissionado ******");
        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Amanda");
        comissionado.setSobreNome("Eduardo");
        comissionado.setTotalVenda(100d);
        comissionado.setTotalComicao(20d);
        imprimir(comissionado);

        System.out.println("****** Horista ******");
        Horista horista = new Horista();
        horista.setCpf("1");
        horista.setNome("Carlos");
        horista.setSobreNome("Eduardo");
        horista.setHoraTrabalhada(1d);
        horista.setPrecoHora(100d);
        imprimir(horista);
    }
    public static void imprimir(Empregado empregado){
        System.out.println(empregado.getNome() + " Tem salário: " + empregado.vencimento());
    }
}
