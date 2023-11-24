public class Bottle implements Commodity {
    private int id;
    private String name;
    private int capacity;
    private boolean becarried;
    private long price;
    private boolean isempty;

    public Bottle(int id,String name,int capacity,long price)//构造方法
    {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.becarried = false;
        this.price = price;
        this.isempty = false;
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
        this.isempty = true;
    }

    public void reset() {
        this.becarried = false;
    }

    public void set() {
        this.becarried = true;
    }

    public boolean getbecarried() {
        return this.becarried;
    }

    public boolean getisempty() {
        return this.isempty;
    }
}