public class Tea extends CaffeinatedBeverage {
    private int brewTemp;

    public Tea() {
        super();
        brewTemp = 0;
    }

    public boolean setBrewTemp(int temp) {
        if (temp >= 0) {
            brewTemp = temp;
            return true;
        }
        return false;
    }
}