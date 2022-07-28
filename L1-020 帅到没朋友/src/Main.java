import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());               //朋友圈数量

        String[][] friends = new String[n][];                       //朋友圈中人数，第一维表示人数，第二维表示人对应的id
        for (int i = 0; i < n; i++) {
            friends[i] = br.readLine().split(" ");
        }

        int count = Integer.parseInt(br.readLine());            //要查询的次数

        String[] selectList = br.readLine().split(" ");     //要查询的数据

        br.close();

        StringBuilder resultStr = new StringBuilder();

        //查询
        for (int i = 0; i < count; i++) {
            boolean flag = true;                    //判断查询结果,true为不在数组中，false则存在在数组中
            String num = selectList[i];
            for (int j = 0; j < n; j++) {                           //查询是否存在在朋友圈中
                for (int k = 0; k < friends[j].length; k++) {
                    if (friends[j][k].equals(num) && !friends[j][0].equals("1")) {      //朋友圈只有一个人也是没朋友
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {                             //不在数组中
                if (resultStr.length() == 0) {
                    resultStr.append(num);
                } else {
                    if (resultStr.indexOf(num) == -1) {     //防止重复
                        resultStr.append(" ").append(num);
                    }
                }
            }
        }

        if (resultStr.length() != 0) {
            System.out.println(resultStr);
        } else {
            System.out.println("No one is handsome");
        }

    }
}
