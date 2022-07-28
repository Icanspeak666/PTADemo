import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();           //甲的酒量上限
        int b = scanner.nextInt();           //乙的酒量上限
        int n = scanner.nextInt();           //游戏进行的轮数

        int aSpeak;                                         //甲喊的数
        int aDraw;                                          //甲划的数
        int bSpeak;                                         //乙喊的数
        int bDraw;                                          //乙划的数

        int x = 0;                          //甲喝酒的次数
        int y = 0;                          //乙喝酒的次数
        boolean flag = true;                //是否继续
        while (n > 0 && flag) {
            aSpeak = scanner.nextInt();
            aDraw = scanner.nextInt();
            bSpeak = scanner.nextInt();
            bDraw = scanner.nextInt();

            int sum = aSpeak + bSpeak;                      //两个人喊的数之和

            if (aDraw == sum && bDraw != sum) {                             //当甲输时
                x++;
            }

            if (bDraw == sum && aDraw != sum) {                             //当乙输时
                y++;
            }

            if (x <= a && y <= b) {
                flag = true;
            } else {
                flag = false;
            }
            n--;                                            //当前回合结束
        }

        if (a - x < 0) {                                        //甲倒了
            System.out.println("A");
            System.out.println(y);
        } else {                                                //乙倒了
            System.out.println("B");
            System.out.println(x);
        }
    }
}
