package template;

public abstract class Template {
    public void work() {
        actionWithCake();
        System.out.println("Changing order's status");
    }
    public abstract void actionWithCake();
}
