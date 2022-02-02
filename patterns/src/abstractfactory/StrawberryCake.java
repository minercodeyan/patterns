package abstractfactory;

import abstractfactory.radiocar.CakeTeamFactory;

public class StrawberryCake {
    public static void main (String[] args) {
        PastryShopStaffFactory pastryShopStaffFactory = new CakeTeamFactory();
        Confectioner confectioner = pastryShopStaffFactory.getConfectioner();
        Packer packer = pastryShopStaffFactory.getPacker();
        Courier courier = pastryShopStaffFactory.getCourier();

        System.out.println("Making a strawberry cake to order");
        confectioner.makeConfectionery();
        packer.packConfectionery();
        courier.deliverConfectionery();
    }
}
