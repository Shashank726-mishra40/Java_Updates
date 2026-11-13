import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	Check tn = new Check();
	boolean t = tn.twoNum(a,b);
  System.out.println(t);
	
	}
}
class Check{
    public boolean twoNum(int a,int b){
        if(a==b) return true;
        else return false;
    }
}
