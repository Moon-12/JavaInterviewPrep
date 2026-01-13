import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String str="abcdABCDabcd";
        HashMap<Character,Integer> charCountHashMap=new HashMap<>();
        for(char c:str.toCharArray()){
            if(charCountHashMap.containsKey(c)){
                charCountHashMap.put(c, charCountHashMap.get(c)+1);
            }
            else {
                charCountHashMap.put(c, 1);
            }
        }
        System.out.println(charCountHashMap);
    }
}