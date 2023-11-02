package templatemethod;

public class Demo {
    public static void main(String[] args) {
        //Bombeiro
        Trabalhador t = new Bombeiro();
        t.executarRotina();
        //Policial
        Trabalhador p = new Policial();
        p.executarRotina();
        //Advogado
        Trabalhador a = new Advogado();
        a.executarRotina();
    }
}
