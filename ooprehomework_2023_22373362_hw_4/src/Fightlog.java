//把fightlog视作与adventure平级的一个个个体
import java.util.ArrayList;

public class Fightlog {

    private int mode;
    private String aname;
    private ArrayList<String> ednames;
    private String time;
    private String objectname;

    public Fightlog(int mode,String time,String attackname,String objectname) {
        this.mode = mode;
        this.time = time;
        this.aname = attackname;
        this.ednames = new ArrayList<>();
        this.objectname = objectname;
    }

    public String getAttacker() {
        return aname;
    }

    public int getMode() {
        return mode;
    }

    public String getTime() {
        return time;
    }

    public String getObjectname() {
        return objectname;
    }

    public boolean MatchMode1(Adventure adventure,String botname) {
        return adventure.usebottle2(adventure, botname);
    }

    public boolean MatchMode2(Adventure attack,Adventure attacked,String equname) {
        if (attack.hurtone(attack,attacked,equname)) {
            this.ednames.add(attacked.getName());  //添加被攻击列表
            return true;
        } else {
            return false;
        }
    }

    public boolean MatchMode3(Adventure attack,ArrayList<Adventure> attacked,String equname) {
        if (attack.hurtothers(attack,attacked,equname)) {
            for (Adventure item : attacked) {
                this.ednames.add(item.getName());
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean containAttacked(String name) {
        return this.ednames.contains(name);
    }

    public void PrintMode1() {
        System.out.println(this.time + " " + this.aname + " used " + this.objectname);
    }

    public void PrintMode2() {
        String str = time + " " + aname + " attacked " + ednames.get(0) + " with " + objectname;
        System.out.println(str);
    }

    public void PrintMode3() {
        String str = this.time + " " + this.aname + " AOE-attacked with " + this.objectname;
        System.out.println(str);
    }
}
