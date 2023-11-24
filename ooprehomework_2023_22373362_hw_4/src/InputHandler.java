import java.util.ArrayList;
import java.util.HashMap;
//用这个类来解析指令

public class InputHandler {
    private  ArrayList<ArrayList<String>> inputInfo;
    private HashMap<Integer,Adventure> adventures;//构造id与对应adventure的映射
    private ArrayList<Fightlog> fightlogs;

    public InputHandler(ArrayList<ArrayList<String>> inputInfo)
    {
        this.inputInfo = inputInfo;
        this.adventures = new HashMap<>();
        this.fightlogs = new ArrayList<>();
    }

    public void solve(int op,int row) {
        if (op == 1) {
            OP1(row);
        } else if (op == 2) {
            OP2(row);
        } else if (op == 3) {
            OP3(row);
        } else if (op == 4) {
            OP4(row);
        } else if (op == 5) {
            OP5(row);
        } else if (op == 6) {
            OP6(row);
        } else if (op == 7) {
            OP7(row);
        } else if (op == 8) {
            OP8(row);
        } else if (op == 9) {
            OP9(row);
        } else if (op == 10) {
            OP10(row);
        } else if (op == 11) {
            OP11(row);
        } else if (op == 12) {
            OP12(row);
        } else if (op == 13) {
            OP13(row);
        } else if (op == 14) {
            OP14(row);
        } else if (op == 15) {
            OP15(row);
        } else if (op == 16) {
            OP16(row);
        } else if (op == 17) {
            OP17(row);
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
            if (item.getName(item).equals(name) && item.getBecarried(item)) { //已经被携带的同名装备
                equipment1 = item;
                break;
            }
        }
        if (equipment1 != null) {
            equipment1.reset(equipment1);
        }
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

    public void OP14(int row)
    {
        ArrayList<String> fightnames = nameSet(row);
        int m = Integer.parseInt(inputInfo.get(row).get(1));
        int k = Integer.parseInt(inputInfo.get(row).get(2));
        for (int i = 1; i <= k; i++) {
            int mode = Integer.parseInt(inputInfo.get(row + i).get(0));
            String date = inputInfo.get(row + i).get(1);
            String advname1 = inputInfo.get(row + i).get(2);
            if (mode == 1) {
                String botname = inputInfo.get(row + i).get(3);
                if (fightnames.contains(advname1)) {
                    Fightlog fightlog = new Fightlog(mode,date,advname1,botname);
                    Adventure adventure = findadv(advname1);
                    if (fightlog.MatchMode1(adventure,botname)) {
                        fightlogs.add(fightlog);
                    }
                } else {
                    System.out.println("Fight log error");
                }
            } else if (mode == 2) {
                String advname2 = inputInfo.get(row + i).get(3);
                String equname = inputInfo.get(row + i).get(4);
                if (fightnames.contains(advname1) && fightnames.contains(advname2)) {
                    Fightlog fightlog = new Fightlog(mode,date,advname1,equname);
                    Adventure attack = findadv(advname1);
                    Adventure attacked = findadv(advname2);
                    if (fightlog.MatchMode2(attack,attacked,equname)) {
                        fightlogs.add(fightlog);
                    }
                } else {
                    System.out.println("Fight log error");
                }
            } else { //mode == 3
                String equname = inputInfo.get(row + i).get(3);
                if (fightnames.contains(advname1)) {
                    Fightlog fightlog = new Fightlog(mode,date,advname1,equname);
                    Adventure attack = findadv(advname1);
                    ArrayList<Adventure> attacked = new ArrayList<>();
                    for (String item : fightnames) {
                        if (!item.equals(advname1)) {  //排除自己
                            attacked.add(findadv(item));
                        }
                    }
                    if (fightlog.MatchMode3(attack,attacked,equname)) {
                        fightlogs.add(fightlog);
                    }
                } else {
                    System.out.println("Fight log error");
                }

            }
        }
    }

    public ArrayList<String> nameSet(int row) {
        int cnt = 0;
        ArrayList<String> names = new ArrayList<>();
        for (int i = 3; cnt < Integer.parseInt(inputInfo.get(row).get(1));i++) {
            names.add(inputInfo.get(row).get(i));
            cnt++;
        }
        return names;
    }

    public void OP15(int i) {
        String date = inputInfo.get(i).get(1);
        int cnt = 0;
        for (Fightlog fightlog : fightlogs) {
            if (fightlog.getTime().equals(date)) { //满足日期条件
                cnt++;
                if (fightlog.getMode() == 1) {
                    fightlog.PrintMode1();
                } else if (fightlog.getMode() == 2) {
                    fightlog.PrintMode2();
                } else {
                    fightlog.PrintMode3();
                }
            }
        }
        if (cnt == 0) {
            System.out.println("No Matched Log");
        }
    }

    public void OP16(int i) {  //查询作为攻击者的战斗日志
        int advid = Integer.parseInt(inputInfo.get(i).get(1));
        int cnt = 0;
        String name = adventures.get(advid).getName();
        for (Fightlog fightlog : fightlogs) {
            if (fightlog.getAttacker().equals(name) && fightlog.getMode() != 1) {
                cnt++;
                if (fightlog.getMode() == 2) {
                    fightlog.PrintMode2();;
                } else if (fightlog.getMode() == 3) {
                    fightlog.PrintMode3();
                }
            }
        }
        if (cnt == 0) {
            System.out.println("No Matched Log");
        }
    }

    public void OP17(int i) {   //作为被攻击者的日志  查询这个冒险者的名字是否在fightlog中的被攻击者数组
        int advid = Integer.parseInt(inputInfo.get(i).get(1));
        int cnt = 0;
        String name = adventures.get(advid).getName();
        for (Fightlog fightlog : fightlogs) {
            if (fightlog.getMode() != 1 && fightlog.containAttacked(name)) {
                cnt++;
                if (fightlog.getMode() == 2) {
                    fightlog.PrintMode2();
                } else if (fightlog.getMode() == 3) {
                    fightlog.PrintMode3();;
                }
            }
        }
        if (cnt == 0) {
            System.out.println("No Matched Log");
        }
    }

    public Adventure findadv(String name) {
        Adventure man = null;
        for (Adventure value : adventures.values()) {
            if (value.getName().equals(name)) {
                man = value;
                return man;
            }
        }
        return null;
    }

}

