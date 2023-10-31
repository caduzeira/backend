package builder;

public class Demo {
    public static void main(String[] args) {
        //Gerente gerente = new Gerente(new CheeseBurguerBuilder());
        Gerente gerente = new Gerente();
        gerente.setBuilder(new CheeseBurguerBuilder());
        Burguer burguer = gerente.buildBurguer();
        burguer.print();

         gerente.setBuilder(new VeganBurguerBuilder());
         Burguer burguer2 = gerente.buildBurguer();
         burguer2.print();
    }
}
