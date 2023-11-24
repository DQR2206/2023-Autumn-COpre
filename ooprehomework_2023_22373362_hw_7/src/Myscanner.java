//进行输入解析
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Myscanner {
    private Scanner scanner;

    public Myscanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void scan() {
        ArrayList<ArrayList<String>> inputInfo = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine().trim()); // 读取行数
        InputHandler inputHandler = new InputHandler(inputInfo);
        int row = 0;//当前的实际行数
        for (int i = 0; i < n; ++i,++row) {
            int k = 0;
            String nextLine = scanner.nextLine(); // 读取本行指令
            String[] strings = nextLine.trim().split(" +"); // 按空格对行进行分割
            inputInfo.add(new ArrayList<>(Arrays.asList(strings))); // 将指令分割后的各个部分存进容器中
            int op = Integer.parseInt(inputInfo.get(row).get(0));
            if (op == 14) {
                System.out.println("Enter Fight Mode");
                k = Integer.parseInt(inputInfo.get(row).get(2));
                for (int j = 0; j < k; j++) {
                    nextLine = scanner.nextLine();
                    strings = fightlogsHandler(nextLine);
                    inputInfo.add(new ArrayList<>(Arrays.asList(strings)));
                }
            }
            inputHandler.solve(op,row);
            row = row + k;
        }
    }

    public String[] fightlogsHandler(String fightlog)
    {
        String[] strings = new String[5];
        Pattern p = Pattern.compile("(\\d{4}/\\d{2})-([^@#-]+)-([^@#-]+)");
        Matcher matcher = p.matcher(fightlog);
        Pattern p1 = Pattern.compile("(\\d{4}/\\d{2})-([^@#-]+)@([^@#-]+)-([^@#-]+)");
        Matcher matcher1 = p1.matcher(fightlog);
        Pattern p2 = Pattern.compile("(\\d{4}/\\d{2})-([^@#-]+)@#-([^@#-]+)");
        Matcher matcher2 =  p2.matcher(fightlog);
        if (matcher.find()) {
            strings[0] = "1";
            for (int i = 1; i <= 3; i++) {
                strings[i] = matcher.group(i);
            }
        } else if (matcher1.find()) {
            strings[0] = "2";
            for (int i = 1; i <= 4; i++) {
                strings[i] = matcher1.group(i);
            }
        } else if (matcher2.find()) {
            strings[0] = "3";
            for (int i = 1; i <= 3; i++) {
                strings[i] = matcher2.group(i);
            }
        }
        return strings;
    }
}
