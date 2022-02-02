package visitor;

public class StrawberryCakeConfectioner implements Confectioner{

    @Override
    public void make(Biscuit biscuit) {
        System.out.println("Making strawberry biscuit");
    }

    @Override
    public void make(Cream cream) {
        System.out.println("Making strawberry cream");
    }

    @Override
    public void make(Filling filling) {
        System.out.println("Making strawberry filling");
    }
}
