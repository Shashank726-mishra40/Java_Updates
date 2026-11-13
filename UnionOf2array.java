import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int[] a = {1, 2, 3, 4,4,5};
	    int[] b = {1, 2, 3, 6, 7};
	    ArrayList<Integer> arr = new ArrayList<>();
	  int n = a.length;
	  int m = b.length;
int i = 0;
int j = 0;
while(i<n && j<m){
      if(a[i]>b[j]){
         arr.add(b[j]);
         j++;
      } 
    else if(b[j]>a[i]){
       arr.add(a[i]); 
        i++; 
    }
    else if(a[i]==b[j]){
       arr.add(a[i]);
       i++;
       j++;
    }
}
while(i<n){
    arr.add(a[i]);
    i++;
}
while(j<m){
     arr.add(b[j]);
     j++;
}
System.out.println(arr);

	}
}
