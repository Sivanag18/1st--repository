
// Recursion on fibnicco series.
/*
public class Lec25 {
    static int fib(int n){
        if(n<2) return n;
        if(n==0) return 0;
        if(n==1) return 1;
        int a = fib(n-1);
        int b = fib(n-2);
        return a + b;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}
*/

// Binary search without recursion
 public class Lec25{
    int arr[] = {2,5,8,12,16,23,38,56,72}; // pre-requisite -> sorted array
    int x = 23;

    // Binary search below
    int l = 0;
    int r = arr.length - 1;
    while(l<=r){
        //int mid = (r-l)/2 + l;
        int mid = (l+r)/2;
        if(arr[mid] == x){
            System.out.println("value found at index : " + mid);
            return;
        }else if(x<arr[mid]){
            r = mid - 1;
        }else {
        l = mid +1;
       }
    }
    System.out.println("Value not found.");

}