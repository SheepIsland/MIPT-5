package mipt.sbt;

import static java.lang.StrictMath.abs;

/**
 * Created by Violetta on 28/11/2018.
 */

//две кучи камней с минимальной разницей
public class Stones {

    public static void main(String[] args) {
        int[] stones = {-1,-1,-1,-1,-5,-1};
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
        }
        System.out.println(abs(heap-total));
    }
}
