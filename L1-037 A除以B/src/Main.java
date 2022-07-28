import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();              //数字A
        int b = scanner.nextInt();              //数字B

        if (b > 0) {
            System.out.printf("%d/%d=%.2f", a, b, (float) a / b);
        } else if (b < 0) {
            System.out.printf("%d/(%d)=%.2f", a, b, (float) a / b);
        } else {
            System.out.printf("%d/%d=Error", a, b);
        }
    }
}
