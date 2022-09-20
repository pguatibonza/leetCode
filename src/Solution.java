import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        boolean condicion=true;

        for(int i=0;i<p.length();i++){
            if(map.containsKey(p.charAt(i))){
                map.put(p.charAt(i), map.get(p.charAt(i))+1);
            }
            else{
                map.put(p.charAt(i),1);
            }
        }
       
        for(int i=0;i<s.length();i++){
            map2=(HashMap<Character, Integer>) map.clone();
            condicion=true;
            if(i+p.length()<=s.length()){
                for(int j=i;j<i+ p.length();j++){
                    if(map2.containsKey(s.charAt(j))){
                        map2.put(s.charAt(j),map2.get(s.charAt(j))-1);
                    }
                    else{
                        condicion=false;
                        break;
                    }
                }
            }
           
            else{
                condicion=false;
            }
            if(condicion){
                for(Entry<Character,Integer> entry:map2.entrySet()){
                    if(entry.getValue()!=0){
                        condicion=false;
                        break;
                    }
                }
            }
            if(condicion){
                list.add(i);
            }
            
        }

        return list ;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.findAnagrams("cbaebabacd","abc")); 

    }
}
