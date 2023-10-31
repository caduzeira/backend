package exercicio;

public class Contrato {
    
    private String tipoCategoria;
    private boolean temContrato;
    
    public Contrato(String tipoCategoria, boolean temContrato) {
        this.tipoCategoria = tipoCategoria;
        this.temContrato = temContrato;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public boolean isTemContrato() {
        return temContrato;
    }
}
