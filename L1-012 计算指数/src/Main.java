import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        int n = sc.nextInt();

        for(int i=1; i <= n; i++){
            sum *= 2;
        }

        System.out.println("2^" + n + " = " + sum);
    }
}