package praneeth.arrays;

//----https://www.geeksforgeeks.org/find-longest-sub-array-exactly-k-odd-numbers/

public class LSubArrKoddN {

    static void compute(int arr[],int k){

        int start=0;
        int max=0;
        int count=0;

       for(int i=0;i<arr.length;i++){

           if(arr[i]%2!=0) {
               count++;
           }

           while(count>k && start <=i){
               if (arr[start++] % 2 != 0) {
                   count--;
               }
           }

           if(count==k){
               if(max<(i-start+1)){
                   max=i-start+1;
               }
           }

       }

        System.out.println(start +" "+(start+max-1));
        System.out.println(max);
    }

    public static void main(String[] args){

        int arr[]={3,4,6,8,9,8};
        compute(arr,1);
    }
}
