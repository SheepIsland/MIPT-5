package mipt.sbt;

import static java.lang.Math.max;

/**
 * Created by Violetta on 28/11/2018.
 */
public class MaxSum {

    public static void main(String[] args) {
        int[] array = {3,2,1,5,-1,50};
        int max = 0;
        int maxTmp = 0;
        for (int i = 0; i < array.length; i++){
            maxTmp = max(maxTmp + array[i], 0);
            max      = max(maxTmp, max);

        }

        System.out.println(max);
    }
}
