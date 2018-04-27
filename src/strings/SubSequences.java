package strings;

public class SubSequences {

    public static void combinations(String prefix,String suffix){

        if(suffix.length()<0)
            return;
        System.out.println(prefix);

        for(int i=0;i<suffix.length();i++)
            combinations(prefix+suffix.charAt(i),suffix.substring(i+1,suffix.length()));
    }
    public static void main(String[] args){
        String str="pra";
        combinations("",str);
    }
}
