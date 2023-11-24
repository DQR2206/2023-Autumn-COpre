public class Equipment {
    private int id;
    private String name;
    private int star;

    public Equipment(int id,String name,int star)//构造方法
    {
        this.id = id;
        this.name = name;
        this.star = star;
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
}