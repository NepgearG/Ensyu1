import java.util.Scanner;

/*演習19
 *作成者	    Wu Yufeng
 *作成日時	2021/04/14
 */
public class Ensyu19 {
    public static void main(String[] args) {
        //計算プログラム
        calc();
    }

    public static int calc(){
        //Scanner Class　キーボードからの入力を取るため
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int number1 = sc.nextInt();
        System.out.println("Please enter the second number:");
        int number2 = sc.nextInt();

        //加減乗除剰余の計算
        int sum = add(number1, number2);
        int minus = minus(number1,number2);
        int time = time(number1, number2);
        int divide = divide(number1, number2);
        int mod = mod(number1, number2);

        //結果の出力
        System.out.printf("加算結果は　%d\n" , sum);
        System.out.printf("減算結果は　%d\n" , minus);
        System.out.printf("乗算結果は　%d\n" , time);
        System.out.printf("除算結果は　%d\n" , divide);
        System.out.printf("剰余算結果は　%d\n" , mod);

        //状況判断(続くかどうか)
        if (judge()){
            return calc();
        }
        return 0;
    }

    //続くかどうかを判断する関数
    public static boolean judge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("続行しますか?(Y/N)");
        String str = sc.nextLine();
        char a = str.charAt(0);
        //指定char以外は再入力
        if (a!='y' && a!='Y' && a!='n' && a!='N'){
            return judge();
        }
        //y&n判断
        else return a != 'n' && a != 'N';
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
