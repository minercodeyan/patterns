package abstractfactory.radiocar;

import abstractfactory.Packer;

public class CakePacker implements Packer {
    @Override
    public void packConfectionery() {
        System.out.println("Packer packs a cake");
    }
}
