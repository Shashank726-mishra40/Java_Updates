import java.util.*;
public class Main
{
	public static void main(String[] args) {
      int[] arr = {6,2,2,3,2,5,5,6,1};
     ArrayList<Integer> a = new ArrayList<>();
      Arrays.sort(arr);
      int n = arr.length;
      if(arr[0]!=arr[1]) a.add(arr[0]);
      
      for(int i=1;i<n-1;i++){
          if(arr[i-1]!=arr[i] && arr[i]!=arr[i+1]){
             a.add(arr[i]); 
          }
      }
      if(arr[n-1]!=arr[n-2]) a.add(arr[n-1]);
      System.out.println(a);
    }
}
