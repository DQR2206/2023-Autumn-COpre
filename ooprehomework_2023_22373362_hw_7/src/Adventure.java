import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

//太乐了
public class Adventure implements Commodity {
    private int id;
    private String name;
    private int level;
    private int hitpoint;
    private long  price;
    private long money;
    private ArrayList<Bottle> bottles;
    private ArrayList<Equipment> equipments;
    private HashMap<Integer,Food> foods;

    private HashMap<Integer,Adventure> hirer;//雇主
    private HashMap<Integer,Adventure> hires;//雇员

    public Adventure(int id,String name) {
        this.id = id;
        this.name = name;
        this.level = 1;
        this.hitpoint = 500;
        this.money = 0;
        this.bottles = new ArrayList<>();
        this.equipments = new ArrayList<>();
        this.foods = new HashMap<>();
        this.hires = new HashMap<>();
        this.hirer = new HashMap<>();
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

    public void addBottle(Bottle bottle)
    {
        this.bottles.add(bottle);
    }

    public Bottle getBottle(int id) {
        for (Bottle item : bottles) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<Bottle> getBottles() {
        return this.bottles;
    }

    public boolean usebottle2(Adventure man, String name) {
        int min = 2147483647;
        Bottle bottle0 = null;
        for (Bottle item : bottles) {
            if (item.getName().equals(name) && item.getbecarried()) { //名字符合且已经被携带
                if (item.getId() < min) {
                    bottle0 = item;
                    min = item.getId();
                }
            }
        }
        if (bottle0 != null) {
            if (bottle0 instanceof RegularBottle) {
                if (!bottle0.getisempty()) {
                    man.addhitpoint(man, bottle0.getCapacity());
                    bottle0.subcapacity();
                    System.out.println(min + " " + man.hitpoint);
                } else if (bottle0.getisempty()) {
                    man.subPrice(bottle0.getPrice());
                    bottles.remove(bottle0);
                    System.out.println(min + " " + man.hitpoint);
                }
            } else if (bottle0 instanceof ReinforcedBottle) {
                if (!bottle0.getisempty()) {
                    int capa = bottle0.getCapacity();
                    int addhit = (int)((1 + ((ReinforcedBottle) bottle0).getRatio()) * capa);
                    man.addhitpoint(man,addhit);
                    bottle0.subcapacity();
                    System.out.println(min + " " + man.hitpoint);
                } else if (bottle0.getisempty()) {
                    man.subPrice(bottle0.getPrice());
                    bottles.remove(bottle0);
                    System.out.println(min + " " + man.hitpoint);
                }
            } else {
                if (!bottle0.getisempty()) {
                    int addhit = (int) (((RecoverBottle) bottle0).getRatio() * man.hitpoint);
                    man.addhitpoint(man, addhit);
                    bottle0.subcapacity();
                    System.out.println(min + " " + man.hitpoint);
                } else if (bottle0.getisempty()) {
                    man.subPrice(bottle0.getPrice());
                    bottles.remove(bottle0);
                    System.out.println(min + " " + man.hitpoint);
                }
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
            if (item.getName().equals(equname) && item.getBecarried()) {
                equipment = item;
                break;
            }
        }
        if (equipment != null) {
            if (equipment instanceof RegularEquipment) {
                int level = attack.level;
                attacked.hitpoint = attacked.hitpoint - equipment.getStar() * level;
                System.out.println(attacked.getId() + " " + attacked.hitpoint);
            } else if (equipment instanceof CritEquipment) {
                int lvl = attack.level;
                int critical = ((CritEquipment)equipment).getCritical();
                int decrease = equipment.getStar() * lvl + critical;
                attacked.hitpoint = attacked.hitpoint - decrease;
                System.out.println(attacked.getId() + " " + attacked.hitpoint);
            } else {
                double ratio = ((EpicEquipment)equipment).getRatio();
                int decrease = (int)(attacked.hitpoint * ratio);
                attacked.hitpoint = attacked.hitpoint - decrease;
                System.out.println(attacked.getId() + " " + attacked.hitpoint);
            }
            return true;
        } else {
            System.out.println("Fight log error");
            return false;
        }
    }

    public boolean hurtothers(Adventure attack, ArrayList<Adventure> attcked, String equname) {
        Equipment equipment = null;
        for (Equipment item : attack.equipments) {
            if (item.getName().equals(equname) && item.getBecarried()) {  //cao!
                equipment = item;
                break;
            }
        }
        if (equipment != null) {
            if (equipment instanceof RegularEquipment) {
                for (Adventure item : attcked) {
                    item.hitpoint = item.hitpoint - attack.level * equipment.getStar();
                    System.out.print(item.hitpoint + " ");
                }
            } else if (equipment instanceof CritEquipment) {
                for (Adventure item : attcked) {
                    int lvl = attack.level;
                    int critical = ((CritEquipment)equipment).getCritical();
                    int decrease = equipment.getStar() * lvl + critical;
                    item.hitpoint = item.hitpoint - decrease;
                    System.out.print(item.hitpoint + " ");
                }
            } else {
                for (Adventure item : attcked) {
                    double ratio = ((EpicEquipment)equipment).getRatio();
                    int decrease = (int)(item.hitpoint * ratio);
                    item.hitpoint = item.hitpoint - decrease;
                    System.out.print(item.hitpoint + " ");
                }
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
            if (item.getName().equals(name)) {
                equipment = item;
                break;
            }
        }
        if (equipment != null) {
            return equipment.getBecarried();
        } else {
            return false;
        }
    }

    public int getBotNum(Adventure adventure) {
        return adventure.bottles.size();
    }

    public void removeBottle(Bottle bottle) {
        bottles.remove(bottle);
    }

    //equipment
    public void addEquipment(Equipment equipment) {
        equipments.add(equipment);
    }

    public void removeEquipment(Equipment equipment) {
        equipments.remove(equipment);
    }

    public void addEquStar(Equipment equipment) {
        if (equipment != null) {
            equipment.setStar(equipment.getStar() + 1);
        }
    }

    public Equipment getEquipment(int id)
    {
        for (Equipment item : equipments) {
            if (item.getId() == id) {
                return item;
            }
        }
        return  null;
    }

    public int getEquipmentNumber(Adventure adventure) {
        return adventure.equipments.size();
    }

    public ArrayList<Equipment> returnequ(Adventure man) {
        return man.equipments;
    }

    public void addfood(int foodid,Food food) {
        foods.put(foodid,food);
    }

    public Food getFood(int foodid) {
        for (Food value : foods.values()) {
            if (value.getId() == foodid) {
                return value;
            }
        }
        return null;
    }

    public int getFoodsize(Adventure man) {
        return man.foods.size();
    }

    public void removeFood(Food food) {
        foods.remove(food.getId(),food);
    }

    public void usefood(Adventure man,String name) {
        int min = 2147483647;
        Food food0 = null;
        for (Food value : foods.values()) {
            if (value.getName().equals(name) && value.getBecarried()) { //名字符合且已经被携带
                if (value.getId() < min) {
                    min = value.getId();//找到最小id
                    food0 = value;
                }
            }
        }
        if (food0 != null) {
            int x = food0.getEnergy();
            man.addLevel(man,x);
            System.out.println(food0.getId() + " " + man.getLevel(man));
            man.subPrice(food0.getPrice());
            foods.remove(food0.getId(),food0);
        } else {
            System.out.println("fail to eat" + " " + name);
        }
    }
    //level

    public int getLevel(Adventure man) {
        return man.level;
    }

    public void addLevel(Adventure man,int x) {
        man.level = man.level + x;
    }

    public void addhitpoint(Adventure man,int x) {
        man.hitpoint = man.hitpoint + x;
    }

    public int cntsamename(Adventure man,String name) {
        int cnt = 0;
        for (Bottle item : bottles) {
            if (item.getName().equals(name) && item.getbecarried()) { //名字相同且已经被携带
                cnt++;
            }
        }
        return cnt;
    }

    public void hire(int id2,Adventure adventure2) {
        if (!this.hires.containsKey(id2)) {
            this.addPrice(adventure2.price + adventure2.money);
            this.hires.put(id2, adventure2);
            adventure2.hirer.put(this.id, this);
        }
    }

    public void getAllPrice() {
        int sum = 0;
        int bottlesize = this.bottles.size();
        int equipmentsize = this.equipments.size();
        int foodsize =  this.foods.size();
        int hiresize =  this.hires.size();
        sum = bottlesize + equipmentsize + foodsize + hiresize;
        System.out.println(sum + " " + this.price);
    }

    public void addPrice(long price) {
        this.price = this.price + price;
        for (Adventure item : this.hirer.values()) {
            item.addPrice(price);
        }
    }

    public void subPrice(long price) {
        this.price = this.price - price;
        for (Adventure item : this.hirer.values()) {
            item.subPrice(price);
        }
    }

    public void addmoneytoprice(long money) {
        for (Adventure item : this.hirer.values()) {
            item.price = item.price + money;
            item.addmoneytoprice(money);
        }
    }

    public void submoneytoprice(long money) {
        for (Adventure item : this.hirer.values()) {
            item.price = item.price - money;
            item.submoneytoprice(money);
        }
    }

    public void search(int comid) {
        String name = null;
        for (Bottle item : this.bottles) {
            if (item.getId() == comid) {
                if (item instanceof RegularBottle) {
                    name = "RegularBottle";
                } else if (item instanceof ReinforcedBottle) {
                    name = "ReinforcedBottle";
                } else {
                    name = "RecoverBottle";
                }
            }
        }
        for (Equipment item : this.equipments) {
            if (item.getId() == comid) {
                if (item instanceof RegularEquipment) {
                    name = "RegularEquipment";
                } else if (item instanceof EpicEquipment) {
                    name = "EpicEquipment";
                } else {
                    name = "CritEquipment";
                }
            }
        }
        for (Adventure item : this.hires.values()) {
            if (item.getId() == comid) {
                name = "Adventurer";
            }
        }
        for (Food item : this.foods.values()) {
            if (item.getId() == comid) {
                name = "Food";
            }
        }
        System.out.println("Commodity whose id is " + comid + " belongs to " + name);
    }

    public void findMaxPrice() {
        long max = 0;
        for (Bottle item : this.bottles) {
            if (item.getPrice() > max) {
                max = item.getPrice();
            }
        }
        for (Equipment item : this.equipments) {
            if (item.getPrice() > max) {
                max = item.getPrice();
            }
        }
        for (Food item : this.foods.values()) {
            if (item.getPrice() > max) {
                max = item.getPrice();
            }
        }
        for (Adventure item : this.hires.values()) {
            if (item.price + item.money > max) {
                max = item.price + item.money;
            }
        }
        System.out.println(max);
    }

    public void addmoney(long price) {
        this.money = this.money + price;
    }

    public void submoney(long price) {
        this.money = this.money - price;
    }

    public void addprice(long price) {
        this.price = this.price + price;
    }

    public void subprice(long price) {
        this.price = this.price - price;
    }

    public void sellall() {
        long sum = 0;
        Shop shop = Shop.getInstance();
        Iterator<Bottle> iterator = bottles.iterator(); //迭代器方法删除
        while (iterator.hasNext()) {
            Bottle bottle = iterator.next();
            if (bottle.getbecarried()) {
                iterator.remove();
                shop.addbotcnt();
                shop.addallbotprice(bottle.getPrice());
                shop.addallbotcapacity(bottle.getCapacity());
                sum = sum + bottle.getPrice();
            }
        }
        Iterator<Equipment> iterator1 = equipments.iterator();
        while (iterator1.hasNext()) {
            Equipment equipment = iterator1.next();
            if (equipment.getBecarried()) {
                iterator1.remove();
                shop.addequcnt();
                shop.addallequprice(equipment.getPrice());
                shop.addallequstar(equipment.getStar());
                sum = sum + equipment.getPrice();
            }
        }
        Iterator<Food> iterator2 = foods.values().iterator();
        while (iterator2.hasNext()) {
            Food food = iterator2.next();
            if (food.getBecarried()) {
                iterator2.remove();
                sum = sum + food.getPrice();
                shop.addfoodcnt();
                shop.addallfoodprice(food.getPrice());
                shop.addallfoodenergy(food.getEnergy());
            }
        }
        this.price = this.price - sum;
        this.money = this.money + sum;
        System.out.println(this.getName() + " emptied the backpack " + sum);
    }

    public long getMoney() {
        return this.money;
    }

    public int getHitpoint() {
        return this.hitpoint;
    }

    public void gethelp(int a) {
        for (Adventure item : this.hires.values()) {
            if (item.money >= a * 10000L) {
                this.money = this.money + a * 10000L;
                item.money = item.money - a * 10000L;
                this.addmoneytoprice(a * 10000L);
                item.submoneytoprice(a * 10000L);
            } else {
                this.money = this.money + item.money;
                item.submoneytoprice(item.money);
                this.addmoneytoprice(item.money);
                item.money = 0;
            }
        }
    }
}