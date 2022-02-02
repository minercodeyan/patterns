package adapter;

public class AdapterJavaToDatabase extends Order implements Database {
    @Override
    public void insert() {
        setOrderStatus();
    }

    @Override
    public void update() {
        updateOrderStatus();
    }

    @Override
    public void select() {
        selectOrderStatus();
    }

    @Override
    public void remove() {
        deleteOrderStatus();
    }
}
