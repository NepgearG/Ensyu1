/*演習3
 *作成者	    Wu Yufeng
 *作成日時	2021/04/13
 */
import java.util.Scanner;

public class Ensyu3 {
    public static void main(String[] args) {
        //Scanner Class　キーボードからの入力を取るため
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the money:");
        int money = sc.nextInt();

        //税率指定 変わらないのでfinal
        final double tax = 0.1;
        double moneyWithTax = money * (1+tax);

        //最終にInt型を出力するため、四捨五入
        int result =Integer.parseInt(new java.text.DecimalFormat("0").format(moneyWithTax));
        //出力 printfはフォーマット指定の出力 %dはint型の変数　\n改行
        System.out.printf("金額は、%d\n" , money);
        System.out.printf("税込み金額は、%d\n" , result);
    }
}
