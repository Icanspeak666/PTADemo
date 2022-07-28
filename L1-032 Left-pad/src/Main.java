import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //得到要填充结果字符串的长度和用于填充的字符
        String[] s = scanner.nextLine().split(" ");
        int length = Integer.parseInt(s[0]);
        String addStu = s[1];

        //得到原始的非空字符串
        StringBuilder stu = new StringBuilder(scanner.nextLine());

        //将原始字符串的长度与要填充字符串的长度进行比较
        if (stu.length() >= length) {               //如果不需要填充，则从后往前输出要填充字符串的长度
            String result = stu.substring(stu.length() - length);
            System.out.println(result);
        } else {                                    //需要填充，则在字符串头部插入字符，直到一样长
            while (length > stu.length()) {
                stu.insert(0, addStu);
            }
            System.out.println(stu);
        }

    }
}
