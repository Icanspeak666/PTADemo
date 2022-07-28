import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                   //输入有理数的个数

        int[][] rational = new int[n][2];       //存取分子分母，[][0]表示分子，[][1]表示分母
        long x;                                 //存储相加后的分子
        long y;                                 //存取相加后的分母
        long count = 0;                          //整数部分

        sc.nextLine();                          //nextInt之后，索引停留在数字的后面，没有进行换行

        String[] a = sc.nextLine().split(" ");      //得到每一个分数

        //获得输入的分数
        for (int i = 0; i < n; i++) {
            String[] s = a[i].split("/");
            rational[i][0] = Integer.parseInt(s[0]);
            rational[i][1] = Integer.parseInt(s[1]);
        }

        //进行相加
        x = 0;
        y = rational[0][1];
        for (int i = 0; i < n - 1; i++) {
            //求得相加后的分母
            y = leastCommonMultiple(y, rational[i + 1][1]);
        }

        for (int i = 0; i < n; i++) {
            //求出相加后的分子
            x += rational[i][0] * (y / rational[i][1]);
        }

        if (x == 0) {
            System.out.println(count);
            return;
        }

        //进行化简
        long gcd = Math.abs(getGCD(x, y));      //最大公因数
        x /= gcd;                               //最简的分子
        y /= gcd;                               //最简的分母

        //求取整数部分
        count = x / y;
        x %= y;

        //根据情况进行输出
        if (count == 0) {
            System.out.println(x + "/" + y);
        } else if (x == 0) {
            System.out.println(count);
        } else {
            System.out.println(count + " " + x + "/" + y);
        }
    }

    //求取最大公因数
    private static long getGCD(long x, long y) {
        long t;

        //辗转相除法
        while (x != 0) {
            t = y % x;
            y = x;
            x = t;
        }

        return y;
    }

    //求取最小公倍数
    private static long leastCommonMultiple(long y, int i) {
        //两个数的乘积=这两个数的最大公因数×最小公倍数
        return y * i / getGCD(y, i);
    }
}
