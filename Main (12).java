import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    

int[] arr = {1,2,3,7,5,6};
int[] dup = Arrays.copyOf(arr, arr.length);
for(int i:dup){
System.out.print(i+" ");
}
// 	  int sumE = 0;
// int sumO = 0;
//     for (int ele : arr) {
//      if(ele%2==0)  sumE += ele; 
//      else  sumO += ele; 
//     }
// 	System.out.println("Even " +sumE);
// 	System.out.println("Odd " +sumO);
	}
}
