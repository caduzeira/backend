package builder;

public class Burguer {
    
    private String bun = "No Bun";

    private String meat = "No Meat";

    private String salad = "No Salad";

    private String cheesse = "No Cheese";

    private String sauce = "No Sauce";

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public void setCheesse(String cheesse) {
        this.cheesse = cheesse;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void print() {
        System.out.println(
            "Burguer [bun=" + bun + ", meat=" + meat + ", salad=" + salad + ", cheesse=" + cheesse + ", sauce="
                + sauce + "]"
        );
    }

    
}
