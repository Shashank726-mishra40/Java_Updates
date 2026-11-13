import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    ArrayList<Integer> arr = new ArrayList<>();
	    int[] a = {3, 6, 1, 7, 9, 8, 2, 2};
	    int[] b = {9, 7, 3, 4, 9};
	  int n = a.length;
	  int m = b.length;
	  Arrays.sort(a);
	  Arrays.sort(b);
int i = 0;
int j = 0;
while(i<n && j<m){
      if(a[i]>b[j]) j++;
    else if(b[j]>a[i]) i++;
    else if(a[i]==b[j]){
       arr.add(a[i]);
       i++;
       j++;
    }
   
}
	
	System.out.println(arr);
	}
}
