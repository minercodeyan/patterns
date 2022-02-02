package composite;

public class Confectioner implements Employee{
    @Override
    public String fulfillAnOrder() {
        System.out.println("Confectioner makes a cake");
        return "Confectioner makes a cake";
    }
}
