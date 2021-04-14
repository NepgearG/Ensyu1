/*演習14
 *作成者	    Wu Yufeng
 *作成日時	2021/04/13
 */
import java.util.Scanner;

public class Ensyu14 {
    public static void main(String[] args) {
        //Scanner Class　キーボードからの入力を取るため
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int number1 = sc.nextInt();
        System.out.println("Please enter the second number:");
        int number2 = sc.nextInt();

        //参照型を利用して結果保存
        int[] result = new int[5];
        calc(result, number1, number2);

        System.out.printf("加算結果は　%d\n" , result[0]);
        System.out.printf("減算結果は　%d\n" , result[1]);
        System.out.printf("乗算結果は　%d\n" , result[2]);
        System.out.printf("除算結果は　%d\n" , result[3]);
        System.out.printf("剰余算結果は　%d\n" , result[4]);
    }

    //計算プログラム 結果を配列の中に保存
    public static void calc(int[] array, int a, int b){
        array[0] = a + b;
        array[1] = a - b;
        array[2] = a * b;
        array[3] = a / b;
        array[4] = a % b;
    }
}
