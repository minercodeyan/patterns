package composite;

public class Courier implements Employee {
    @Override
    public String fulfillAnOrder() {
        System.out.println("Courier delivers a cake");
        return "Courier delivers a cake";
    }
}
