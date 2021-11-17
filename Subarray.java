import java.io.*;
import java.util.*;

public class Solution {
    private static int negativeSubarrays(int [] array) {
                int count = 0;
                int sum   = 0;
                for (int i = 0; i < array.length; i++) {
                    for (int j = i; j < array.length; j++) {
                        sum += array[j];
                        if (sum < 0) {
                            count++;
                        }
                    }
                    sum = 0;
                }
                return count;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System .in);
        int sizeOfArr = input.nextInt();
        int[] arr = new int[sizeOfArr];
        for(int i=0; i<sizeOfArr; i++){
            int index = input.nextInt();
            arr[i]=index;
        }
       
        System.out.println(negativeSubarrays(arr));
        
    }
}
