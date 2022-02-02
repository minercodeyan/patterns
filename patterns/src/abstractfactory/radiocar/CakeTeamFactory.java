package abstractfactory.radiocar;

import abstractfactory.Confectioner;
import abstractfactory.Courier;
import abstractfactory.Packer;
import abstractfactory.PastryShopStaffFactory;

public class CakeTeamFactory implements PastryShopStaffFactory {
    @Override
    public Confectioner getConfectioner() {
        return new CakeMaker();
    }

    @Override
    public Packer getPacker() {
        return new CakePacker();
    }

    @Override
    public Courier getCourier() {
        return new CakeCourier();
    }
}
