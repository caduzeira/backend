package builder;

public class Gerente {
    
    BurguerBuilder builder;

    

    // public Gerente(BurguerBuilder builder) {
    //     this.builder = builder;
    // }

    public Burguer buildBurguer(){
        builder.buildBun();
        builder.buildMeat();
        builder.buildSalad();
        builder.buildCheese();
        builder.buildSauce();
        return builder.build();
    }



    public void setBuilder(BurguerBuilder builder) {
        this.builder = builder;
    }
}
