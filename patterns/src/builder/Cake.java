package builder;

public class Cake {
    private String name;
    private float weight;
    private Decor decor;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setDecor(Decor decor) {
        this.decor = decor;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", decor=" + decor +
                ", price=" + price +
                '}';
    }
}
