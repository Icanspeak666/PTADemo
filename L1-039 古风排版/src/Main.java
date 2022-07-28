import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());                           //每一列的字符数（行数）
        StringBuilder s = new StringBuilder(scanner.nextLine());                //要排版的字符串

        while (s.length() % n != 0) {
            s.append(" ");
        }

        //获得每一行所要输出的字符，例如第一行索引满足整除4，s长度大于n时
        for (int i = 0; i < n; i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (j % n == i) {
                    System.out.print(s.charAt(j));
                }
            }

            //输出完一行进行换行
            System.out.println();
        }
    }
}
