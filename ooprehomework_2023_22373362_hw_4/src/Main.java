//只负责顶层调用
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Myscanner myscanner = new Myscanner(scanner);
        myscanner.scan();
    }
}
