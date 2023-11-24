import java.util.ArrayList;

public class Adventure {
    private int id;
    private String name;
    private ArrayList<Bottle> bottles;
    private ArrayList<Equipment> equipments;

    public Adventure(int id,String name)//构造方法
    {
        this.id = id;
        this.name = name;
        this.bottles = new ArrayList<>();
        this.equipments = new ArrayList<>();
    }

    public void addBottle(Bottle bottle)
    {
        bottles.add(bottle);
    }

    public Bottle getBottle(int id)
    {
        for (Bottle item : bottles) {
            if (item.getID(item) == id)
            {
                return item;
            }
        }
        return null;
    }

    public void removeBottle(Bottle bottle)
    {
        bottles.remove(bottle);
    }

    public void addEquipment(Equipment equipment)
    {
        equipments.add(equipment);
    }

    public void removeEquipment(Equipment equipment)
    {
        equipments.remove(equipment);
    }

    public void addStar(Equipment equipment)
    {
        if (equipment != null) {
            equipment.setStar(equipment.getStar() + 1);
        }
    }

    public int BottlesNumber(Adventure adventure)//可能有问题
    {
        return adventure.bottles.size();
    }

    public Equipment getEquipment(int id)
    {
        for (Equipment item : equipments)
        {
            if (item.getID(item) == id)
            {
                return item;
            }
        }
        return  null;
    }

    public int EquipmentNumber(Adventure adventure)
    {
        return adventure.equipments.size();
    }
}