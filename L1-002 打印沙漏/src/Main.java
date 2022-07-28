import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] inputString = sc.nextLine().split(" ");

        int num = Integer.parseInt(inputString[0]);
        String fu = inputString[1];

        showShaLou( num , fu );
    }
    public static void showShaLou(int n,String f){
        int count = 1;          //符号个数
        int c = 1;              //前一次循环的符号个数
        int ti = 1;             //上行数
        int i = 1;              //总行数
        int col = 0;          //列数
        while( n > count ){                 //计算总行数和确定所需符号个数
            count = count + (1 + 2*ti)*2;
            ti++;
            i += 2;
            if(count > n){
                count = c;
                i -= 2;
                break;
            }
            c = count;
        }
        col = i;
        for(int j=0; j <= i/2; j++){        //输出上半部分
            for(int x=j; x>0; x--){
                System.out.print(" ");
            }
            for(int y=col-j; y > 0; y--){
                System.out.print(f);
            }
            System.out.println();
            col--;
        }
        col++;
        for(int j=(i+1)/2+1; j <= i; j++){        //输出下半部分
            for(int x=i-j; x>0; x--){
                System.out.print(" ");
            }
            col++;
            for(int y=col+j-i; y > 0; y--){
                System.out.print(f);
            }
            System.out.println();
        }
        n -= count;
        System.out.println(n);
    }
}
