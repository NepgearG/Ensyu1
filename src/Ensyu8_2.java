/*演習8_2
 *作成者	    Wu Yufeng
 *作成日時	2021/04/13
 */
public class Ensyu8_2 {
    public static void main(String[] args) {
        //count指定 行列ことの星上限数 1回目は星6つ 毎回1減る
        int cnt = 6;
        for (int i=0; i<6; i++){
            for (int j=0; j<cnt; j++){
                System.out.print("*");
            }
            cnt--;
            System.out.println();
        }
    }
}
