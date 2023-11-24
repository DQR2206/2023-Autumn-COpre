import java.util.ArrayList;
import java.util.HashMap;

public class Adventure {
    private int id;
    private String name;
    private int level;
    private int hitpoint;
    private ArrayList<Bottle> bottles;
    private ArrayList<Equipment> equipments;
    private HashMap<Integer,Food> foods;

    public Adventure(int id,String name)//构造方法
    {
        this.id = id;
        this.name = name;
        this.level = 1;
        this.hitpoint = 500;
        this.bottles = new ArrayList<>();
        this.equipments = new ArrayList<>();
        this.foods = new HashMap<>();
    }

    // bottle
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

    public void usebottle(Adventure man, String name) {
        int min = 2147483647;
        Bottle bottle0 = null;
        for (Bottle item : bottles) {
            if (item.getName(item).equals(name) && item.getbecarried(item)) { //名字符合且已经被携带
                if (item.getID(item) < min) {
                    bottle0 = item;
                    min = item.getID(item);
                }
            }
        }
        if (bottle0 != null) {
            if (bottle0.getCapacity(bottle0) > 0) {
                man.addhitpoint(man,bottle0.getCapacity(bottle0));
                bottle0.subcapacity(bottle0);
                System.out.println(min + " " + man.gethitpoint(man));
            } else if (bottle0.getCapacity(bottle0) == 0) {
                bottles.remove(bottle0);
                System.out.println(min + " " + man.gethitpoint(man));
            }
        } else {
            System.out.println("fail to use" + " " + name);
        }
    }

    public boolean usebottle2(Adventure man, String name) {
        int min = 2147483647;
        Bottle bottle0 = null;
        for (Bottle item : bottles) {
            if (item.getName(item).equals(name) && item.getbecarried(item)) { //名字符合且已经被携带
                if (item.getID(item) < min) {
                    bottle0 = item;
                    min = item.getID(item);
                }
            }
        }
        if (bottle0 != null) {
            if (bottle0.getCapacity(bottle0) > 0) {
                man.addhitpoint(man,bottle0.getCapacity(bottle0));
                bottle0.subcapacity(bottle0);
                System.out.println(min + " " + man.gethitpoint(man));
            } else if (bottle0.getCapacity(bottle0) == 0) {
                bottles.remove(bottle0);
                System.out.println(min + " " + man.gethitpoint(man));
            }
            return true;
        } else {
            System.out.println("Fight log error");
            return false;
        }
    }

    public boolean hurtone(Adventure attack, Adventure attacked,String equname) {
        Equipment equipment = null;
        for (Equipment item : attack.equipments) {
            if (item.getName(item).equals(equname) && item.getBecarried(item)) {  //cao!!!!!!
                equipment = item;
                break;
            }
        }
        if (equipment != null) {
            int level = attack.level;
            attacked.hitpoint = attacked.hitpoint - equipment.getStar() * level;
            System.out.println(attacked.getId(attacked) + " " + attacked.hitpoint);
            return true;
        } else {
            System.out.println("Fight log error");
            return false;
        }
    }

    public boolean hurtothers(Adventure attack, ArrayList<Adventure> attcked, String equname) {
        Equipment equipment = null;
        //找到武器
        for (Equipment item : attack.equipments) {
            if (item.getName(item).equals(equname) && item.getBecarried(item)) {  //cao!
                equipment = item;
                break;
            }
        }
        if (equipment != null) {
            int level = attack.level;
            int star = equipment.getStar();
            for (Adventure item : attcked) {
                item.hitpoint = item.hitpoint - level * star;
                System.out.print(item.hitpoint + " ");
            }
            System.out.println("");
            return true;
        } else {
            System.out.println("Fight log error");
            return false;
        }
    }

    public boolean equiscarried(Adventure adventure,String name) {
        Equipment equipment = null;
        for (Equipment item : equipments) {
            if (item.getName(item).equals(name)) {
                equipment = item;
                break;
            }
        }
        if (equipment != null) {
            return equipment.getBecarried(equipment);
        } else {
            return false;
        }
    }

    public int getBotNum(Adventure adventure)
    {
        return adventure.bottles.size();
    }

    public void removeBottle(Bottle bottle)
    {
        bottles.remove(bottle);
    }

    //equipment
    public void addEquipment(Equipment equipment)
    {
        equipments.add(equipment);
    }

    public void removeEquipment(Equipment equipment)
    {
        equipments.remove(equipment);
    }

    public void addEquStar(Equipment equipment)
    {
        if (equipment != null) {
            equipment.setStar(equipment.getStar() + 1);
        }
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

    public int getEquipmentNumber(Adventure adventure)
    {
        return adventure.equipments.size();
    }

    public ArrayList<Equipment> returnequ(Adventure man) {
        return man.equipments;
    }
    //food

    public void addfood(int foodid,Food food)
    {
        foods.put(foodid,food);
    }

    public Food getFood(int foodid)
    {
        for (Food value : foods.values())
        {
            if (value.getFoodid(value) == foodid)
            {
                return value;
            }
        }
        return null;
    }

    public int getFoodsize(Adventure man)
    {
        return man.foods.size();
    }

    public void removeFood(Food food)
    {
        foods.remove(food.getFoodid(food),food);
    }

    public void usefood(Adventure man,String name) {
        int min = 2147483647;
        Food food0 = null;
        for (Food value : foods.values()) {
            if (value.getFoodname(value).equals(name) && value.getBecarried(value)) { //名字符合且已经被携带
                if (value.getFoodid(value) < min) {
                    min = value.getFoodid(value);//找到最小id
                    food0 = value;
                }
            }
        }
        if (food0 != null) {
            int x = food0.getEnergy(food0);
            man.addLevel(man,x);
            System.out.println(food0.getFoodid(food0) + " " + man.getLevel(man));
            foods.remove(food0.getFoodid(food0),food0);
        } else {
            System.out.println("fail to eat" + " " + name);
        }
    }
    //level

    public int getLevel(Adventure man)
    {
        return man.level;
    }

    public void addLevel(Adventure man,int x) {
        man.level = man.level + x;
    }

    public void addhitpoint(Adventure man,int x) {
        man.hitpoint = man.hitpoint + x;
    }

    public int gethitpoint(Adventure man) {
        return man.hitpoint;
    }

    public int cntsamename(Adventure man,String name) {
        int cnt = 0;
        for (Bottle item : bottles) {
            if (item.getName(item).equals(name) && item.getbecarried(item)) { //名字相同且已经被携带
                cnt++;
            }
        }
        return cnt;
    }

    public String getName() {
        return  this.name;
    }

    public int getId(Adventure adventure) {
        return adventure.id;
    }
}