package mipt.sbt;

import static java.lang.StrictMath.abs;

/**
 * Created by Violetta on 23/11/2018.
 */

//можно ли получить одинаковые кучи?
public class ZeroStones {

    public static void main(String[] args) {
        int[] stones = {1,1,1,-3,5,1};
        System.out.println(zeroStones(stones));
    }


    public static boolean zeroStones(int[] stones) {
        int count = stones.length;

        int total = 0;
        for (int i = 1; i<count; i++) {
            total += stones[i];
        }

        int heap = stones[0];
        for (int i = 1; i<count; i++){
            if (abs(heap+stones[i]-total+stones[i])<=abs(heap-total)){
                heap+=stones[i];
                total-=stones[i];
            }
            if (heap - total == 0) {
                return true;
            }
        }
        return false;
    }
}
