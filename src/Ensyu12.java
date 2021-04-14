/*演習12
 *作成者	    Wu Yufeng
 *作成日時	2021/04/13
 */
import java.util.Scanner;

public class Ensyu12 {
    public static void main(String[] args) {
        //変数配列用意
        String[] array = {"キャベツ","玉ねぎ","白菜","人参","ピーマン","大根","なす"};
        //Scanner Class　キーボードからの入力を取るため
        Scanner sc = new Scanner(System.in);
        System.out.println("引数に野菜名を1つ入力してください");
        String input = sc.nextLine();
        //judge関数により入るかどうかを確認
        if (judge(array, input)){
            System.out.printf("%sがありました", input);
        }else {
            System.out.printf("%sはありません", input);
        }

    }

    //判断する関数
    public static boolean judge(String[] array, String str){
        for (String s : array) {
            if (s.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
