import java.util.*;
public class floydTriangle{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       int a = 0;
      for(int i=1;i<=n;i++){
        
        for(int j=1;j<=i;j++){
            System.out.print(a+j);
        }
        System.out.print("\n");
        a = a+i-1;
      }  
    }
}