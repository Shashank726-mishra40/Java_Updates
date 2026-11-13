import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int m = sc.nextInt();
	int[][] que = new int[m][2]; 
	int n = s.length();
	
	int[] ps = new int[n+1];
	if(s.charAt(0)=='a') ps[0] = 1;
	else ps[0] = 0;
	
	for(int i=1;i<n;i++){
	 if(s.charAt(i)=='a') ps[i] = ps[i-1]+1;
	 else ps[i] = ps[i-1];
	} 
	for(int i=0;i<n;i++){
	System.out.print(ps[i]+" ");
	}
	System.out.println();
	for(int i=0;i<m;i++){
	 int l = sc.nextInt();
	 int r = sc.nextInt();
	 
	 System.out.println(ps[r]-ps[l-1]);
	}
	
	}
}
// 1
// 1
// 3
// 2
// 2
// 3
