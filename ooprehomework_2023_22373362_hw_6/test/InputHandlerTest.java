import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

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

        //构造这个似乎最为复杂
    }
    @Test
    public void testOP1() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine = "1 123456 dqr"; // 读取本行指令
        String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        InputHandler inputHandler = new InputHandler(inputInfo);
        inputHandler.OP1(0);
    }

    @Test
    public void testOP2() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine = "1 123456 dqr";
        String nextLine1 = "2 123456 111 ok 60 100 RegularBottle";
        String nextLine2 = "2 123456 222 alright 50 120 RecoverBottle 0.12";
        String nextLine3 = "2 123456 333 yy 50 110 ReinforcedBottle 0.88";
        String[] string = nextLine.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string)));
        String[] string1 = nextLine1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string1)));
        String[] string2 = nextLine2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string2)));
        String[] string3 = nextLine3.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string3)));
        InputHandler inputHandler = new InputHandler(inputInfo);
        inputHandler.OP1(0);
        inputHandler.OP2(1);
        inputHandler.OP2(2);
        inputHandler.OP2(3);
    }

    @Test
    public void testOP3() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine1 = "1 123456 dqr"; // 读取本行指令
        String nextLine2 = "2 123456 111 dqr 60 100 RegularBottle"; // 读取本行指令
        String nextLine3 = "3 123456 111"; // 读取本行指令
        String[] strings = nextLine1.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        String[] string = nextLine2.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(string))); // 将指令分割后的各个部分存进容器中
        String[] stringss = nextLine3.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(stringss))); // 将指令分割后的各个部分存进容器中
        InputHandler inputHandler = new InputHandler(inputInfo);
        inputHandler.OP1(0);
        inputHandler.OP2(1);
        inputHandler.OP3(2);
    }

    @Test
    public void testOP4() {
         ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine = "1 123456 dqr";
        String nextLine1 = "4 123456 111 ok 4 50 RegularEquipment";
        String nextLine2 = "4 123456 222 alright 5 100 EpicEquipment 0.98";
        String nextLine3 = "4 123456 333 wzl 2 10 CritEquipment 100";
        String[] string = nextLine.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string)));
        String[] string1 = nextLine1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string1)));
        String[] string2 = nextLine2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string2)));
        String[] string3 = nextLine3.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string3)));
        InputHandler inputHandler = new InputHandler(inputInfo);
        inputHandler.OP1(0);
        inputHandler.OP4(1);
        inputHandler.OP4(2);
        inputHandler.OP4(3);
    }

    @Test
    public void testOP5() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine = "4 123456 111 ok 4 100 EpicEquipment 0.11"; // 读取本行指令
        String nextLine1 = "1 123456 dqr";
        String nextLine2 = "5 123456 111";
        String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        String[] string = nextLine1.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(string))); // 将指令分割后的各个部分存进容器中
        InputHandler inputHandler = new InputHandler(inputInfo);
        String[] stringss = nextLine2.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(stringss))); // 将指令分割后的
        inputHandler.OP1(1);
        inputHandler.OP4(0);
        inputHandler.OP5(2);
    }
    @Test
    public void testOP6() {
         ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine = "4 123456 111 dqr 4 80 CritEquipment 100"; // 读取本行指令
        String nextLine1 = "1 123456 dqr";
        String nextLine2 = "6 123456 111";
        String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        String[] string = nextLine1.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(string))); // 将指令分割后的各个部分存进容器中
        InputHandler inputHandler = new InputHandler(inputInfo);
        String[] stringss = nextLine2.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(stringss))); // 将指令分割后的
        inputHandler.OP1(1);
        inputHandler.OP4(0);
        inputHandler.OP6(2);
    }

    @Test
    public void testOP7() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine = "7 123456 111 ok 50 100"; // 读取本行指令
        String nextLine1 = "1 123456 dqr";
        String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        String[] string = nextLine1.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(string))); // 将指令分割后的各个部分存进容器中
        InputHandler inputHandler = new InputHandler(inputInfo);
        inputHandler.OP1(1);
        inputHandler.OP7(0);
    }

    @Test
    public void testOP8() {
         ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine = "7 123456 111 ok 50 100"; // 读取本行指令
        String nextLine1 = "1 123456 dqr";
        String nextLine2 = "8 123456 111";
        String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        String[] string = nextLine1.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(string))); // 将指令分割后的各个部分存进容器中
        String[] stringss = nextLine2.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(stringss)));
        InputHandler inputHandler = new InputHandler(inputInfo);
        inputHandler.OP1(1);
        inputHandler.OP7(0);
        inputHandler.OP8(2);
    }

    @Test
    public void testOP9() {
         ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine = "4 123456 111 dqr 4 10 EpicEquipment 0.9"; // 读取本行指令
        String nextLine1 = "1 123456 dqr";
        String nextLine2 = "9 123456 111";
        String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        String[] string = nextLine1.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(string))); // 将指令分割后的各个部分存进容器中
        String[] stringss = nextLine2.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(stringss))); //
        InputHandler inputHandler = new InputHandler(inputInfo);
        inputHandler.OP1(1);
        inputHandler.OP4(0);
        inputHandler.OP9(2);
    }

    @Test
    public void testOP10() {
         ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine = "2 123456 111 ok 60 100 RecoverBottle 0.98"; // 读取本行指令
        String nextLine1 = "1 123456 dqr ";
        String nextLine2 = "10 123456 111";
        String[] strings = nextLine.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(strings)));
        String[] string = nextLine1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string)));
        String[] stringss = nextLine2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(stringss)));
        InputHandler inputHandler = new InputHandler(inputInfo);
        inputHandler.OP1(1);
        inputHandler.OP2(0);
        inputHandler.OP10(2);
    }
@Test
    public void testOP11() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine = "7 123456 111 ok 50 20"; // 读取本行指令
        String nextLine1 = "1 123456 dqr";
        String nextLine2 = "11 123456 111";
        String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        String[] string = nextLine1.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(string)));
        String[] stringss = nextLine2.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(stringss)));
        InputHandler inputHandler = new InputHandler(inputInfo);
        inputHandler.OP1(1);
        inputHandler.OP7(0);
        inputHandler.OP11(2);
    }
@Test
    public void testOP12() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine = "2 123456 111 ok 60 100 ReinforcedBottle 0.13"; // 读取本行指令
        String nextLine1 = "1 123456  dqr ";
        String nextLine2 = "10 123456 111";
        String nextLine3 = "12 123456 ok";
        String[] strings = nextLine.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(strings)));
        String[] string = nextLine1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string)));
        String[] stringss = nextLine2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(stringss)));
        String[] stringsss = nextLine3.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(stringsss)));
        InputHandler inputHandler = new InputHandler(inputInfo);
        inputHandler.OP1(1);
        inputHandler.OP2(0);
        inputHandler.OP10(2);
        inputHandler.OP12(3);
    }
@Test
    public void testOP13() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine = "7 123456 111 ok 50 89"; // 读取本行指令
        String nextLine1 = "1 123456 dqr";
        String nextLine2 = "11 123456 111";
        String nextLine3 = "13 123456 ok";
        String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        String[] string = nextLine1.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(string)));
        String[] stringss = nextLine2.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(stringss)));
        String[] stringsss = nextLine3.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(stringsss)));
        InputHandler inputHandler = new InputHandler(inputInfo);
        inputHandler.OP1(1);
        inputHandler.OP7(0);
        inputHandler.OP11(2);
        inputHandler.OP13(3);
    }

    @Test
    public void testOP14() {

    }

    @Test
    public void testOP15() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        InputHandler inputHandler = new InputHandler(inputInfo);

        String adv1 = "1 123456 dqr";
        String[] string0 = adv1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string0)));
        inputHandler.OP1(0);

        String adv2 = "1 111111 lb";
        String[] string1 = adv2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string1)));
        inputHandler.OP1(1);

        String bot1 = "2 123456 111 bot1 50 100 RecoverBottle 0.67";
        String[] string2 = bot1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string2)));
        inputHandler.OP2(2);

        String bot2 = "2 123456 111 bot2 50 100 ReinforcedBottle 0.65";
        String[] string3 = bot2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string3)));
        inputHandler.OP2(3);

        String addbot2 = "10 123456 111";
        String[] string4 = addbot2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string4)));
        inputHandler.OP10(4);

        String equ1 = "4 123456 123 equ1 1 90 RegularEquipment";
        String[] string5 = equ1.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string5)));
        inputHandler.OP4(5);

        String equ2 = "4 123456 222 equ2 2 70 EpicEquipment";
        String[] string6 = equ2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string6)));
        inputHandler.OP4(6);

        String addequ2 = "9 123456 222";
        String[] string7 = addequ2.trim().split(" +");
        inputInfo.add(new ArrayList<>(Arrays.asList(string7)));
        inputHandler.OP9(7);

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


}