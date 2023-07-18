package Arrays.Stirngs;

public class Lec29 {
    static boolean checkPalindrome(String s){
        s = s.toLowerCase();
     int l = 0;
     int r = s.length()-1;
     while(l<r){
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        l++;
        r--;
     }

     return true;
    }
    public static void main(String[] args) {
        String s = "RAR";
        String s2 = "Cipher";
        String s3 = "MAdam";
        System.out.println(checkPalindrome(s));
                System.out.println(checkPalindrome(s2));        

                        System.out.println(checkPalindrome(s3));        


                

    }
}
