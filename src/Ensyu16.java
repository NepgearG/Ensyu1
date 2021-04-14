/*演習16
 *作成者	    Wu Yufeng
 *作成日時	2021/04/14
 */
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ensyu16 {
    public static void main(String[] args) {
        //Scanner Class　キーボードからの入力を取るため
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a lowercase character");
        String lowerCase = sc.nextLine();
        //小文字であることを確認
        if (getAsc(lowerCase)<96 || getAsc(lowerCase)>121){
            System.out.println("It is not a lowercase char");
            return;
        }
        System.out.println("Please input a uppercase character");
        String upperCase = sc.nextLine();
        //大文字であることを確認
        if (getAsc(upperCase)<65 || getAsc(upperCase)>90){
            System.out.println("It is not a lowercase char");
            return;
        }

        //変換プログラム
        char lc = lowercase(getAsc(lowerCase));
        char uc = uppercase(getAsc(upperCase));

        //結果出力
        System.out.printf("%s\n%s", lc, uc);

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
