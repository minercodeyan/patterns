package builder;

public class NapoleonCakeBuilder extends CakeBuilder {
    @Override
    void buildName() {
        cake.setName("Napoleon");
    }

    @Override
    void buildWeight() {
        cake.setWeight(1.5f);
    }

    @Override
    void buildDecor() {
        cake.setDecor(Decor.Chocolate);
    }

    @Override
    void buildPrice() {
        cake.setPrice(50);
    }
}
