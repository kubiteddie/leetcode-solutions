class Solution {
    public boolean isValid(String s) {
        Stack last = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                last.push(s.charAt(i));
            }
            else if(last.empty()){
                return false;
            }
            else if(s.charAt(i) == ')'){
                if(last.peek().equals('(')){
                    last.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i) == ']'){
                if(last.peek().equals('[')){
                    last.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i) == '}'){
                if(last.peek().equals('{')){
                    last.pop();
                }
                else{
                    return false;
                }
            }
        }
        return last.empty();
    }
}