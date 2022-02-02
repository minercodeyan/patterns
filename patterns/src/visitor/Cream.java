package visitor;

public class Cream implements CakeElement{
    @Override
    public int beMade(Confectioner confectioner) {
        confectioner.make(this);
        return 0;
    }
}
