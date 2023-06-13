public class Main {
    public static void main(String[] args) {
        BillingSystem billingSystem = new BillingSystem();

        Customer residentialCustomer = new ResidentialCustomer("John Doe", "123 Main St, Anytown, USA", 100.5);
        billingSystem.addCustomer(residentialCustomer);

        Customer commercialCustomer = new CommercialCustomer("XYZ Corporation", "456 Business Ave, Anytown, USA", -250.2);
        billingSystem.addCustomer(commercialCustomer);

        billingSystem.generateBills();
    }
}
