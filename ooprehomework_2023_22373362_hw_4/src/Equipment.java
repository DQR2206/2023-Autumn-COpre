public class Equipment {
    private int id;
    private String name;
    private int star;
    private boolean becarried;

    public Equipment(int id,String name,int star)//构造方法
    {
        this.id = id;
        this.name = name;
        this.star = star;
        this.becarried = false;
    }

    public int getStar()
    {
        return star;
    }

    public void setStar(int star)
    {
        this.star = star;
    }

    public int getID(Equipment equipment)
    {
        return equipment.id;
    }

    public String getName(Equipment equipment)
    {
        return equipment.name;
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