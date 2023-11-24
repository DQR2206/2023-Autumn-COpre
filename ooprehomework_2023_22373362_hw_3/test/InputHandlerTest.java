import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class InputHandlerTest  {

    @Test
    public void testSolve() {

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
        String nextLine1 = "1 123456 dqr";
        String nextLine = "2 123456 111 dqr 60"; // 读取本行指令
        String[] string = nextLine1.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(string)));
        String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        InputHandler inputHandler = new InputHandler(inputInfo);
        inputHandler.OP1(0);
        inputHandler.OP2(1);
    }

    @Test
    public void testOP3() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine1 = "1 123456 dqr"; // 读取本行指令
        String nextLine2 = "2 123456 111 dqr 60"; // 读取本行指令
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
        String nextLine = "2 123456 111 dqr 4"; // 读取本行指令
        String nextLine1 = "1 123456 dqr";
        String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
        String[] string = nextLine1.trim().split(" +"); // 按空格对行进行分割
        inputInfo.add(new ArrayList<>(Arrays.asList(string))); // 将指令分割后的各个部分存进容器中
        InputHandler inputHandler = new InputHandler(inputInfo);
        inputHandler.OP1(1);
        inputHandler.OP4(0);
    }

    @Test
    public void testOP5() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        String nextLine = "4 123456 111 dqr 4"; // 读取本行指令
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
        String nextLine = "4 123456 111 dqr 4"; // 读取本行指令
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
        String nextLine = "7 123456 111 ok 50"; // 读取本行指令
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
        String nextLine = "7 123456 111 ok 50"; // 读取本行指令
        String nextLine1 = "1 123456 dqr";
        String nextLine2 = "1 123456 111";
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
        String nextLine = "2 123456 111 dqr 4"; // 读取本行指令
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
        String nextLine = "2 123456 111 ok 60"; // 读取本行指令
        String nextLine1 = "1 123456  dqr ";
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
        String nextLine = "7 123456 111 ok 50"; // 读取本行指令
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
    }
@Test
    public void testOP13() {
    }
}