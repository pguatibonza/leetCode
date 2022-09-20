import java.util.HashMap;

class BullsCows{
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> map = new HashMap<>();
        int bulls=0;
        int cows=0;
        String c="";
        //count secret
        for(int i=0;i<secret.length();i++){
            
            if(map.containsKey(secret.charAt(i))){
                map.put(secret.charAt(i),map.get(secret.charAt(i))+1);
            }
            else{
                map.put(secret.charAt(i),1);
            }
        }
       
        for(int j=0;j<secret.length();j++){
            if(secret.charAt(j)==guess.charAt(j)){
                bulls++;
                map.put(secret.charAt(j),map.get(secret.charAt(j))-1);
            }
            else{
                c+=guess.charAt(j);
            }
        }
        for(int j=0;j<c.length();j++){
            if(map.containsKey((c.charAt(j)) ) && map.get(c.charAt(j))>0) {   
                cows++;
                map.put(c.charAt(j),map.get(c.charAt(j))-1);
        }
        }
        return bulls+"A"+cows+"B";

    }
    public static void main(String[] args) {
        BullsCows bc = new BullsCows();
        System.out.println(bc.getHint("1122", "1222"));
    
    }
}

