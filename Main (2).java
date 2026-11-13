import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    //int b = sc.nextInt();
	    Check ch = new Check();
	    //int t = ch.greater(a,b);
	    ch.checkSign(a);
	    //System.out.println(t);
	    
	}
}
class Check{
    public int greater(int a,int b){
        if(a>=b) return a;
        else return b;
    }
    void checkSign(int a){
       System.out.println(a>=0 ? "+":"-"); 
    }
}
