/*演習9
 *作成者	    Wu Yufeng
 *作成日時	2021/04/13
 */
import java.util.Scanner;

public class Ensyu9 {
    public static void main(String[] args) {
        //String配列準備
        String[] array = {"キャベツ","玉ねぎ","白菜","人参","ピーマン","大根","なす"};
        //Scanner Class　キーボードからの入力を取るため
        Scanner sc = new Scanner(System.in);
        System.out.println("引数に野菜名を1つ入力してください");
        String input = sc.nextLine();
        int i = 0;
        //配列の中身チェック 比較
        while (i < array.length){
            if (input.equals(array[i])){
                System.out.printf("%sがありました", input);
                return;
            }else {
                i++;
            }
        }
        System.out.printf("%sはありません", input);
    }
}
