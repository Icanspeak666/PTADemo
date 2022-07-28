import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] s = scanner.nextLine().split(" ");

        String a;                   //题目所给的数字a
        String b;                   //题目所给的数字b
        String result = "";          //结果

        //处理a数据
        if (s[0].matches("[1-9][0-9]{0,2}|1000")) {             //若范围在1-1000，则存入a中，否则为？
            a = s[0];
        } else {
            a = "?";
            result = "?";
        }

        //处理b数据
        //如果输入的数据有多个空格，则b一定为？
        if (s[1].matches("[1-9][0-9]{0,2}|1000") && s.length == 2) {       //若范围在1-1000，则存入a中，否则为？
            b = s[1];
            if (!a.equals("?")) {                                       //若a，b都符合规范，则结果为两数之和
                result = String.format("%d", Integer.parseInt(a) + Integer.parseInt(b));
            }
        } else {
            b = "?";
            result = "?";
        }

        System.out.println(a + " + " + b + " = " + result);

    }
}
