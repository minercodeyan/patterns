package abstractfactory.radioboat;

import abstractfactory.Confectioner;

public class CookiesMaker implements Confectioner {
    @Override
    public String makeConfectionery() {
        System.out.println("Cookiesmaker makes cookies");
        return "Cookiesmaker makes cookies";
    }
}
