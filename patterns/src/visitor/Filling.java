package visitor;

public class Filling implements CakeElement{
    @Override
    public int beMade(Confectioner confectioner) {
        confectioner.make(this);
        return 0;
    }
}
