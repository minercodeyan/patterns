package composite;

public class Packer implements Employee {
    @Override
    public String fulfillAnOrder() {
        System.out.println("Packer packs a cake");
        return "Packer packs a cake";
    }
}
