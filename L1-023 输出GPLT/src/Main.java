import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder s = new StringBuilder(br.readLine());

        br.close();

        int index;                              //下标索引
        int gFlag = 0;                          //用来查看g字母是否输出完毕，当四个字母都输出完毕时，跳出循环
        int pFlag = 0;                          //用来查看g字母是否输出完毕，当四个字母都输出完毕时，跳出循环
        int lFlag = 0;                          //用来查看g字母是否输出完毕，当四个字母都输出完毕时，跳出循环
        int tFlag = 0;                          //用来查看g字母是否输出完毕，当四个字母都输出完毕时，跳出循环

        for (int i = 0; i < s.length(); i++) {
            //若g,G存在，则输出一次G，否则标识flag置1
            if (s.indexOf("g") != -1) {
                index = s.indexOf("g");
                s.replace(index, index + 1, "0");        //将找到的字符替换成其他
                System.out.print("G");
            } else if (s.indexOf("G") != -1) {
                index = s.indexOf("G");
                s.replace(index, index + 1, "0");        //将找到的字符替换成其他
                System.out.print("G");
            } else {
                gFlag = 1;                          //g字符已经输出完毕
            }

            //若p,P存在，则输出一次P，否则标识flag置1
            if (s.indexOf("p") != -1) {
                index = s.indexOf("p");
                s.replace(index, index + 1, "0");        //将找到的字符替换成其他
                System.out.print("P");
            } else if (s.indexOf("P") != -1) {
                index = s.indexOf("P");
                s.replace(index, index + 1, "0");        //将找到的字符替换成其他
                System.out.print("P");
            } else {
                pFlag = 1;                          //p字符已经输出完毕
            }

            //若l,L存在，则输出一次L，否则标识flag置1
            if (s.indexOf("l") != -1) {
                index = s.indexOf("l");
                s.replace(index, index + 1, "0");        //将找到的字符替换成其他
                System.out.print("L");
            } else if (s.indexOf("L") != -1) {
                index = s.indexOf("L");
                s.replace(index, index + 1, "0");        //将找到的字符替换成其他
                System.out.print("L");
            } else {
                lFlag = 1;                          //l字符已经输出完毕
            }

            //若t,T存在，则输出一次T，否则标识flag置1
            if (s.indexOf("t") != -1) {
                index = s.indexOf("t");
                s.replace(index, index + 1, "0");        //将找到的字符替换成其他
                System.out.print("T");
            } else if (s.indexOf("T") != -1) {
                index = s.indexOf("T");
                s.replace(index, index + 1, "0");        //将找到的字符替换成其他
                System.out.print("T");
            } else {
                tFlag = 1;                          //t字符已经输出完毕
            }

            //当四个字母都输出完毕
            if (gFlag + pFlag + lFlag + tFlag == 4) {
                break;
            }
        }
    }
}
