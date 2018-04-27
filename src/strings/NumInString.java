package strings;

public class NumInString {

    public static  void main(String[] args){
        String str="1abc2x30yz67";

        String[] nums = str.split("[^0-9]");

        for(int i=0;i<=nums.length-1;i++){
            if(!nums[i].trim().isEmpty())
            System.out.println(Integer.parseInt(nums[i]));
        }
    }
}
