package composite;

public class Order {
    public static void main(String[] args) {
        PastryShopStaff staff = new PastryShopStaff();

        Confectioner confectioner = new Confectioner();
        Packer packer = new Packer();
        Courier courier = new Courier();

        staff.addEmployee(confectioner);
        staff.addEmployee(packer);
        staff.addEmployee(courier);

        staff.completeTheOrder();
    }
}
