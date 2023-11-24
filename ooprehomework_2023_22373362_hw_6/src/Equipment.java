public class Equipment implements Commodity {
    private int id;
    private String name;
    private int star;
    private boolean becarried;
    private long price;

    public Equipment(int id,String name,int star,long price)//构造方法
    {
        this.id = id;
        this.name = name;
        this.star = star;
        this.becarried = false;
        this.price = price;
    }

    public int getStar()
    {
        return star;
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

    public void setStar(int star)
    {
        this.star = star;
    }

    public void reset(Equipment equipment) {
        equipment.becarried = false;
    }

    public void set(Equipment equipment) {
        equipment.becarried = true;
    }

    public boolean getBecarried(Equipment equipment) {
        return equipment.becarried;
    }
}