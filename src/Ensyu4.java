/*演習4
 *作成者	    Wu Yufeng
 *作成日時	2021/04/13
 */
import java.util.Scanner;

public class Ensyu4 {
    public static void main(String[] args) {
        //Scanner Class　キーボードからの入力を取るため
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of array:");
        int size = sc.nextInt();
        //配列の大きさはゼロではないを判断する
        if (size==0){
            System.out.println("The array size cannot be zero");
            return;
        }
        //配列順次入力、出力
        int []array = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Please enter the number:");
            array[i] = sc.nextInt();
        }

        for (int i=0;i<size;i++){
            //出力 printfはフォーマット指定の出力 %dはint型の変数　\n改行
            System.out.printf("array[%d]:%d\n", i, array[i]);
        }
        System.out.printf("要素数:%d", size);
    }
}
