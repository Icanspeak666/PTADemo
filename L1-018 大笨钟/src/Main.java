import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] s = new Scanner(System.in).nextLine().split(":");          //s[0]表示小时，s[1]表示分钟

        int m = Integer.parseInt(s[1]);
        int h = Integer.parseInt(s[0]);

        //如果分钟数不为00，则小时数＋1
        if (m != 0) {
            h++;
        }

        if (0 <= h && h <= 12) {                //非敲钟时间
            System.out.printf("Only %s:%s.  Too early to Dang.\n", s[0], s[1]);
        } else {                                //敲钟时间
            for (int i = 0; i < h - 12; i++) {
                System.out.print("Dang");
            }
        }
    }
}
