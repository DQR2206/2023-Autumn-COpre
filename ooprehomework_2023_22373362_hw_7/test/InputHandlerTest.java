import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class InputHandlerTest  {

    @Test
    public void testSolve() {
        ArrayList<ArrayList<String>> inputinfo = new ArrayList<>();
        String nextLine = "1 123456 dqr"; // 读取本行指令
        String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
        inputinfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        InputHandler inputHandler = new InputHandler(inputinfo);
        inputHandler.solve(1,0);
        //inputHandler.solve(2,0);
    }
    @Test
    public void testOP14() {

    }

    @Test
    public void testOP15() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        HashMap<Integer,Adventure> adventures = new HashMap<>();
        InputHandler inputHandler = new InputHandler(inputInfo);
        String adv1 = "1 123456 dqr";
        String[] string0 = adv1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string0)));
        Command.OP1(0,inputInfo,adventures);

        String adv2 = "1 111111 lb";
        String[] string1 = adv2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string1)));
        Command.OP1(1,inputInfo,adventures);

        String bot1 = "2 123456 111 bot1 50 100 RecoverBottle 0.67";
        String[] string2 = bot1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string2)));
        Command.OP2(2,inputInfo,adventures);

        String bot2 = "2 123456 111 bot2 50 100 ReinforcedBottle 0.65";
        String[] string3 = bot2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string3)));
        Command.OP2(3,inputInfo,adventures);

        String addbot2 = "10 123456 111";
        String[] string4 = addbot2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string4)));
        Command.OP10(4,inputInfo,adventures);

        String equ1 = "4 123456 123 equ1 1 90 RegularEquipment";
        String[] string5 = equ1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string5)));
        Command.OP4(5,inputInfo,adventures);

        String equ2 = "4 123456 222 equ2 2 70 EpicEquipment";
        String[] string6 = equ2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string6)));
        Command.OP4(6,inputInfo,adventures);

        String addequ2 = "9 123456 222";
        String[] string7 = addequ2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string7)));
        Command.OP9(7,inputInfo,adventures);

        String op14 = "14 2 9 dqr lb";
        String[] string8 = op14.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string8)));

        String a = "1 2022/09 dqr bot1";
        String[] string9 = a.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string9)));

        String b = "1 2022/09 dqr bot2";
        String[] string10 = b.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string10)));

        String c = "1 2022/09 qzy bot1";
        String[] string11 = c.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string11)));

        String a1 = "2 2022/09 dqr lb equ1";
        String[] string12 = a1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string12)));

        String b1 = "2 2022/09 dqr lb equ2";
        String[] string13 = b1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string13)));

        String c1 = "2 2022/09 dqr gxp equ1";
        String[] string14 = c1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string14)));

        String a2 = "3 2022/09 dqr # equ1";
        String[] string15 = a2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string15)));

        String b2 = "3 2022/09 dqr # equ2";
        String[] string16 = b2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string16)));

        String c2 = "3 2022/09 gm # equ1";
        String[] string17 = c2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string17)));

        inputHandler.addadventure(0);
        inputHandler.addadventure(1);
        inputHandler.OP14(8);

        String op15 = "15 2022/09";
        String[] string18 = op15.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string18)));
        inputHandler.OP15(18);

        String op16 = "16 123456";
        String[] string19 = op16.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string19)));
        inputHandler.OP16(19);

        String op17 = "17 111111";
        String[] string20 = op17.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string20)));
        inputHandler.OP17(20);
    }

    @Test
    public void testOP16() {

    }

    @Test
    public void testOP17() {

    }

    @Test
    public void testOP18() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        HashMap<Integer,Adventure> adventures = new HashMap<>();
        InputHandler inputHandler = new InputHandler(inputInfo);
        String adv1 = "1 123456 dqr";
        String[] string0 = adv1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string0)));
        Command.OP1(0,inputInfo,adventures);

        String adv2 = "1 111111 lb";
        String[] string1 = adv2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string1)));
        Command.OP1(1,inputInfo,adventures);

        String hire = "18 123456 111111";
        String[] string2 = hire.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string2)));
        inputHandler.addadventure(0);
        inputHandler.addadventure(1);
        inputHandler.OP18(2);

        String OP19 = "19 123456";
        String[] string3 = OP19.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string3)));
        inputHandler.OP19(3);

        String OP20 = "20 123456";
        String[] string4 = OP20.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string4)));
        inputHandler.OP20(4);
    }

    @Test
    public void testOP19() {

    }

    @Test
    public void testOP20() {

    }

    @Test
    public void testOP21() {

    }

    @Test
    public void testOP23() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        HashMap<Integer,Adventure> adventures = new HashMap<>();
        InputHandler inputHandler = new InputHandler(inputInfo);
        Shop shop = Shop.getInstance();
        shop.addbotcnt();
        shop.addallbotcapacity(100);
        shop.addallbotprice(50);
        String adv = "1 123456 dqr";
        String[] string0 = adv.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string0)));
        String OP23 = "23 123456 111 ok RegularBottle";
        String[] string1 = OP23.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string1)));
        inputHandler.addadventure(0);
        inputHandler.OP23(1);
        String OP231 = "23 123456 222 alright RecoverBottle 0.9";
        String[] string2 = OP231.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string2)));
        inputHandler.OP23(2);
        shop.addallbotprice(200);
        shop.addbotcnt();
        shop.addbotcnt();
        shop.addbotcnt();
        shop.addbotcnt();
        String OP232 = "23 123456 333 xzq ReinforcedBottle 0.1";
        String[] string3 = OP232.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string3)));
        inputHandler.OP23(3);

        String OP233 = "23 123456 444 xzq RegularEquipment";
        String[] string4 = OP233.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string4)));
        inputHandler.OP23(4);

        String OP234 = "23 123456 555 xzq EpicEquipment 0.1";
        String[] string5 = OP234.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string5)));
        inputHandler.OP23(5);

        String OP235 = "23 123456 555 xzq CritEquipment 200";
        String[] string6 = OP235.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string6)));
        inputHandler.OP23(6);

        String OP236 = "23 123456 555 xzq Food";
        String[] string7 = OP236.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string7)));
        inputHandler.OP23(7);
    }

    @Test
    public void testreadhitpoint() {
        String name1 = "dqr";
        String name2 = "xrz";
        Adventure adventure = new Adventure(1,"A");
        Adventure adventure1 = new Adventure(2,"B");
        Adventure adventure2 = new Adventure(3,"C");
        Adventure adventure3 = new Adventure(4,"D");
        ArrayList<Adventure> adventures = new ArrayList<>();
        adventures.add(adventure);
        adventures.add(adventure1);
        adventures.add(adventure2);
        adventures.add(adventure3);
        adventure.hire(3,adventure2);
        adventure2.hire(4,adventure3);
        adventure1.hire(4,adventure3);
        adventure.addhitpoint(adventure,-493);
        adventure1.addhitpoint(adventure1,-491);
        adventure2.addhitpoint(adventure2,-496);
        adventure3.addhitpoint(adventure3,-490);
         ArrayList<Integer> hitpoint = new ArrayList<>();
        for(int i = 0; i < adventures.size(); i++) {
            Adventure adventure4 = adventures.get(i);
            hitpoint.add(adventure4.getHitpoint());
            System.out.println(hitpoint.get(i));
        }
        ArrayList<Integer> hitpoint1 = new ArrayList<>();
        adventure.addhitpoint(adventure,-4);
        adventure1.addhitpoint(adventure1,-4);
        adventure2.addhitpoint(adventure2,-2);
        for(int i = 0; i < adventures.size(); i++) {
            Adventure adventure4 = adventures.get(i);
            hitpoint1.add(adventure4.getHitpoint());
            System.out.println(hitpoint1.get(i));
        }
        for (int i = 0;i < adventures.size(); i++) {
            if (hitpoint1.get(i) <= (int)(hitpoint.get(i) / 2)) {  //不大于进入战斗之前的一半
                int a = hitpoint.get(i) - hitpoint1.get(i);   //损失的体力
                System.out.println(a);
            }
        }

    }


}