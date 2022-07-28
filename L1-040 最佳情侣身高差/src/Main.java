import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());       //查询次数

        double height;                  //身高

        for (int i = 0; i < n; i++) {
            String[] s = scanner.nextLine().split(" ");
            if ("F".equals(s[0])) {
                height = Double.parseDouble(s[1]) * 1.09;
            } else {
                height = Double.parseDouble(s[1]) / 1.09;
            }
            System.out.println(String.format("%.2f", height));
        }
    }
}
