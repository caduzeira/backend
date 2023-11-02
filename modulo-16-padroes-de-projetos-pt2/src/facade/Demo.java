package facade;

public class Demo{
    public static void main(String[] args) {
        IApartamento service = new ApartamentoService();
        service.cadastraApartamento(new Apartamento(1l, "Endereco"));
    }
}