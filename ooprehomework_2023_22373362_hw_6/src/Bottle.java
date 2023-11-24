public class Bottle implements Commodity {
    private int id;
    private String name;
    private int capacity;
    private boolean becarried;
    private long price;

    public Bottle(int id,String name,int capacity,long price)//构造方法
    {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.becarried = false;
        this.price = price;
    }

    @Override
    public long getPrice() {
        return this.price;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void subcapacity() {
        this.capacity = 0;
    }

    public void reset(Bottle bottle) {
        bottle.becarried = false;
    }

    public void set(Bottle bottle) {
        bottle.becarried = true;
    }

    public boolean getbecarried(Bottle bottle) {
        return bottle.becarried;
    }
}