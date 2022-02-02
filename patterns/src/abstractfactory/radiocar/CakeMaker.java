package abstractfactory.radiocar;

import abstractfactory.Confectioner;

public class CakeMaker implements Confectioner {
    @Override
    public String makeConfectionery() {
        System.out.println("Cakemaker makes a cake");
        return "Cakemaker makes a cake";
    }
}
