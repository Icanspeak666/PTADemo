import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] date = in.nextLine().split("-");

        System.out.println(date[2] + "-" + date[0] + '-' + date[1]);
    }
}