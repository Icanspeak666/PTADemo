import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();                  //获取N的数据

        long num = 0;                                //阶乘的和

        /*
        for (int i = n; i > 0; i--) {
            num = (num + 1) * i;            //求阶乘和
        }
        */

        for (int i = 1; i <= n; i++) {
            num += test(i);
        }

        System.out.println(num);

    }

    public static long test(long t) {
        int n = (int) t;
        for (int i = 1; i < n; i++) {
            t *= i;
        }
        return t;
    }
}
