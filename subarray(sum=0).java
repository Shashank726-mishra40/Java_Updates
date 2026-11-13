import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {10,8,8,9,12,9,6,11,10,6,12,17};
	 ArrayList<Integer> a1 = new ArrayList<>();
	 ArrayList<Integer> a2 = new ArrayList<>();
		int n = arr.length;
		int ans1 = 0;
		for(int i=0;i<n;i++){
		  ans1 ^= arr[i];  
		}
		int t = 0;
		for(int i=0;i<32;i++){
		    if((ans1>>i&1)==1){
		        t = i;
		        break;
		    }
		}
	for(int i=0;i<n;i++){
	    if(((arr[i]>>t)&1)==1) a1.add(arr[i]);
	    else a2.add(arr[i]);
	}
	int s1 = 0;
	for(int i=0;i<a1.size();i++){
	  s1 ^= a1.get(i);  
	}
	
	int s2 = 0;
	for(int i=0;i<a2.size();i++){
	  s2 ^= a2.get(i);  
	}
	
	System.out.println(s1+s2);
		
	}
}
