public class Bottle {
    private int id;
    private String name;
    private int capacity;
    private boolean becarried;

    public Bottle(int id,String name,int capacity)//构造方法
    {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.becarried = false;
    }

    public int getCapacity(Bottle bottle) {
        return bottle.capacity;
    }

    public void subcapacity(Bottle bottle) {
        bottle.capacity = 0;
    }

    public int getID(Bottle bottle)
    {
        return bottle.id;
    }

    public String getName(Bottle bottle)
    {
        return bottle.name;
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