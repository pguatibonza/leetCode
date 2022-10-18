import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<Integer>();
        Stack<Character> chars = new Stack<Character>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c>='0' && c<='9'){
                count=count*10 + c-'0';
            }
            else if(c==']'){
                int repeat=nums.pop();
                String temp="";
                
                while(chars.peek()!='['){
                    temp=chars.pop()+ temp;
                }
                chars.pop();
                for(int j=0;j<repeat;j++){
                    for(int k=0;k<temp.length();k++){
                        chars.push(temp.charAt(k));
                    }
                } 
            }
            else{
                if(count!=0){
                    nums.push(count);
                }
                count=0;
                chars.push(c);   
            }
        }
        String result="";
        while(!chars.isEmpty()){
            result=chars.pop()+result;
        }
        return result;  
    }
    public static void main(String[] args) {
        DecodeString d=new DecodeString();
        System.out.println(d.decodeString("100[leetcode]"));
    }
}
