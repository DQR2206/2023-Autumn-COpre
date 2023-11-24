import java.util.ArrayList;
import java.util.HashMap;
//用这个类来解析指令

public class InputHandler {
    private  ArrayList<ArrayList<String>> inputInfo;
    private HashMap<Integer,Adventure> adventures;//构造id与对应adventure的映射

    public InputHandler(ArrayList<ArrayList<String>> inputInfo)
    {
        this.adventures = new HashMap<>();
        this.inputInfo = inputInfo;
    }

    public void solve(int n) {
        for (int i = 0; i < n; i++) {
            int op = Integer.parseInt(inputInfo.get(i).get(0));
            if (op == 1) {
                OP1(i);
            } else if (op == 2) {
                OP2(i);
            } else if (op == 3) {
                OP3(i);
            } else if (op == 4) {
                OP4(i);
            } else if (op == 5) {
                OP5(i);
            } else if (op == 6) {
                OP6(i);
            } else if (op == 7) {
                OP7(i);
            } else if (op == 8) {
                OP8(i);
            } else if (op == 9) {
                OP9(i);
            } else if (op == 10) {
                OP10(i);
            } else if (op == 11) {
                OP11(i);
            } else if (op == 12) {
                OP12(i);
            } else if (op == 13) {
                OP13(i);
            }
        }
    }

    public void OP1(int i) {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        String name = inputInfo.get(i).get(2);
        Adventure man = new Adventure(advId,name);
        adventures.put(advId,man);
    }

    //增加药水瓶
    public void OP2(int i) {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int botId = Integer.parseInt(inputInfo.get(i).get(2));
        String botName = inputInfo.get(i).get(3);
        int botCapacity = Integer.parseInt(inputInfo.get(i).get(4));
        Bottle bottle = new Bottle(botId,botName,botCapacity);
        Adventure man = adventures.get(advId);
        man.addBottle(bottle);
    }

    //删除药水瓶 3 5 8  这里要注意 背包与外界是包含关系，而不是互斥关系，在最初的实现中，我使用了互斥关系 导致代码异常繁琐
    public void OP3(int i)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int botid = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        Bottle bottle = man.getBottle(botid);
        String name = bottle.getName(bottle);
        bottle.reset(bottle);      // boolean
        man.removeBottle(bottle);  //从最外层中删除
        int bottlesnum = man.getBotNum(man);
        System.out.println(bottlesnum + " " + name);
    }

    //增加装备
    public void OP4(int i)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int equId = Integer.parseInt(inputInfo.get(i).get(2));
        String equName = inputInfo.get(i).get(3);
        int equStar = Integer.parseInt(inputInfo.get(i).get(4));
        Adventure man = adventures.get(advId);
        Equipment equipment = new Equipment(equId,equName,equStar);
        man.addEquipment(equipment);
    }

    //删除装备
    public void OP5(int i)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int equId = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        Equipment equipment = man.getEquipment(equId);
        String equipmentName = equipment.getName(equipment);
        man.removeEquipment(equipment);
        int equipmentNumber = man.getEquipmentNumber(man);
        equipment.reset(equipment);
        System.out.println(equipmentNumber + " " + equipmentName);
    }

    //装备升级
    public void OP6(int i)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int equId = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        Equipment equipment = man.getEquipment(equId);
        equipment.setStar(equipment.getStar() + 1);
        String equipmentName = equipment.getName(equipment);
        int star = equipment.getStar();
        System.out.println(equipmentName + " " + star);
    }

    //增加食物
    public void OP7(int i) {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int foodId = Integer.parseInt(inputInfo.get(i).get(2));
        String name = inputInfo.get(i).get(3);
        int energy = Integer.parseInt(inputInfo.get(i).get(4));
        Adventure man = adventures.get(advId);
        Food food = new Food(foodId,name,energy);
        man.addfood(foodId,food);
    }

    //删除食物
    public void OP8(int i)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int foodId = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        Food food = man.getFood(foodId);
        String foodName = food.getFoodname(food);
        man.removeFood(food);
        food.reset(food);
        int foodSize = man.getFoodsize(man);
        System.out.println(foodSize + " " + foodName);
    }

    //携带装备   替换同名装备  注意已经保证携带一定拥有
    public void OP9(int i)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int equId = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        Equipment equipment = null;
        ArrayList<Equipment> equipments = man.returnequ(man);
        for (Equipment item : equipments) {
            if (item.getID(item) == equId) {
                equipment = item;
                break;
            }
        }
        String name = equipment.getName(equipment);
        //检查当前想要携带的装备是否存在同名 如果有则进行替换
        Equipment equipment1 = null;
        for (Equipment item : equipments) {
            if (item.getName(item).equals(name)) {
                equipment1 = item;
                break;
            }
        }
        equipment1.reset(equipment1);
        equipment.set(equipment);
    }

    //携带瓶子  携带同名的瓶子个数不超过 level/5 + 1
    public void OP10(int i)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int botId = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        int level = man.getLevel(man);
        int maxbot = level / 5 + 1;
        Bottle bottle = man.getBottle(botId);
        String name = bottle.getName(bottle);
        int samename = man.cntsamename(man,name);
        if (samename < maxbot) {
            bottle.set(bottle);
        }
    }

    //携带食物  无特殊限制
    public void OP11(int i)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        int foodId = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advId);
        Food food = man.getFood(foodId);
        food.set(food);
    }

    //使用瓶子
    public void OP12(int i)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        String name = inputInfo.get(i).get(2);
        Adventure man = adventures.get(advId);
        man.usebottle(man,name);
    }

    //使用食物
    public void OP13(int i)
    {
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        String name = inputInfo.get(i).get(2);
        Adventure man = adventures.get(advId);
        man.usefood(man,name);
    }
}
