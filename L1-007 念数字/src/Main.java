import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            speakNum(s.charAt(i));
        }

    }

    public static void speakNum(char n) {
        switch (n) {
            case '-':
                System.out.print("fu");
                break;
            case '0':
                System.out.print("ling");
                break;
            case '1':
                System.out.print("yi");
                break;
            case '2':
                System.out.print("er");
                break;
            case '3':
                System.out.print("san");
                break;
            case '4':
                System.out.print("si");
                break;
            case '5':
                System.out.print("wu");
                break;
            case '6':
                System.out.print("liu");
                break;
            case '7':
                System.out.print("qi");
                break;
            case '8':
                System.out.print("ba");
                break;
            case '9':
                System.out.print("jiu");
                break;
        }
    }
}
