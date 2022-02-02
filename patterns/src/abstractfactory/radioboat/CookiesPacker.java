package abstractfactory.radioboat;

import abstractfactory.Packer;

public class CookiesPacker implements Packer {
    @Override
    public void packConfectionery() {
        System.out.println("Packer packs cookies");
    }
}
