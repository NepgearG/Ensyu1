/*演習15
 *作成者	    Wu Yufeng
 *作成日時	2021/04/14
 */
import java.util.*;

public class Ensyu15 {
    public static void main(String[] args) {
        //weightGrams　fee配列用意
        List<Integer> weightGrams = new LinkedList<Integer>() {{
            add(50);
            add(100);
            add(150);
            add(250);
            add(500);
            add(1000);
            add(2000);
            add(4000);
        }};
        int[] fee = {120, 140, 205, 250, 400, 600, 870, 1180};
        //Scanner Class　キーボードからの入力を取るため
        Scanner sc = new Scanner(System.in);
        System.out.println("定形外郵便物の重さを入力してください");
        String str = sc.nextLine();
        //入力検査
        if (str.equals("")) {
            System.out.println("重さ(g:整数)を一つ入力してください");
            return;
        }
        int input = Integer.parseInt(str);
        //獲得したものをlistの中に入る sort
        weightGrams.add(input);
        Collections.sort(weightGrams);
        //何番目を確認
        int cnt = 0;
        for (int i = 0; i < weightGrams.size(); i++) {
            if (weightGrams.get(i) == input) {
                cnt = i;
                break;
            }
        }
        //番号による出力
        switch (cnt)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.printf("定形外郵便物の料金は%d円です\n", fee[cnt]);
                break;
            case 8:
                System.out.println("定形外郵便物は4kg以内です");
                break;
        }
    }
}
