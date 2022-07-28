import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");             //获取输入的三个数
        long[] n = new long[3];

        //获取数据
        for (int i = 0; i < s.length; i++) {
            n[i] = Long.parseLong(s[i]);
        }

        Arrays.sort(n);

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
            if (i != n.length - 1) {
                System.out.print("->");
            }
        }
    }
}
