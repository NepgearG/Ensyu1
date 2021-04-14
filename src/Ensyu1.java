/*演習1
 *作成者	    Wu Yufeng
 *作成日時	2021/04/13
 */
public class Ensyu1 {
    public static void main(String[] args) {
        //変数
        String name = "氏　名: Wu Yufeng";
        int years = 25;
        String birthPlace = "出身地: China";

        //出力 printfはフォーマット指定の出力 %dはint型の変数
        System.out.println(name);
        System.out.printf("年　齢: %d才\n", years);
        System.out.println(birthPlace);
    }
}

