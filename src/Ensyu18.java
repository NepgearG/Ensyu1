/*演習18
 *作成者	    Wu Yufeng
 *作成日時	2021/04/14
 */

import java.util.Scanner;

public class Ensyu18 {
    public static void main(String[] args) {
        //Scanner Class　キーボードからの入力を取るため
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int number1 = sc.nextInt();
        System.out.println("Please enter the second number:");
        int number2 = sc.nextInt();
        //計算プログラム
        calc(number1, number2);
    }

    public static int calc(int a, int b){
        Scanner sc = new Scanner(System.in);
        System.out.println("加減乗除・剰余のいずれを計算しますか?");
        System.out.println("1:加算2:減算3:乗算4:除算5:剰余算9:終了");
        System.out.println("番号を入力してください");
        int num = sc.nextInt();
        //状況判断(加減乗除剰余のどっちか)
        switch (num){
            case 1:
                int sum = add(a, b);
                System.out.printf("加算結果は　%d\n" , sum);
                break;
            case 2:
                int minus = minus(a,b);
                System.out.printf("減算結果は　%d\n" , minus);
                break;
            case 3:
                int time = time(a, b);
                System.out.printf("乗算結果は　%d\n" , time);
                break;
            case 4:
                int divide = divide(a, b);
                System.out.printf("除算結果は　%d\n" , divide);
                break;
            case 5:
                int mod = mod(a, b);
                System.out.printf("剰余算結果は　%d\n" , mod);
                break;
            case 9:
                System.out.println("終了");
                return 0;
        }
        //9以外はプログラム続行なので再帰
        return calc(a, b);
    }
    public static int add(int a, int b){
        return a + b;
    }

    public static int minus(int a, int b){
        return a - b;
    }

    public static int time(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }

    public static int mod(int a, int b){
        return a % b;
    }
}
