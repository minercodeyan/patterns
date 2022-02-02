package builder;

public abstract class CakeBuilder {
    Cake cake;

    void createCake() {
        cake = new Cake();
    }

    abstract void buildName();
    abstract void buildWeight();
    abstract void buildDecor();
    abstract void buildPrice();

    Cake getCake() {
        return cake;
    }
}
