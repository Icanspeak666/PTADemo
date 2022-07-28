import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                       //输入的数字
        int count = 0;                              //连续因子个数，至少为1（数字本身）
        int flag = 2;                               //记录最小因子的起始数字
        boolean isPrime;                    //判断是否为素数，默认为否

        //判断是否为素数
        isPrime = isPrime(n);

        if (isPrime) {                              //对于素数的处理
            count = 1;
            flag = n;
        } else {                                    //对于非素数的处理
            for (int i = 2; i <= Math.sqrt(n); i++) {   //比较至小于输入数字的根号即可
                int j = i;
//                int num = j;                            //记录乘数积
                int num = n;                                //记录连除商
                int count_1 = 0;                        //连续因子个数

                while (num % j == 0) {                  //如果能整除，即为因子
                    num /= j;
                    count_1++;
                    j++;
                }

                /*
                do {
                    if (n % num == 0) {                   //如果能整除，即为因子
                        j++;
                        num *= j;
                        count_1++;
                    } else {                            //不能整除则退出循环
                        break;
                    }
                } while (num < n);                      //当乘积大于n时则退出
                */
                if (count_1 > count) {                  //如果这次的连续因子个数结果大于记录的连续因子个数，则修改记录
                    count = count_1;
                    flag = i;
                }
            }
        }

        System.out.println(count);
        System.out.print(flag);
        for (int i = flag + 1; i < flag + count; i++) {         //第一次是手动输出，所以起始要加1
            System.out.print("*" + i);
        }
    }

    private static boolean isPrime(int n) {
        boolean flag = true;                        //默认是素数

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {                       //如果存在一个能整除的数，则为非素数
                flag = false;
                break;
            }
        }
        return flag;
    }
}
