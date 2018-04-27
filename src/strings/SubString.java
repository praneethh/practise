package strings;

public class SubString {

    public static void main(String[] args){

        String str1="abcdefgh";
        String str2="def";

        if(str1.contains(str2)){
            System.out.println("Yes");
        }else
            System.out.println("No");

        int count=0;

        for(int i=0;i<=str1.length()-1;i++){
            for(int j=0;j<=str2.length()-1;j++){
                if(str1.charAt(i)== str2.charAt(j)){
                    i++;
                    count++;
                }else{
                    break;
                }
            }

        }

        if(count==str2.length()){
            System.out.println("yeah yeah");
        }

        System.out.println(count);
        //to check if one string is a rotation of other
        //ex: Str1=ABCD then Str2=CDAB then str2 is mirror of str1

        String str3="ABC";
        String str4="CAB";

        if((str3+str3).contains(str4)){
            System.out.println("YES 3 & 4 are mirrors");
        }else
            System.out.println("NO");

        //sub string search


    }
}
