public class CommercialCustomer extends Customer {
    private static final double COMMERCIAL_RATE_PER_UNIT = 0.18;

    public CommercialCustomer(String name, String address, double unitsConsumed) {
        super(name, address, unitsConsumed);
    }

    @Override
    public double calculateBillAmount() {
        return getUnitsConsumed() * COMMERCIAL_RATE_PER_UNIT;
    }
}