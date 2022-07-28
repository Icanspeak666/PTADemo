import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] a = new int[1000];      //接收输入的整形数字

        for (int i = 0; i < s.length(); i++) {
            a[i] = s.codePointAt(i) - 48;
        }

        insertSort(a, s.length());
        for (int i = 0; i < 10; i++) {

            int c = binarySearch(a, i, s.length());
            if(c != 0) {
                System.out.println(i + ":" + c);
            }
        }

    }

    /*
     * 二分查找
     * @prams:
     *   int[] a: 查找范围的数组(有序)
     *   int t: 要查找的数字
     *   int length: 数组a的实际长度
     * @return:
     *   该数字t在数组a中出现的次数
     * */
    public static int binarySearch(int[] a, int t, int length) {
        int count = 0;
        int left = 0;                   //左边界
        int right = length - 1;             //右边界
        int i;                          //中间下标
        //读取数组中间值
        while (left <= right) {
            i = (left + right) / 2;
            if (a[i] > t) {             //如果左边数值大于t
                right = i - 1;
            } else if (a[i] < t) {      //如果右边数值大于t
                left = i + 1;
            } else {                    //如果数值等于t
                count++;
                int middle = i;
                while (i > left) {     //对当前位置的左边继续查找，
                    if (a[i - 1] == t) {    //找到就count++，
                        count++;
                        i--;
                    } else {            //直到不相等或超出左边界
                        break;
                    }
                }
                i = middle;
                while (i < right) {    //对当前位置的右边继续查找，
                    if (a[i + 1] == t) {    //找到就count++，
                        count++;
                        i++;
                    } else {            //直到不相等或超出右边界
                        return count;
                    }
                }
                break;
            }
        }
        return count;
    }

    /*
     * 插入排序
     * @prams:
     *      int[] a: 查找范围的数组(有序)
     *      int length: 数组a的实际长度
     * @return:
     *      void
     * */
    public static void insertSort(int a[], int length) {
        // i表示被移动元素的下标
        for (int i = 1; i < length; i++) {
            int t = a[i];           //要被排序的数据内容
            int j = i - 1;          //表示已排序区域的元素索引
            while (j >= 0) {
                if (t < a[j]) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
                j--;
            }
            a[j + 1] = t;
        }
    }
}
