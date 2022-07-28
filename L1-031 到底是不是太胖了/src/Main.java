import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //获得要测量的人数
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //获得每个人的身高和体重
        for (int i = 0; i < n; i++) {
            People people = new People(scanner.nextInt(), scanner.nextInt());
            people.outString();
        }
    }

    //人类
    static class People{
        final int NICE_WEIGHT = 0;          //完美身材
        final int STRONG_WEIGHT = 1;        //胖
        final int THIN_WEIGHT = 2;          //瘦


        private double height;
        private double weight;
        private double niceWeight;

        public People(int height, int weight) {
            this.height = height;
            this.weight = weight;
            this.niceWeight = (this.height - 100) * 0.9 * 2;
        }

        //判断是否为何种身材，0为完美身材，1为太胖了，2为太瘦了
        public int isWhatWeight() {
            int flag;
            if (Math.abs(niceWeight - weight) < niceWeight * 0.1) {             //如果是完美体重
                flag = NICE_WEIGHT;
            } else if (weight > niceWeight) {                               //非完美体重下，体重大于完美体重，则为胖
                flag = STRONG_WEIGHT;
            } else {                                                        //非完美体重下，体重小于完美体重，则为瘦
                flag = THIN_WEIGHT;
            }
            return flag;
        }

        //输出结果
        public void outString() {
            switch (this.isWhatWeight()) {
                case NICE_WEIGHT:
                    System.out.println("You are wan mei!");
                    break;
                case STRONG_WEIGHT:
                    System.out.println("You are tai pang le!");
                    break;
                case THIN_WEIGHT:
                    System.out.println("You are tai shou le!");
                    break;
            }
        }
    }
}
