package strings;

import static strings.Pallindrome.pallin;

public class Pallindrome {

    static boolean pallin(String str){
        int length=str.length();
        int j=length-1;

        for(int i=0;i<length-1;i++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }

    public static void main(String args[]){
        String str="malayalam";
        System.out.println(pallin(str));
    }
}
