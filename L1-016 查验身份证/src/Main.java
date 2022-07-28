import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());                //输入身份证号的个数
        ArrayList<IdCard> list = new ArrayList<>();                      //要输出的身份证（不合法）

        for (int i = 0; i < count; i++) {
            IdCard idCard = new IdCard(scanner.nextLine());
            if (!idCard.isLegal()) {
                list.add(idCard);
            }
        }

        if (list.size() == 0) {
            System.out.println("All passed");
        } else {
            for (IdCard idCard : list) {
                System.out.println(idCard.getId());
            }
        }
    }

    //身份证类
    static class IdCard {
        private String id;

        public String getId() {
            return id;
        }

        public IdCard(String id) {
            this.id = id;
        }

        //判断身份证号是否合法     true为合法，false为不合法
        public boolean isLegal() {
            boolean result = true;

            for (int i = 0; i < id.length() - 1; i++) {             //判断前17位是否为数字
                if (!Character.isDigit(id.charAt(i))) {
                    result = false;                                 //如果存在非数字返回false说明身份证号不合法
                }
            }

            result = result && id.charAt(17) == checkCode();

            return result;
        }

        //计算校验码
        public char checkCode() {
            char check;
            int sum;
            sum = Character.getNumericValue(id.charAt(0)) * 7 + Character.getNumericValue(id.charAt(1)) * 9
                    + Character.getNumericValue(id.charAt(2)) * 10 + Character.getNumericValue(id.charAt(3)) * 5
                    + Character.getNumericValue(id.charAt(4)) * 8 + Character.getNumericValue(id.charAt(5)) * 4
                    + Character.getNumericValue(id.charAt(6)) * 2 + Character.getNumericValue(id.charAt(7))
                    + Character.getNumericValue(id.charAt(8)) * 6 + Character.getNumericValue(id.charAt(9)) * 3
                    + Character.getNumericValue(id.charAt(10)) * 7 + Character.getNumericValue(id.charAt(11)) * 9
                    + Character.getNumericValue(id.charAt(12)) * 10 + Character.getNumericValue(id.charAt(13)) * 5
                    + Character.getNumericValue(id.charAt(14)) * 8 + Character.getNumericValue(id.charAt(15)) * 4
                    + Character.getNumericValue(id.charAt(16)) * 2;

            switch (sum % 11) {                         //Z值与校验码M的对应关系
                case 0:
                    check = '1';
                    break;
                case 1:
                    check = '0';
                    break;
                case 2:
                    check = 'X';
                    break;
                case 3:
                    check = '9';
                    break;
                case 4:
                    check = '8';
                    break;
                case 5:
                    check = '7';
                    break;
                case 6:
                    check = '6';
                    break;
                case 7:
                    check = '5';
                    break;
                case 8:
                    check = '4';
                    break;
                case 9:
                    check = '3';
                    break;
                case 10:
                    check = '2';
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + sum % 11);
            }
            return check;
        }
    }
}
