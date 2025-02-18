public class Tea extends CaffeinatedBeverage{
    private int brewTemp;

    public Tea() {
        super();
    }

    public boolean setBrewTemp(int temp){
        if (temp >= 0) {
            brewTemp = temp;
            return true;
        }
        return false;
    }
}