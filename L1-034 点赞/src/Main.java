import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        int maxCount = 1;               //最多出现次数
        String maxLabel = "0";          //编号最大的特性编号

        //得到用户点赞的博文数量
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //获取点赞博文的特征编号
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 1; j <= Integer.parseInt(s[0]); j++) {
                int count = 1;                  //次数
                //如果key已经存在
                if (hashMap.containsKey(s[j])) {
                    count = hashMap.get(s[j]) + 1;
                }
                hashMap.put(s[j], count);

                //如果次数大于最大次数，则对特征编号进行记录
                if (count > maxCount) {
                    maxCount = count;
                    maxLabel = s[j];
                } else if (count == maxCount){                //如果次数等于最大次数，则对特征编号进行比对
                    //当最大特征编号小于时，将当前特征编号设置为最大特征编号
                    if (Integer.parseInt(maxLabel) < Integer.parseInt(s[j])) {
                        maxLabel = s[j];
                    }
                }
            }
        }

        br.close();

        //获得出现次数最多、编号最大的特性编号
        System.out.println(maxLabel + " " + maxCount);

    }
}
