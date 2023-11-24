import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in); //读取指令条数
        int opCount = Integer.parseInt(scanner.nextLine());
        HashMap<Integer,Adventure> adventurers = new HashMap<>(); //构造id与对应adventure的映射
        for (int i = 0;i < opCount;i++) {
            String opLine = scanner.nextLine();//整行读取字符串
            Scanner opLineScannner = new Scanner(opLine);
            int op = opLineScannner.nextInt();//nextInt()方法读取字符串中第一个整数
            int id = opLineScannner.nextInt();//读取第二个整数
            if (op == 1) { //增加冒险者
                String name = opLineScannner.next();//读取名字
                Adventure adventurer = new Adventure(id,name);
                adventurers.put(id,adventurer);
            } else if (op == 2) { //增加药水瓶
                int botId = opLineScannner.nextInt();
                String botName = opLineScannner.next();
                int botCapacity = opLineScannner.nextInt();
                Bottle bottle = new Bottle(botId,botName,botCapacity);
                Adventure man = adventurers.get(id);
                man.addBottle(bottle);
            } else if (op == 3) { //删除药水瓶
                int botid = opLineScannner.nextInt();
                Adventure man = adventurers.get(id);
                Bottle bottle = man.getBottle(botid);
                String bottlename = bottle.getName(bottle);
                man.removeBottle(bottle);
                int bottlesnum = man.BottlesNumber(man);
                System.out.println(bottlesnum + " " + bottlename);
            } else if (op == 4) { //增加装备
                int equId = opLineScannner.nextInt();
                String equName = opLineScannner.next();
                int equStar = opLineScannner.nextInt();
                Adventure man = adventurers.get(id);
                Equipment equipment = new Equipment(equId,equName,equStar);
                man.addEquipment(equipment);
            } else if (op == 5) { //删除装备
                int equId = opLineScannner.nextInt();
                Adventure man = adventurers.get(id);
                Equipment equipment = man.getEquipment(equId);
                String equipmentName = equipment.getName(equipment);
                man.removeEquipment(equipment);
                int equipmentNumber = man.EquipmentNumber(man);
                System.out.println(equipmentNumber + " " + equipmentName);
            } else if (op == 6) { //装备升级
                int equId = opLineScannner.nextInt();
                Adventure man = adventurers.get(id);
                Equipment equipment = man.getEquipment(equId);
                equipment.setStar(equipment.getStar() + 1);
                String equipmentName = equipment.getName(equipment);
                int star = equipment.getStar();
                System.out.println(equipmentName + " " + star);
            }
        }
    }
}
