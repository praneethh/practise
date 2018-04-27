package strings;

public class Reverse {

    static void reverse(String str){

        StringBuffer buffer=new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
            buffer.append(str.charAt(i));
        }
        System.out.println(buffer);
    }

    public static void main(String args[]){
        reverse("praneeth");
    }
}
