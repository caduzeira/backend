package templatemethod;

public abstract class Trabalhador {
    
    public void executarRotina(){
        iniciarRotina();
        levantar();
        irProTrabalho();
        trabalhar();
        voltarParaCasa();
    }
    
    protected abstract void trabalhar();

    protected void voltarParaCasa() {
        System.out.println("Voltando pra casa");
    }

    protected void irProTrabalho() {
        System.out.println("Indo trabalhar");
    }

    protected void iniciarRotina(){
        System.out.println("Iniciando Rotina");
    }

    protected void levantar(){
        System.out.println("Levantando da cama");
    }
}
