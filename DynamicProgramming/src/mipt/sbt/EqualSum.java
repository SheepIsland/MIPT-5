package mipt.sbt;

import java.util.ArrayList;

/**
 * Created by Violetta on 28/11/2018.
 */

//есть ли в массиве сумма чисел равная этому числу
    //числа положительные
public class EqualSum {

    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,7};
        System.out.println(ifSum(array,9));
    }

    public static boolean ifSum(int[] nums, int target) {
        ArrayList<Integer> currentSum = new ArrayList<>();
        int length = 0;

        for (int i=0;i<nums.length;i++){
            if (nums[i] == target){
                return true;
            }
            if (nums[i]<target){
                length = currentSum.size();
                for (int j = 0; j<length;j++){
                    if (currentSum.get(j)+nums[i]==target){
                        return true;
                    }
                    if (currentSum.get(j)+nums[i]<target){
                        currentSum.add(currentSum.get(j)+nums[i]);
                    }
                }
                currentSum.add(nums[i]);
            }
        }
        return false;
    }
}
