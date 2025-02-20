public class CaffeinatedBeverage
{
    private String name;
    protected int ounces;
    private double price;

    public CaffeinatedBeverage() { // done
        setAll("", 0, 0);
    }

    public CaffeinatedBeverage(String name, int ounces, double price) { // done
        setAll(name, ounces, price);
    }

    public CaffeinatedBeverage(CaffeinatedBeverage original) { // done
        setAll(original.getName(), original.getOunces(), original.getPrice());
    }

    public String getName() { // done
        return this.name;
    }
    public int getOunces() { // done
        return this.ounces;
    }
    public double getPrice() { // done
        return this.price;
    }
    
    public void setName(String name) { // done
        this.name = name;
    }

    public boolean setOunces(int ounces) { // done
        if (ounces >= 0)
        {
            this.ounces = ounces;
            return true;
        }
        return false;
    }

    public boolean setPrice(double price) { // done
        if (price >= 0)
        {
            this.price = price;
            return true;
        }
        return false;
    }

    public boolean setAll(String name, int ounces, double price) // done
    {
        setName(name);
        return setOunces(ounces) && setPrice(price);
    }

    @Override
    public boolean equals(Object o) { // done
        if (o == null || this.getClass() != o.getClass())
            return false;
        
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
                this.name.equals(that.name);
    }
    
    @Override
    public String toString()
    {
        return String.format("Name:%s, Ounces: %d, Price: $%.2f", name, ounces, price);
    }

    public boolean sip(int ounces) // done
    {
        this.ounces -= ounces;
        if (this.ounces < 0) {
            ounces = 0;
        }
        return !isEmpty();
    }
    
    public boolean isEmpty()
    {
        return this.ounces < 1;
    }
}