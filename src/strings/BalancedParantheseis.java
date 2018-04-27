package strings;

import java.util.Stack;

public class BalancedParantheseis {

    public static void main(String[] args){
        String str="((()))";
        int j=str.length()-1;
        boolean b=true;
        for(int i=0;i<=(str.length()-1)/2;i++){
            if(str.charAt(i)==str.charAt(j)){
                b=false;
                break;
            }
            j--;
        }
        System.out.println(b);

    }
}
