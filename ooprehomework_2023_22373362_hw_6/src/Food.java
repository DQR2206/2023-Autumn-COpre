public class Food implements Commodity {
    private int foodid;
    private String foodname;
    private int energy;
    private boolean becarried;
    private long price;

    public Food(int foodid,String foodname,int energy,long price) {
        this.foodid = foodid;
        this.foodname = foodname;
        this.energy = energy;
        this.becarried = false;
        this.price = price;
    }

    @Override
    public long getPrice() {
        return this.price;
    }

    @Override
    public int getId() {
        return this.foodid;
    }

    @Override
    public String getName() {
        return this.foodname;
    }

    public int getEnergy(Food food)
    {
        return food.energy;
    }

    public void reset(Food food)
    {
        food.becarried = false;
    }

    public void set(Food food)
    {
        food.becarried = true;
    }

    public boolean getBecarried(Food food) {
        return food.becarried;
    }
}
