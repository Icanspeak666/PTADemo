import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //获得要输入的学生人数
        Scanner scanner = new Scanner(System.in);
        int stuNum = Integer.parseInt(scanner.nextLine());

        ArrayList<Student> stuList = new ArrayList<>();
        //读取学生数据
        for (int i = 0; i < stuNum; i++) {
            String[] s = scanner.nextLine().split(" ");
            Student stu = new Student(Integer.parseInt(s[0]), s[1]);
            stuList.add(stu);
        }

        //进行匹配
        for (int i = 0; i < stuNum / 2; i++) {              //指向开头
            for (int j = stuList.size() - 1; j >= stuNum / 2; j--) {        //指向结尾
                if (stuList.get(i).sex + stuList.get(j).sex == 1) {         //异性相加为1
                    System.out.println(stuList.get(i).name + " " + stuList.get(j).name);
                    stuList.remove(j);                      //将匹配完的移出数组
                    break;
                }
            }
        }

    }

    //学生类
    static class Student{
        private int sex;                    //0代表女生，1代表男生
        private String name;

        public Student(int sex, String name) {
            this.sex = sex;
            this.name = name;
        }
    }
}
