import java.util.Stack;

public class Lec40 {
   static boolean ispar(String x){
    int len = x.length();
    if(len%2 != 0) return false;
    Stack<Character> stack = new Stack<>();
      
    for(int i=0; i<len; i++){
        char c = x.charAt(i);
        if(c == '{' || c=='[' || c=='('){ // if opening brackets
            stack.push(c);
        }
        else{
            if(stack.isEmpty()) return false; // closing brackets
            if(isPair(stack.peak(), c)){
                stack.pop();
            }
            else{
                return false;
            }
        }
    }
     // reached the end of string
     if(!stack.isEmpty()) return false;
     return true;
   } 
   static boolean isPair(char a, char b){
    if(a == '{' && b=='}') return true;
    if(a == '[' && b==']') return true;
    if(a == '(' && b==')') return true;
    return false;
   }
}
