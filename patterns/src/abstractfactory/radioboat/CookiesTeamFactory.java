package abstractfactory.radioboat;

import abstractfactory.Confectioner;
import abstractfactory.Courier;
import abstractfactory.Packer;
import abstractfactory.PastryShopStaffFactory;

public class CookiesTeamFactory implements PastryShopStaffFactory {
    @Override
    public Confectioner getConfectioner() {
        return new CookiesMaker();
    }

    @Override
    public Packer getPacker() {
        return new CookiesPacker();
    }

    @Override
    public Courier getCourier() {
        return new CookiesCourier();
    }
}
