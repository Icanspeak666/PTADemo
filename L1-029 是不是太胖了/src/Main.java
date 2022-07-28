import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();               //身高
        double weight;                           //体重

        weight = (height - 100) * 0.9 *2;

        System.out.println(weight);

    }
}