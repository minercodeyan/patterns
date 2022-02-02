package abstractfactory;

public interface PastryShopStaffFactory {
    Confectioner getConfectioner();
    Packer getPacker();
    Courier getCourier();
}
