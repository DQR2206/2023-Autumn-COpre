import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CommandTest {

    @Test
    public void OP1() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        HashMap<Integer,Adventure> adventures = new HashMap<>();
        String nextLine = "1 123456 dqr"; // 读取本行指令
        String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        InputHandler inputHandler = new InputHandler(inputInfo);
        Command.OP1(0,inputInfo,adventures);
    }

    @Test
    public void OP2() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        HashMap<Integer,Adventure> adventures = new HashMap<>();
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
        Command.OP1(0,inputInfo,adventures);
        Command.OP2(1,inputInfo,adventures);
        Command.OP2(2,inputInfo,adventures);
        Command.OP2(3,inputInfo,adventures);
    }

    @Test
    public void OP3() {
         ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
         HashMap<Integer,Adventure> adventures = new HashMap<>();
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
        Command.OP1(0,inputInfo,adventures);
        Command.OP2(1,inputInfo,adventures);
        Command.OP3(2,inputInfo,adventures);
    }

    @Test
    public void OP4() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        HashMap<Integer,Adventure> adventures = new HashMap<>();
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
        Command.OP1(0,inputInfo,adventures);
        Command.OP4(1,inputInfo,adventures);
        Command.OP4(2,inputInfo,adventures);
        Command.OP4(3,inputInfo,adventures);
    }

    @Test
    public void OP5() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        HashMap<Integer,Adventure> adventures = new HashMap<>();
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
        Command.OP1(1,inputInfo,adventures);
        Command.OP4(0,inputInfo,adventures);
        Command.OP5(2,inputInfo,adventures);
    }

    @Test
    public void OP6() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        HashMap<Integer,Adventure> adventures = new HashMap<>();
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
        Command.OP1(1,inputInfo,adventures);
        Command.OP4(0,inputInfo,adventures);
        Command.OP6(2,inputInfo,adventures);
    }

    @Test
    public void OP7() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        HashMap<Integer,Adventure> adventures = new HashMap<>();
        String nextLine = "7 123456 111 ok 50 100"; // 读取本行指令
        String nextLine1 = "1 123456 dqr";
        String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        String[] string = nextLine1.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(string))); // 将指令分割后的各个部分存进容器中
        InputHandler inputHandler = new InputHandler(inputInfo);
        Command.OP1(1,inputInfo,adventures);
        Command.OP7(0,inputInfo,adventures);
    }

    @Test
    public void OP8() {
         ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
         HashMap<Integer,Adventure> adventures = new HashMap<>();
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
        Command.OP1(1,inputInfo,adventures);
        Command.OP7(0,inputInfo,adventures);
        Command.OP8(2,inputInfo,adventures);
    }

    @Test
    public void OP9() {
         ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
         HashMap<Integer,Adventure> adventures = new HashMap<>();
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
        Command.OP1(1,inputInfo,adventures);
        Command.OP4(0,inputInfo,adventures);
        Command.OP9(2,inputInfo,adventures);
    }

    @Test
    public void OP10() {
         ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
         HashMap<Integer,Adventure> adventures = new HashMap<>();
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
        Command.OP1(1,inputInfo,adventures);
        Command.OP2(0,inputInfo,adventures);
        Command.OP10(2,inputInfo,adventures);
    }

    @Test
    public void OP11() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        HashMap<Integer,Adventure> adventures = new HashMap<>();
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
        Command.OP1(1,inputInfo,adventures);
        Command.OP7(0,inputInfo,adventures);
        Command.OP11(2,inputInfo,adventures);
    }

    @Test
    public void OP12() {
         ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
         HashMap<Integer,Adventure> adventures = new HashMap<>();
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
        Command.OP1(1,inputInfo,adventures);
        Command.OP2(0,inputInfo,adventures);
        Command.OP10(2,inputInfo,adventures);
        Command.OP12(3,inputInfo,adventures);
    }

    @Test
    public void OP13() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        HashMap<Integer,Adventure> adventures = new HashMap<>();
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
        Command.OP1(1,inputInfo,adventures);
        Command.OP7(0,inputInfo,adventures);
        Command.OP11(2,inputInfo,adventures);
        Command.OP13(3,inputInfo,adventures);
    }
}