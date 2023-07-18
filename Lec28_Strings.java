/*
 * 1. reverse a string 
 * 2. Check if a string is palindrome
 * 3. Check if two strings are anagram of each other(Frequency ArrAY )
 * 4. Check if 2 strings are rotations  of each other.
 */


package Arrays.Stirngs;

public class Lec28_Strings {
    public static void main(String[] args) {
        
    
   // 1. reverse a stirng
   String s1 = "Cipher Schools";
   int n = s1.length();
   char arr[] = new char[s1. length()];
   for(int i=0; i<n; i++){
    arr[i] = s1.charAt(n-1-i);
   }
   //arr has reversed string
   String rev = new String(arr);
   System.out.println(rev);


   char strArr[] = s1.toCharArray();
   int l=0;
   int r=n-1;
   while(l<r){
    char temp = strArr[l];
    strArr[l] = strArr[r];
    strArr [r] = temp;
    l++;
    r--;
   }

   String result = new String(strArr);
   System.out.println(result);
}
}