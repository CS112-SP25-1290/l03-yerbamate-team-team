public class YerbaMate extends Tea {
    private int numPasses;

    public YerbaMate() {
        super();
        numPasses = 0;
    }

    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        this.numPasses = numPasses;
    }

    public YerbaMate(YerbaMate yerbamate2) {
        super(yerbamate2);
        this.numPasses = yerbamate2.getNumPasses();
    }

    public int getNumPasses() {
        return numPasses;
    }

    public void passMate() {
        numPasses += 1;
        System.out.println("Incremented numPasses by 1 and is currently: " + numPasses);
    }

    public void refill(int addedOunces) {
        this.ounces += addedOunces;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;

        YerbaMate that = (YerbaMate) o;
        return this.getOunces() == that.getOunces() &&
                Double.compare(this.getPrice(), that.getPrice()) == 0 &&
                this.getName().equals(that.getName()) &&
                this.getBrewTemp() == that.getBrewTemp() &&
                this.getNumPasses() == that.getNumPasses();
    }
    
    @Override
    public String toString() {
        String all = String.format("Yerba Mate: %s, %d ounces, brewed @ %d°C, $%.2f, %d passes so far", getName(), getOunces(), getBrewTemp(),
                getPrice(), getNumPasses());
        return all;
    }
}
