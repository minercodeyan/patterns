package visitor;

public class ChocolateCakeConfectioner implements Confectioner{
    @Override
    public void make(Biscuit biscuit) {
        System.out.println("Making chocolate biscuit");
    }

    @Override
    public void make(Cream cream) {
        System.out.println("Making chocolate cream");
    }

    @Override
    public void make(Filling filling) {
        System.out.println("Making chocolate filling");
    }
}
