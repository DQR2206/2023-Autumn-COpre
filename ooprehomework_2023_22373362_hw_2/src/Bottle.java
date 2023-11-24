public class Bottle {
    private int id;
    private String name;
    private int capacity;

    public Bottle(int id,String name,int capacity)//构造方法
    {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    public int getID(Bottle bottle)
    {
        return bottle.id;
    }

    public String getName(Bottle bottle)
    {
        return bottle.name;
    }
}