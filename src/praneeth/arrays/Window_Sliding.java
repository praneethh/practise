package praneeth.arrays;


//-------https://www.geeksforgeeks.org/window-sliding-technique/


public class Window_Sliding {

    int calculate(int arr[], int k) {

        int maxResult = 0;
        int windowResult = 0;
        int startIndex=0;
        int endIndex=k-1;

        for (int i = 0; i <= k - 1; i++) {
            maxResult = maxResult + arr[i];
        }
        for (int i = k; i <= arr.length - 1; i++) {
            windowResult = maxResult + arr[i] - arr[i-k];
            maxResult = Math.max(maxResult, windowResult);

            if(windowResult>=maxResult){
                startIndex=startIndex+1;
                endIndex=endIndex+1;
            }
        }
        System.out.println("StatrIndex: "+startIndex);
        System.out.println("EndIndex: "+endIndex);

        return maxResult;
    }

    public static void main(String[] args){

        int arr[]={1,1,2,1,23,3,4,10,0};

        Window_Sliding ws=new Window_Sliding();

        int result=ws.calculate(arr,4);

        System.out.println(result);
    }
}



