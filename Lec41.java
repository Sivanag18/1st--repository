public class Lec41 {
    // postfix.
    public static int evaluatePostFix(String s){
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<=s.length(); i++){
            char c = s.charAt(i);
            //operand
            if(Character.isDigit(c)){
              stack.push(c - '0');
            }
            else{ // operator
                {
                    int right = stack.pop();
                    int left = stack.pop();
                    int res = calculate(left, right, c);
                    stack.push(res);
                }

            }
            return stack.pop();

        }
       static int calculate(int left, int right, char c){
            if(c == '*') return left * right;
            else if(c == '/') return left/right;
            else if(c == '+') return left + right;
            else if(c == '-') return left - right;
            return -1;
        }
    }

    
}
