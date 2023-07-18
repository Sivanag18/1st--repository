package Arrays.Stirngs;

import java.util.ArrayList;

public class sum_subarray {
   static int maximumSumSubarray(int k, ArrayList<Integer> Arr, int N){
    /*int max = Integer.MIN_VALUE;
    for(int i = 0; i<=N-k; i++){
        int sum = 0;
        for(int j=0; j<k; j++){
            sum = sum + Arr.get(i + j);
        }
        if(sum > max) max = sum;
    }
    return max;
   }

   */

 //  int max = Integer.MIN_VALUE;
   int sum = 0;
// finding sum of first window 
for(int i=0; i<N; i++){
    sum  = sum + Arr.get(i);
}
int max = sum; 
// Sum of first window found 
for(int i=0; i<N-k; i++){
    sum = sum - Arr.get(i) + Arr.get(i+k);
    if(sum > max) max = sum;
}
return max;

   
}
}
