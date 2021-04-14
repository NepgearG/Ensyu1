/*演習17
 *作成者	    Wu Yufeng
 *作成日時	2021/04/14
 */
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Ensyu17 {
    public static void main(String[] args) {
        //Scanner Class　キーボードからの入力を取るため
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a lowercase character");
        String lowerCase = sc.nextLine();
        //いろいろ判断
        if (!judgeLc(lowerCase)){
            return;
        }

        System.out.println("Please input a uppercase character");
        String upperCase = sc.nextLine();
        //いろいろ判断
        if (!judgeUc(upperCase)){
            return;
        }

        //変換
        char lc = lowercase(getAsc(lowerCase));
        char uc = uppercase(getAsc(upperCase));

        //出力%sはString型指定 \n改行
        System.out.printf("%s\n%s", lc, uc);

    }

    public static boolean judgeLc (String str){
        //引数の個数確認
        if (str.length()>1){
            System.out.println("英字を半角で1文字入れてください");
            return false;
        }
        //正規表現判断
        if (str.matches("[^\\x00-\\xff]")){
            System.out.println("半角の英字ではありません");
            return false;
        }
        //小文字であることを確認
        if (getAsc(str)<96 || getAsc(str)>121){
            System.out.println("It is not a lowercase char");
            return false;
        }
        return true;
    }

    public static boolean judgeUc (String str){
        //引数の個数確認
        if (str.length()>1){
            System.out.println("英字を半角で1文字入れてください");
            return false;
        }
        //正規表現判断
        if (str.matches("[^\\x00-\\xff]")){
            System.out.println("半角の英字ではありません");
            return false;
        }
        //大文字であることを確認
        if (getAsc(str)<65 || getAsc(str)>90){
            System.out.println("It is not a uppercase char");
            return false;
        }
        return true;
    }

    //マイナス32で大文字になる
    public static char lowercase(int ascNum){
        ascNum -= 32;
        return (char) ascNum;
    }

    //プラス32で小文字になる
    public static char uppercase(int ascNum){
        ascNum += 32;
        return (char) ascNum;
    }

    //asciiコードを獲得
    public static int getAsc (String str) {
        byte[] asc = str.getBytes(StandardCharsets.UTF_8);
        return asc[0];
    }
}
