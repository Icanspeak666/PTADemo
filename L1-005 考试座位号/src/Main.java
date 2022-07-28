import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Student[] stuList = new Student[1000];      //用来存入输入的考生数据

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int n = sc.read() - 48;                                       //将要输入的考生个数

        sc.readLine();                                              //read()完还是在这一行，所以需要给其换到下一行

        //考生数据录入
        for (int i = 0; i < n; i++) {
            String[] arg = sc.readLine().split(" ");

            //一个考生数据
            Student student = new Student();
            student.setRegistrationNo(arg[0]);
            student.setSeatNo(Integer.parseInt(arg[2]));

            //将考生放入数组中，以试机座位号作为下标
            stuList[Integer.parseInt(arg[1])] = student;
        }

        int count = sc.read() - 48;                                    //要查询数据的次数
        if (count == 0) {                                       //输入0时表示不需要进行查询，直接退出
            return;
        }
        sc.readLine();                                          //理同上

        String[] list = sc.readLine().split(" ");         //存入要进行查询的试机座位号
        sc.close();

        for (int i = 0; i < count; i++) {
            int testSeatNo = Integer.parseInt(list[i]);             //进行查询的试机座位号
            //进行查询
            System.out.println(stuList[testSeatNo].outputNo());     //输出该考生的准考证号和考试座位号
        }

    }

    static class Student {
        private String registrationNo;         //准考证号
        private int testSeatNo;                 //试机座位号
        private int seatNo;                     //考试座位号

        public String getRegistrationNo() {
            return registrationNo;
        }

        public void setRegistrationNo(String registrationNo) {
            this.registrationNo = registrationNo;
        }

        public int getTestSeatNo() {
            return testSeatNo;
        }

        public void setTestSeatNo(int testSeatNo) {
            this.testSeatNo = testSeatNo;
        }

        public int getSeatNo() {
            return seatNo;
        }

        public void setSeatNo(int seatNo) {
            this.seatNo = seatNo;
        }

        public String outputNo() {
            return registrationNo + " " + seatNo;
        }

    }
}
