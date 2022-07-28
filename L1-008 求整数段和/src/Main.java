import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();                   //左边界
        int b = sc.nextInt();                   //右边界
        int sum = 0;                            //总和

        for (int i = a; i <= b; i++) {          //从左到右进行遍历
            System.out.printf("%5d", i);
            if ((i - a + 1) % 5 == 0 && b - a != 4) {       //一行的时候不需要换行
                System.out.println();
            }
            sum += i;
        }
        System.out.println();
        System.out.println("Sum = " + sum);
    }
}
