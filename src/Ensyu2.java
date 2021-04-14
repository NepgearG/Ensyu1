/*演習2
 *作成者	    Wu Yufeng
 *作成日時	2021/04/13
 */
import java.util.Scanner;

public class Ensyu2 {
    public static void main(String[] args) {
        //Scanner Class　キーボードからの入力を取るため
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int number1 = sc.nextInt();
        System.out.println("Please enter the second number:");
        int number2 = sc.nextInt();

        //変数の運算
        int sum = number1 + number2;
        int minus = number1 - number2;
        int time = number1 * number2;
        int divide = number1 / number2;
        int mod = number1 % number2;

        //結果の出力
        System.out.printf("加算結果は　%d\n" , sum);
        System.out.printf("減算結果は　%d\n" , minus);
        System.out.printf("乗算結果は　%d\n" , time);
        System.out.printf("除算結果は　%d\n" , divide);
        System.out.printf("剰余算結果は　%d\n" , mod);
    }
}
