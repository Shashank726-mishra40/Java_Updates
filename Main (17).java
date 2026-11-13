import java.util.*;

public class Main
{
	public static void main(String[] args) {
	  
	int[] a = {10,20,30,40,50}; 
	check ch = new check();
// 	int[] arr = ch.yesNo(a);
	boolean result = ch.yesNo(a);
	System.out.println(result);
// 	int index = Arrays.binarySearch(a,50);
// 		System.out.println(index);
// 	 index = Arrays.binarySearch(a,25);
// 	// jis point par voo element hoo sakta hai usko negative main kar doo aur -1 add kar doo
// 	System.out.println(index);
	
	
	}
}
class check{
    public boolean yesNo(int[] a){
          Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int index =  Arrays.binarySearch(a,x);
       if(index>=0) return true;
       return false;
    }
}
