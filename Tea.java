public class Tea extends CaffeinatedBeverage {
    private int brewTemp;

    public Tea() {
        super();
        brewTemp = 0;
    }

    public Tea(Tea tea2) {
        super(tea2);
        this.brewTemp = tea2.getBrewTemp();
    }

    public Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        this.brewTemp = brewTemp;
    }

    public boolean setBrewTemp(int temp) {
        if (temp >= 0) {
            brewTemp = temp;
            return true;
        }
        return false;
    }

    public int getBrewTemp() {
        return brewTemp;
    }

    public boolean setAll(String name, int ounces, double price, int temperature) {
        setName(name);
        return setOunces(ounces) && setPrice(price) && setBrewTemp(temperature);
    }

    // Tea: Chamomile, 16 ounces, brewed @ 90°C, $1.50
    @Override
    public String toString() {
        String all = String.format("Tea: %s, %d ounces, brewed @ %d°C, $%.2f", getName(), getOunces(), getBrewTemp(),
                getPrice());
        return all;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;
        
        Tea that = (Tea) o;
        return this.getOunces() == that.getOunces() &&
                Double.compare(this.getPrice(), that.getPrice()) == 0 &&
                this.getName().equals(that.getName()) && 
                this.getBrewTemp() == that.getBrewTemp();
    }
}