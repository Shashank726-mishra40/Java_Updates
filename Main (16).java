import java.util.*;
public class Main
{
	public static void main(String[] args) {
      int[] arr = {6,2,2,3,2,5,5,6,1};
     int n = arr.length;
     for(int i=0;i<n-1;i++){ // n-1
        int swap = 0;
        for(int j=0;j<n-1-i;j++){
            if(arr[i+1]<arr[i]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swap++;
            }
        }
        if(swap==0) break;
     }
     for(int ele:arr){
         System.out.print(ele+" ");
     }
    }
}
