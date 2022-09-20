import java.util.HashMap;

public class IsomorphicString {
    
    
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character,Character> mapa= new HashMap<Character,Character>();
            
            
            char s1;
            char t1;
            for(int i =0;i<s.length();i++)
            {
                s1=s.charAt(i);
                t1=t.charAt(i);
                
                 if (!mapa.containsKey(s1)){
                    if(mapa.containsValue(t1)){
                        return false;
                    }
                    mapa.put(s1,t1);
                 }
                else{  
                    
                    if (mapa.get(s1)!=t1){
                    return false; 
                   }   
                }
            }
           return true;
        }
    

    public static void main(String[] args) {
        IsomorphicString s=new IsomorphicString();
        System.out.println(s.isIsomorphic("egg", "foo"));
    }
}
