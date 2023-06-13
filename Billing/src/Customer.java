
    public abstract class Customer {
        private String name;
        private String address;
        private double unitsConsumed;

        public Customer(String name, String address, double unitsConsumed) {
            this.name = name;
            this.address = address;
            this.unitsConsumed = unitsConsumed;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public double getUnitsConsumed() {
            return unitsConsumed;
        }

        public abstract double calculateBillAmount();

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", unitsConsumed=" + unitsConsumed +
                    '}';
        }
    }


