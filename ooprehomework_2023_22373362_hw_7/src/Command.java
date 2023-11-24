import java.util.ArrayList;
import java.util.HashMap;

public class Command {
    public static void OP1(int i,
                           ArrayList<ArrayList<String>> inputInfo,
                           HashMap<Integer,Adventure> adventures)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        String name = inputInfo.get(i).get(2);
        Adventure man = new Adventure(advId,name);
        adventures.put(advId,man);
    }

    public static void OP2(int i,
                           ArrayList<ArrayList<String>> inputInfo,
                           HashMap<Integer,Adventure> adventures)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int botId = Integer.parseInt(inputInfo.get(i).get(2));
        String botName = inputInfo.get(i).get(3);
        int botCapacity = Integer.parseInt(inputInfo.get(i).get(4));
        long price = Long.parseLong(inputInfo.get(i).get(5));
        String type = inputInfo.get(i).get(6);
        Adventure man = adventures.get(advId);
        man.addPrice(price); //同时更新价值
        if (inputInfo.get(i).size() > 7) {  //regular类型可能没有最后一个参数 需要判断一下
            double ratio = Double.parseDouble(inputInfo.get(i).get(7));
            if (type.equals("ReinforcedBottle")) {
                ReinforcedBottle rein = new ReinforcedBottle(botId,botName,botCapacity,price,ratio);
                man.addBottle(rein);
            } else {
                RecoverBottle recover = new RecoverBottle(botId,botName,botCapacity,price,ratio);
                man.addBottle(recover);
            }
        } else {
            RegularBottle regularBottle = new RegularBottle(botId,botName,botCapacity,price);
            man.addBottle(regularBottle);
        }
    }

    public static void OP3(int i,
                           ArrayList<ArrayList<String>> inputInfo,
                           HashMap<Integer,Adventure> adventures)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int botid = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        Bottle bottle = man.getBottle(botid);
        bottle.reset();      // boolean
        long price = bottle.getPrice();
        man.addmoney(price); //增加金钱
        man.subprice(price);
        Shop shop = Shop.getInstance(); //对于商店的交易记录 我们可以发现其实只是计算上的要求，并不需要保存卖过去的实例
        shop.addallbotcapacity(bottle.getCapacity());
        shop.addallbotprice(price);
        shop.addbotcnt();
        man.removeBottle(bottle);  //从最外层中删除
        String name = bottle.getName();
        int bottlesnum = man.getBotNum(man);
        System.out.println(bottlesnum + " " + name);
    }

    public static void OP4(int i,
                           ArrayList<ArrayList<String>> inputInfo,
                           HashMap<Integer,Adventure> adventures)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int equId = Integer.parseInt(inputInfo.get(i).get(2));
        String equName = inputInfo.get(i).get(3);
        int equStar = Integer.parseInt(inputInfo.get(i).get(4));
        long price = Long.parseLong(inputInfo.get(i).get(5));
        String type = inputInfo.get(i).get(6);
        Adventure man = adventures.get(advId);
        man.addPrice(price);
        if (inputInfo.get(i).size() > 7) { //others属性考虑
            if (type.equals("EpicEquipment")) {
                double ratio = Double.parseDouble(inputInfo.get(i).get(7));
                EpicEquipment epicEquipment = new EpicEquipment(equId,equName,equStar,price,ratio);
                man.addEquipment(epicEquipment);
            } else {
                int critical = Integer.parseInt(inputInfo.get(i).get(7));
                CritEquipment crit = new CritEquipment(equId,equName,equStar,price,critical);
                man.addEquipment(crit);
            }
        } else {
            RegularEquipment regularEquipment = new RegularEquipment(equId,equName,equStar,price);
            man.addEquipment(regularEquipment);
        }
    }

    public static void OP5(int i,
                           ArrayList<ArrayList<String>> inputInfo,
                           HashMap<Integer,Adventure> adventures)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int equId = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        Equipment equipment = man.getEquipment(equId);
        man.addmoney(equipment.getPrice());  //增加金钱
        man.subprice(equipment.getPrice());  //减少价值属性 但是对于上级其实没有影响
        Shop shop = Shop.getInstance();  //卖
        shop.addallequstar(equipment.getStar());
        shop.addallequprice(equipment.getPrice());
        shop.addequcnt();
        String  equipmentName = equipment.getName();
        man.removeEquipment(equipment);
        int equipmentNumber = man.getEquipmentNumber(man);
        equipment.reset();
        System.out.println(equipmentNumber + " " + equipmentName);
    }

    public static void OP6(int i,
                           ArrayList<ArrayList<String>> inputInfo,
                           HashMap<Integer,Adventure> adventures)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int equId = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        Equipment equipment = man.getEquipment(equId);
        equipment.setStar(equipment.getStar() + 1);
        String equipmentName = equipment.getName();
        int star = equipment.getStar();
        System.out.println(equipmentName + " " + star);
    }

    public static void OP7(int i,
                           ArrayList<ArrayList<String>> inputInfo,
                           HashMap<Integer,Adventure> adventures)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int foodId = Integer.parseInt(inputInfo.get(i).get(2));
        String name = inputInfo.get(i).get(3);
        int energy = Integer.parseInt(inputInfo.get(i).get(4));
        long price = Long.parseLong(inputInfo.get(i).get(5));
        Adventure man = adventures.get(advId);
        man.addPrice(price);
        Food food = new Food(foodId,name,energy,price);
        man.addfood(foodId,food);
    }

    public static void OP8(int i,
                           ArrayList<ArrayList<String>> inputInfo,
                           HashMap<Integer,Adventure> adventures)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int foodId = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        Food food = man.getFood(foodId);
        man.addmoney(food.getPrice());
        man.subprice(food.getPrice());
        Shop shop = Shop.getInstance();
        shop.addallfoodenergy(food.getEnergy());
        shop.addallfoodprice(food.getPrice());
        shop.addfoodcnt();
        String foodName = food.getName();
        man.removeFood(food);
        food.reset();
        int foodSize = man.getFoodsize(man);
        System.out.println(foodSize + " " + foodName);
    }

    public static void OP9(int i,
                           ArrayList<ArrayList<String>> inputInfo,
                           HashMap<Integer,Adventure> adventures)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int equId = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        Equipment equipment = null;
        ArrayList<Equipment> equipments = man.returnequ(man);
        for (Equipment item : equipments) {
            if (item.getId() == equId) {
                equipment = item;
                break;
            }
        }
        String name = equipment.getName();
        Equipment equipment1 = null; //检查当前想要携带的装备是否存在同名 如果有则进行替换
        for (Equipment item : equipments) {
            if (item.getName().equals(name) && item.getBecarried()) { //已经被携带的同名装备
                equipment1 = item;
                break;
            }
        }
        if (equipment1 != null) {
            equipment1.reset();
        }
        equipment.set();
    }

    public static void OP10(int i,
                           ArrayList<ArrayList<String>> inputInfo,
                           HashMap<Integer,Adventure> adventures)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int botId = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        int level = man.getLevel(man);
        int maxbot = level / 5 + 1;
        Bottle bottle = man.getBottle(botId);
        String name = bottle.getName();
        int samename = man.cntsamename(man,name);
        if (samename < maxbot) {
            bottle.set();
        }
    }

    public static void OP11(int i,
                           ArrayList<ArrayList<String>> inputInfo,
                           HashMap<Integer,Adventure> adventures)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int foodId = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        Food food = man.getFood(foodId);
        food.set();
    }

    public static void OP12(int i,
                           ArrayList<ArrayList<String>> inputInfo,
                           HashMap<Integer,Adventure> adventures)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        String name = inputInfo.get(i).get(2);
        Adventure man = adventures.get(advId);
        AdventureOP.usebottle(man,name);
    }

    public static void OP13(int i,
                           ArrayList<ArrayList<String>> inputInfo,
                           HashMap<Integer,Adventure> adventures)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        String name = inputInfo.get(i).get(2);
        Adventure man = adventures.get(advId);
        man.usefood(man,name);
    }
}
