package praneeth.arrays;

//Adding two arrays

public class ArrayAddition {

    public int[] add(int arr1[], int arr2[]){

        int l1=arr1.length-1;
        int l2=arr2.length-1;
        int max=Math.max(l1,l2);

         int arr4[]=l1>=l2?arr2:arr1;
        System.out.println(arr4.length+" "+arr4[1]);

        int arr3[]=new int[max+1];
        int k=0;

        while(l1>=0 && l2>=0){
            arr3[k]=arr1[l1]+arr2[l2];
            k++;
            l1--;
            l2--;
        }

        while(l1>=0){
            arr3[k]=arr1[l1];
            k++;
            l1--;
        }

        while(l2>=0){
            arr3[k]=arr1[l2];
            k++;
            l2--;
        }

        //this to return the array in reverse order
        int x=arr3.length-1;
        for(int i=0;i<=(arr3.length-1)/2;i++){
            int temp=arr3[x];
            arr3[x]=arr3[i];
            arr3[i]=temp;
            x--;
        }

        return arr3;
    }

    public static void main(String args[]){

        int arr1[] = {9,9,9,9};
        int arr2[] = {1,6};
        ArrayAddition aa = new ArrayAddition();
        int result[] = aa.add(arr1, arr2);
        for(int i=0; i < result.length; i++){
            System.out.print(" " + result[i]);
        }
    }
}
