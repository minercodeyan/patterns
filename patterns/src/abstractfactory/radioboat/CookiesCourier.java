package abstractfactory.radioboat;

import abstractfactory.Courier;

public class CookiesCourier implements Courier {
    @Override
    public String deliverConfectionery() {
        System.out.println("Courier delivers cookies");
        return "Courier delivers cookies";
    }
}
