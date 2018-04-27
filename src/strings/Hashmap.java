package strings;

import java.util.*;

public class Hashmap {

    public static void main(String[] args){

        String str="abbcdad";

        LinkedHashMap<Character,Integer> hs=new LinkedHashMap();

        for(int i=0;i<=str.length()-1;i++){
            if(hs.containsKey(str.charAt(i))){
                Integer c=hs.get(str.charAt(i));
                c++;
                hs.put(str.charAt(i),c);
            }else
                hs.put(str.charAt(i),1);
        }


        for(Map.Entry mp:hs.entrySet()){

            if(mp.getValue().equals(1)){
                System.out.println(mp.getKey());
                break;
            }
        }
    }
}
