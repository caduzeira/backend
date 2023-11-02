package templatemethod;

public class Advogado extends Trabalhador{

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como advogado");
    }

    @Override
    protected void iniciarRotina() {
        System.out.println("Trabalhando como advogado");
    }

    @Override
    protected void irProTrabalho() {
        super.irProTrabalho();
    }

    @Override
    protected void levantar() {
        super.levantar();
    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Volta para casa de carro");
    }

    
    
}
