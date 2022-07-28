import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int evenCount = 0;                          //偶数计数
        int oddCount = 0;                           //奇数计数

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println(oddCount + " " + evenCount);
    }
}
