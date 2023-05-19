public class PrimeiraClasse {
    public static void main(String args[]){
        Carro carro = new Carro();

        carro.setCor("Preto");
        System.out.println(carro.getCor());
        carro.setMarca("Fiat");
        System.out.println(carro.getMarca());
        carro.setModelo("Strada");
        System.out.println(carro.getModelo());
    }
}
