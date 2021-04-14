/*演習8_1
 *作成者	    Wu Yufeng
 *作成日時	2021/04/13
 */
public class Ensyu8_1 {
    public static void main(String[] args) {
        //count指定 行列ことの星上限数 1回目は星1つ 毎回1増やし
        int cnt = 1;
        for (int i=0; i<6; i++){
            for (int j=0; j<cnt; j++){
                System.out.print("*");
            }
            cnt++;
            System.out.println();
        }
    }
}
