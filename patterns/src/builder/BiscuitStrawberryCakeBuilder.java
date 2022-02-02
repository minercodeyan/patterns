package builder;

public class BiscuitStrawberryCakeBuilder extends CakeBuilder {
    @Override
    void buildName() {
        cake.setName("Biscuit strawberry cake");
    }

    @Override
    void buildWeight() {
        cake.setWeight(3f);
    }

    @Override
    void buildDecor() {
        cake.setDecor(Decor.Berries);
    }

    @Override
    void buildPrice() {
        cake.setPrice(100);
    }
}
