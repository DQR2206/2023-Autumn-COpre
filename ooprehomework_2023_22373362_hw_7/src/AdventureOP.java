import java.util.ArrayList;

public class AdventureOP {

    public static void usebottle(Adventure man, String name) {
        int min = 2147483647;
        Bottle bottle0 = null;
        ArrayList<Bottle> bottles = man.getBottles();
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
                    System.out.println(min + " " + man.getHitpoint());
                } else if (bottle0.getisempty()) {
                    man.subPrice(bottle0.getPrice());
                    bottles.remove(bottle0);
                    System.out.println(min + " " + man.getHitpoint());
                }
            } else if (bottle0 instanceof ReinforcedBottle) {
                if (!bottle0.getisempty()) {
                    int capa = bottle0.getCapacity();
                    int addhit = (int)((1 + ((ReinforcedBottle) bottle0).getRatio()) * capa);
                    man.addhitpoint(man,addhit);
                    bottle0.subcapacity();
                    System.out.println(min + " " + man.getHitpoint());
                } else if (bottle0.getisempty()) {
                    man.subPrice(bottle0.getPrice());
                    bottles.remove(bottle0);
                    System.out.println(min + " " + man.getHitpoint());
                }
            } else {
                if (!bottle0.getisempty()) {
                    int addhit = (int) (((RecoverBottle) bottle0).getRatio() * man.getHitpoint());
                    man.addhitpoint(man, addhit);
                    bottle0.subcapacity();
                    System.out.println(min + " " + man.getHitpoint());
                } else if (bottle0.getisempty()) {
                    man.subPrice(bottle0.getPrice());
                    bottles.remove(bottle0);
                    System.out.println(min + " " + man.getHitpoint());
                }
            }
        } else {
            System.out.println("fail to use" + " " + name);
        }
    }

}
