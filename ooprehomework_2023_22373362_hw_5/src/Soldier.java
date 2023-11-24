public class Soldier {
    private String name;
    private String incantation;

    public Soldier(String name, String incantation) {
        this.name = name;
        this.incantation = incantation;
    }
    // this method means "cut" the "incantation"

    public void cutIncantation(int a, int b) {
        if (a <= b) {
            if (b >= incantation.length() - 1) {
                if (a <= incantation.length() - 1) {
                    incantation = incantation.substring(a);
                } else {
                    this.incantation = "";
                }
            }
            else {
                incantation = incantation.substring(a,b + 1);
            }
        } else {
            incantation = "";
        }
    }

    //  2 means "to" , you will see it in the os codes  next semester
    public void appendStr2Incantation(String str) {
        incantation += str;
    }

    public Soldier cloneSoldier() {
        return new Soldier(this.name, this.incantation);
    }
    // !!!!! Be careful, this method  need to be carefully read and analyzed to identify bugs!

    public boolean notQualifiedByStandard(int standard) {
        int head = 0;
        int tail = 1;
        int totalCount = 0;
        while (tail < incantation.length()) {
            if (incantation.charAt(tail) != '@') {
                tail++;
                continue;
            }
            if (incantation.charAt(head) != '@') {
                head = tail;
                tail++;
                while (tail < incantation.length()) {
                    if (incantation.charAt(tail) == '@') {
                        break;
                    }
                    tail++;
                }
            }
            if (tail == incantation.length()) {
                break;
            }
            int count = 0;
            for (int i = head + 1;i < tail;i++) {
                if (incantation.charAt(i) >= 'A' && incantation.charAt(i) <= 'Z') {
                    count++;
                }
                if (incantation.charAt(i) >= 'a' && incantation.charAt(i) <= 'z') {
                    count--;
                }
            }
            if (count >= 0) {
                totalCount++;
            }
            head = tail;
            tail++;
        }
        return (totalCount < standard);
    }

    public boolean hasString(String str) {
        return incantation.contains(str);
    }

    public boolean equal(Soldier soldier) {
        return this.name.equals(soldier.name) && this.incantation.equals(soldier.incantation);
    }

    public String getName() {
        return name;
    }

    public String getIncantation() {
        return  incantation;
    }

}

