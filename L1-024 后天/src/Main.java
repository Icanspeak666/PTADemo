import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nowDay = in.nextInt();
        int twoBeforeDay = nowDay + 2;

        if(twoBeforeDay > 7)
            twoBeforeDay -= 7;

        System.out.println(twoBeforeDay);
    }
}