package template;

public class Runner {
    public static void main(String[] args) {
        Template confectioner = new Confectioner();
        Template packer = new Packer();
        Template courier = new Courier();

        confectioner.work();
        System.out.println(" ");
        packer.work();
        System.out.println(" ");
        courier.work();
    }
}
