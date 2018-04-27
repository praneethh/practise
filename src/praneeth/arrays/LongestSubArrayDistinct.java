package praneeth.arrays;

import java.util.HashSet;

public class LongestSubArrayDistinct {

    public static void main(String[] args){

        int arr[]={2,3,4,3,6,9};
        int i = 0, j = 1, max = 0, currLength = 1;
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(arr[0]);

        while (i < arr.length - 1 && j < arr.length) {
            if (!set.contains(arr[j])) {
                currLength++;
                set.add(arr[j++]);
            }
            else {
                max = Math.max(max, currLength);
                set.remove(arr[i++]);
                currLength--;
            }
        }

        System.out.println(Math.max(currLength,max));
    }
}
