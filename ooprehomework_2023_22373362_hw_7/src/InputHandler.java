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
            Command.OP1(row,inputInfo,adventures);
        } else if (op == 2) {
            Command.OP2(row,inputInfo,adventures);
        } else if (op == 3) {
            Command.OP3(row,inputInfo,adventures);
        } else if (op == 4) {
            Command.OP4(row,inputInfo,adventures);
        } else if (op == 5) {
            Command.OP5(row,inputInfo,adventures);
        } else if (op == 6) {
            Command.OP6(row,inputInfo,adventures);
        } else if (op == 7) {
            Command.OP7(row,inputInfo,adventures);
        } else if (op == 8) {
            Command.OP8(row,inputInfo,adventures);
        } else if (op == 9) {
            Command.OP9(row,inputInfo,adventures);
        } else if (op == 10) {
            Command.OP10(row,inputInfo,adventures);
        } else if (op == 11) {
            Command.OP11(row,inputInfo,adventures);
        } else if (op == 12) {
            Command.OP12(row,inputInfo,adventures);
        } else if (op == 13) {
            Command.OP13(row,inputInfo,adventures);
        } else if (op == 14) {
            OP14(row);
        } else if (op == 15) {
            OP15(row);
        } else if (op == 16) {
            OP16(row);
        } else if (op == 17) {
            OP17(row);
        } else if (op == 18) {
            OP18(row);
        } else if (op == 19) {
            OP19(row);
        } else if (op == 20) {
            OP20(row);
        } else if (op == 21) {
            OP21(row);
        } else if (op == 22) {
            OP22(row);
        } else if (op == 23) {
            OP23(row);
        }
    }

    public void addadventure(int i) {  //仅测试用
        int advId = Integer.parseInt(inputInfo.get(i).get(1));
        String name = inputInfo.get(i).get(2);
        Adventure man = new Adventure(advId,name);
        man.addmoney(100);
        adventures.put(advId,man);

    }

    public void OP14(int row)
    {
        ArrayList<String> fightnames = nameSet(row);
        ArrayList<Integer> fighthitpoints = readhitpoint(fightnames);
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
        ArrayList<Integer> fighthitpoints1 = readhitpoint(fightnames);
        help(fightnames,fighthitpoints,fighthitpoints1);
    }

    public ArrayList<Integer> readhitpoint(ArrayList<String> fightnames) {
        ArrayList<Integer> fighthitpoint = new ArrayList<>();
        for (int i = 0; i < fightnames.size(); i++) {
            Adventure adventure = findadv(fightnames.get(i));
            fighthitpoint.add(adventure.getHitpoint());
        }
        return fighthitpoint;
    }

    public void help(ArrayList<String> names,
                     ArrayList<Integer> hitpoints,
                     ArrayList<Integer> hitpoints1)
    {
        for (int i = 0;i < names.size(); i++) {
            if (hitpoints1.get(i) <= (int)(hitpoints.get(i) / 2)) {  //不大于进入战斗之前的一半
                int a = hitpoints.get(i) - hitpoints1.get(i);   //损失的体力
                Adventure adventure = findadv(names.get(i));
                adventure.gethelp(a);
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
                    fightlog.PrintMode2();
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
                    fightlog.PrintMode3();
                }
            }
        }
        if (cnt == 0) {
            System.out.println("No Matched Log");
        }
    }

    public  Adventure findadv(String name) {
        Adventure man = null;
        for (Adventure value : adventures.values()) {
            if (value.getName().equals(name)) {
                man = value;
                return man;
            }
        }
        return null;
    }

    public void OP18(int i) {
        int id1 = Integer.parseInt(inputInfo.get(i).get(1));
        int id2 = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure adventure1 = adventures.get(id1);
        Adventure adventure2 = adventures.get(id2);
        adventure1.hire(id2,adventure2);
    }

    public void OP19(int i) {
        int id1 = Integer.parseInt(inputInfo.get(i).get(1));
        Adventure man = adventures.get(id1);
        man.getAllPrice();
    }

    public void OP20(int i) {
        int id = Integer.parseInt(inputInfo.get(i).get(1));
        Adventure man = adventures.get(id);
        man.findMaxPrice();
    }

    public void OP21(int i) {
        int advid = Integer.parseInt(inputInfo.get(i).get(1));
        int comid = Integer.parseInt(inputInfo.get(i).get(2));
        Adventure man = adventures.get(advid);
        man.search(comid); //冒险者价值体不向下寻找
    }

    public void OP22(int i) {  //卖出冒险者“携带”的所有物品
        int advid = Integer.parseInt(inputInfo.get(i).get(1));
        Adventure adventure = adventures.get(advid);
        adventure.sellall();
    }

    public void OP23(int i) {
        int advid = Integer.parseInt(inputInfo.get(i).get(1));
        Adventure adventure = adventures.get(advid);
        int id = Integer.parseInt(inputInfo.get(i).get(2));
        String name = inputInfo.get(i).get(3);
        String t = inputInfo.get(i).get(4);
        Shop shop = Shop.getInstance();
        Bottle bottle = null;
        Equipment equipment = null;
        Food food = null;
        if (t.equals("RegularBottle") || t.equals("ReinforcedBottle") || t.equals("RecoverBottle"))
        {
            int avercapa = shop.botaveragecapacity();
            long averbotprice = shop.botaverageprice();
            if (t.equals("RegularBottle")) {
                bottle = new RegularBottle(id, name, avercapa, averbotprice);
            } else if (t.equals("RecoverBottle")) {
                double ratio = Double.parseDouble(inputInfo.get(i).get(5));
                bottle = new RecoverBottle(id, name, avercapa, averbotprice, ratio);
            } else {
                double ratio = Double.parseDouble(inputInfo.get(i).get(5));
                bottle = new ReinforcedBottle(id, name, avercapa, averbotprice, ratio);
            }
            printbot(adventure,averbotprice,bottle);
        }
        else if (t.equals("RegularEquipment") ||
                t.equals("EpicEquipment") ||
                t.equals("CritEquipment")) {
            int averstar = shop.equaveragestar();
            long averequprice = shop.equaverageprice();
            if (t.equals("RegularEquipment")) {
                equipment = new RegularEquipment(id, name, averstar, averequprice);
            } else if (t.equals("EpicEquipment")) {
                double ratio = Double.parseDouble(inputInfo.get(i).get(5));
                equipment = new EpicEquipment(id, name, averstar, averequprice, ratio);
            } else {
                int critical = Integer.parseInt(inputInfo.get(i).get(5));
                equipment = new CritEquipment(id, name, averstar, averequprice, critical);
            }
            printequ(adventure,averequprice,equipment);
        } else {
            int averfoodenergy = shop.foodaverageenergy();
            long averfoodprice = shop.foodaverageprice();
            food = new Food(id,name,averfoodenergy,averfoodprice);
            printfood(adventure,averfoodprice,food);
        }
    }

    public void printbot(Adventure adventure,long price,Bottle bottle) {
        if (adventure.getMoney() >= price) {
            adventure.submoney(price);
            adventure.addprice(price);
            adventure.addBottle(bottle);
            System.out.println("successfully buy " + bottle.getName() + " for " + price);
        } else {
            System.out.println("failed to buy " + bottle.getName() + " for " + price);
        }
    }

    public void printequ(Adventure adventure,long price,Equipment equipment) {
        if (adventure.getMoney() >= price) {
            adventure.submoney(price);
            adventure.addprice(price);
            adventure.addEquipment(equipment);
            System.out.println("successfully buy " + equipment.getName() + " for " + price);
        } else {
            System.out.println("failed to buy " + equipment.getName() + " for " + price);
        }
    }

    public void printfood(Adventure adventure,long price,Food food) {
        if (adventure.getMoney() >= price) {
            adventure.submoney(price);
            adventure.addprice(price);
            adventure.addfood(food.getId(),food);
            System.out.println("successfully buy " + food.getName() + " for " + price);
        } else {
            System.out.println("failed to buy " + food.getName() + " for " + price);
        }
    }
}

