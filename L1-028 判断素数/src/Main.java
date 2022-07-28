import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //获取要判断素数的个数
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //要输出的结果集
        String[] result = new String[n];

        //在循环中进行判断并将结果录入结果集中
        for (int i = 0; i < n; i++) {
            int prime = scanner.nextInt();              //获取要判断的数字

            //判断是否为素数,是则输出Yes,否则输出No
            if (IsPrime(prime)) {
                result[i] = "Yes";
            } else {
                result[i] = "No";
            }
        }

        //输出结果集
        for (String s : result) {
            System.out.println(s);
        }
    }

    //判断是否为素数
    private static boolean IsPrime(int prime) {
        boolean result = true;          //是否为素数，默认为是
        if (prime == 1) {               //1不是素数
            return false;
        }
        for (int i = 2; i <= Math.sqrt(prime); i++) {
            if (prime % i == 0) {           //若能整除根号prime以内的数，则不是素数
                result = false;
                break;
            }
        }
        return result;
    }
}
