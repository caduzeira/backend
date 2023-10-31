package builder;

public class CheeseBurguerBuilder extends BurguerBuilder {

    public void buildBun() {
        burguer.setBun("White Bread");
    }

    public void buildMeat() {
        burguer.setMeat("Beef");
    }

    public void buildSalad() {
        burguer.setSalad("Iceberg");
    }

    public void buildCheese() {
        burguer.setCheesse("American Cheese");
    }

    public void buildSauce() {
        burguer.setSauce("Secret Sauce");
    }
    
}
