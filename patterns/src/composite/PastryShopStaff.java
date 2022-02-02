package composite;

import java.util.ArrayList;
import java.util.List;

public class PastryShopStaff {
    private List<Employee> employeeList = new ArrayList<Employee>();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public void completeTheOrder() {
        System.out.println("Pastryshop staff completes the order");
        for(Employee employee: employeeList){
            employee.fulfillAnOrder();
        }
    }
}
