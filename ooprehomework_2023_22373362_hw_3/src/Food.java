public class Food {
    private int foodid;
    private String foodname;
    private int energy;
    private boolean becarried;

    public Food(int foodid,String foodname,int energy) {
        this.foodid = foodid;
        this.foodname = foodname;
        this.energy = energy;
        this.becarried = false;
    }

    public int getFoodid(Food food)
    {
        return food.foodid;
    }

    public String getFoodname(Food food)
    {
        return food.foodname;
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
