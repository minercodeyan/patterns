package visitor;

public class Runner {
    public static void main(String[] args) {
        Cake cake = new Cake();

        Confectioner chocolateCakeConfectioner = new ChocolateCakeConfectioner();
        Confectioner strawberryCakeConfectioner = new StrawberryCakeConfectioner();

        System.out.println("Making Chocolate cake:");
        cake.beMade(chocolateCakeConfectioner);
        System.out.println(" ");
        System.out.println("Making Strawberry cake:");
        cake.beMade(strawberryCakeConfectioner);

    }
}
