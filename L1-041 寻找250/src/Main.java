import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] s = new Scanner(System.in).nextLine().split(" ");          //数组

        for (int i = 0; i < s.length; i++) {
            if ("250".equals(s[i])) {
                System.out.println(i + 1);
                break;
            }
        }

    }
}
