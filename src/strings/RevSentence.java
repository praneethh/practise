package strings;

public class RevSentence {

    static void reverse(String str){

        String s[]=str.split(" ");
        StringBuffer buffer=new StringBuffer();

        for(int i=s.length-1;i>=0;i--){
            buffer.append(s[i]);
            buffer.append(' ');
        }

        System.out.println(buffer.toString().trim());

    }

    public static void main(String[] args){

        String str="I am in walmart";
        reverse(str);
    }
}
