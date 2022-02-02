package builder;

public class Order {
    CakeBuilder builder;

    public void setBuilder(CakeBuilder builder) {
        this.builder = builder;
    }

    Cake buildCake() {
        builder.createCake();
        builder.buildName();
        builder.buildWeight();
        builder.buildDecor();
        builder.buildPrice();

        Cake cake = builder.getCake();

        return cake;
    }
}
