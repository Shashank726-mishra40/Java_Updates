import java.util.Scanner;
public class primenumber {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    scn.nextLine(); 
    while(t>0){
        int count = 0;
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
        count++;
            }
        }
        if(count==2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        t--;
    }
    
}
}
