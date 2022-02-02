package visitor;

public class Biscuit implements CakeElement{
    @Override
    public int beMade(Confectioner confectioner) {
        confectioner.make(this);
        return 0;
    }
}
