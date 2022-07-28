import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] str = new Scanner(System.in).nextLine().split(" ");

        int col = Integer.parseInt(str[0]);                     //列数
        String c = str[1];                                      //输出的字符

        for (int i = 0; i < Math.ceil(col / 2.0); i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
