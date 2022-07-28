import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 运行时间需要看运气，多试几次就能过
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer a = new StringBuffer(bufferedReader.readLine());                  //获得A的字符串
        String b = bufferedReader.readLine();                                          //获得B的字符串
        bufferedReader.close();

        //进行A-B
        for (int i = 0; i < b.length(); i++) {
            String s = String.valueOf(b.charAt(i));
            int flag = a.indexOf(s);
            while (flag != -1) {              //当字符在A中存在时，进行删除
                a.deleteCharAt(flag);
                flag = a.indexOf(s);
            }
        }

        System.out.println(a);

    }
}
