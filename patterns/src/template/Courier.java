package template;

public class Courier extends Template {

    @Override
    public void actionWithCake() {
        System.out.println("Courier delivers cake");
        System.out.println("Courier accepts payment from a client: ");
        countTheChange(20, 40);
    }

    public static int countTheChange(int price, int payment){
        if (payment > price) {
            int result = payment - price;
            System.out.println("Change is " + result + " rub. Here you are.");
            return result;
        } else if (payment < price) {
            int result = payment - price;
            System.out.println("Shortage is " + result*(-1) + " rub. You need to pay more.");
            return result;
        } else {
            int result = 0;
            System.out.println("Thank you for payment.");
            return result;
        }
    }
}
