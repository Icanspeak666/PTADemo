import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //得到点赞的朋友名单
        ArrayList<String> nameList = new ArrayList<>();
        do {
            nameList.add(scanner.nextLine());
        } while (!nameList.contains("."));

        //根据情况进行判断
        if (nameList.size() > 14) {         //存在第2个人和第14个人
            System.out.println(nameList.get(1) + " and " + nameList.get(13)
                    + " are inviting you to dinner...");
        } else if (nameList.size() < 3) {       //没有人
            System.out.println("Momo... No one is for you ...");
        } else {                            //只存在第2个人
            System.out.println(nameList.get(1) + " is the only one for you...");
        }
    }
}
