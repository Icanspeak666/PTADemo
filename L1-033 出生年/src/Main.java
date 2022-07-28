import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //获得出生年份y和目标年份中不同数字的个数n
        String[] s = scanner.nextLine().split(" ");
        int y = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);

        int old = 0;                //岁数

        //从出生年份y开始确认有几个不同的数字，直到等于n，记录下次数（岁数）
        while (n != yearNum(y+old)) {
            old++;
        }

        //输出岁数和该年份（岁数加上出生年份）
        DecimalFormat df = new DecimalFormat("0000");          //用来格式化年份的输出
        System.out.println(old + " " + df.format(y + old));

    }

    /*
    * 确认年份有几个不同的数字(方法)
    * 输入：年份y
    * 输出：该年份有多少个不同的数字
    * */
    public static int yearNum(int y){
        int count = 0;                  //记录有多少个不同个数字
        DecimalFormat df = new DecimalFormat("0000");          //用来格式化年份的输出
        String[] num = df.format(y).split("");

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(num));

        count = hashSet.size();

        return count;
    }
}
