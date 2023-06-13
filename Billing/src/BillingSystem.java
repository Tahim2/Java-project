import java.util.ArrayList;
import java.util.List;

public class BillingSystem {
    private List<Customer> customers;

    public BillingSystem() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void generateBills() {
        System.out.println("---------- Electricity Bills ----------");
        for (Customer customer : customers) {
            try {
                System.out.println(customer);
                double billAmount = customer.calculateBillAmount();
                System.out.println("Total Amount: $" + billAmount +"\n"+"Your Bill is paid");
            } catch (Exception e) {
                System.out.println("Error calculating bill for customer: " + customer.getName());
                System.out.println("Error message: " + e.getMessage());
            } finally {
                System.out.println("------------------------------------");
            }
        }
    }
}
