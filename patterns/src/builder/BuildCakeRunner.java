package builder;

public class BuildCakeRunner {
    public static void main(String[] args) {
        Order order = new Order();

        order.setBuilder(new BiscuitStrawberryCakeBuilder());
        Cake cake = order.buildCake();

        System.out.println(cake);
    }
}
