package strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LCSwithPerm {

    public static void main(String[] args){

        String str1="praneeth";

        String str2="prasanth";

        LinkedHashSet hs=new LinkedHashSet();
        int a[]=new int[26];

        for(int i=0;i<=str1.length()-1;i++){
            a[str1.charAt(i)-'a']++;
        }

        for(int i=0;i<=str2.length()-1;i++){
            if(a[str2.charAt(i)-'a']>0){
                hs.add(str2.charAt(i));

            }
        }
        System.out.println(hs);
    }
}
