package variaveis;

public class Exemplo {
    
    private int codigo = 2;

    private Long codigoMario;

    private float valorDecimal;

    private Double valorDecima1;

    private String texto;

    private boolean status;

    private short shor;

    private byte bi;

    public Exemplo(int val){
        this.codigo = val;
    }

    public String retonrTexto(){
        this.codigo = 0;
        return "Ola mundo";
    }

    public int retornaInteiro(){
        int val = 10;
        return val;
    }

    public long retornaLong(){
        return 104l;
    }
}
