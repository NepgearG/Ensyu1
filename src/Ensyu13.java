/*演習13
 *作成者	    Wu Yufeng
 *作成日時	2021/04/13
 */
import java.util.Arrays;

public class Ensyu13 {
    public static void main(String[] args) {
        //score配列用意
        int[] english={98, 80, 78, 85, 65, 86, 90, 94, 70, 92};

        //三つの関数により結果を出力
        System.out.printf("平均点:%d点\n", avg(english));
        System.out.printf("最高点:%d点\n", max(english));
        System.out.printf("最低点:%d点\n", min(english));
    }

    /*Java8 new Arrays.streamを利用して平均最高最低点の計算
    * 最後のorElse()はnull値確認のため。
    */
    public static int avg(int[] array){
        return (int) Arrays.stream(array).average().orElse(Double.NaN);
    }

    public static int max(int[] array){
        return Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
    }

    public static int min(int[] array){
        return Arrays.stream(array).min().orElse(Integer.MIN_VALUE);
    }
}
