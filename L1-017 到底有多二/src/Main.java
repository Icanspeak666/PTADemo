import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String number = new Scanner(System.in).nextLine();

        double digit = number.length();             //位数
        double count = 0.0;                         //含2的个数
        double multiple = 1;                        //要乘的倍数

        //判断要乘的倍数
        int last = number.charAt((int) digit - 1) - '0';
        if (last % 2 == 0) {  //如果能整除2
            multiple *= 2.0;
        }
        if (number.charAt(0) == '-') {          //如果第一位为负号
            multiple *= 1.5;
            digit--;                            //将负数的那个位数去掉
        }

        //含2的个数
        int i = number.indexOf('2');             //索引
        while (i != -1) {
            count++;
            i = number.indexOf('2', i + 1);         //确定下一个2所在的位置
        }

        number = String.format("%.2f%%", count / digit * multiple * 100);

        System.out.println(number);
    }
}
