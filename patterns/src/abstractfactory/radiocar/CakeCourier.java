package abstractfactory.radiocar;

import abstractfactory.Courier;

public class CakeCourier implements Courier {
    @Override
    public String deliverConfectionery() {
        System.out.println("Courier delivers a cake");
        return "Courier delivers a cake";
    }
}
