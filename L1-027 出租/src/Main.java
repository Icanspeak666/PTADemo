import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //获取手机号
        String phoneNum = new Scanner(System.in).nextLine();

        //得到组成手机号的数字，按递减顺序列出，这样就得到数组arr
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 9; i >= 0; i--) {              //手机号由数字构成，可从9开始在手机号中找
            if (phoneNum.contains(Integer.toString(i))) {           //找到则添加到数组arr中去
                arr.add(i);
            }
        }

        //从手机号的第一位开始向arr进行indexOf查找，得到索引值，依次存放到数组中得到数组index
        int[] index = new int[11];
        for (int i = 0; i < phoneNum.length(); i++) {
            index[i] = arr.indexOf((int) phoneNum.charAt(i) - 48);
        }

        //按格式输出arr
        System.out.print("int[] arr = new int[]{");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i != arr.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println("};");

        //按格式输出index
        System.out.print("int[] index = new int[]{");
        for (int i = 0; i < index.length; i++) {
            System.out.print(index[i]);
            if (i != index.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("};");
    }
}
