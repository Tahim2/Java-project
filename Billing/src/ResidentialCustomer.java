public class ResidentialCustomer extends Customer {
    private static final double RESIDENTIAL_RATE_PER_UNIT = 0.12;

    public ResidentialCustomer(String name, String address, double unitsConsumed) {
        super(name, address, unitsConsumed);
    }

    @Override
    public double calculateBillAmount() {
        return getUnitsConsumed() * RESIDENTIAL_RATE_PER_UNIT;
    }
}



