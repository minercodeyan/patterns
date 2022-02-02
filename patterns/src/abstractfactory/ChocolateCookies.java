package abstractfactory;

import abstractfactory.radioboat.CookiesTeamFactory;

public class ChocolateCookies {
    public static void main (String[] args) {
        PastryShopStaffFactory pastryShopStaffFactory = new CookiesTeamFactory();
        Confectioner confectioner = pastryShopStaffFactory.getConfectioner();
        Packer packer = pastryShopStaffFactory.getPacker();
        Courier courier = pastryShopStaffFactory.getCourier();

        System.out.println("Making chocolate cookies to order");
        confectioner.makeConfectionery();
        packer.packConfectionery();
        courier.deliverConfectionery();
    }
}

