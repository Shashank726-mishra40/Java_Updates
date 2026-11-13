
public class Main
{
	public static void main(String[] args) {
		A a = new Book();
		IO.println(a.getClass().getName());
		IO.println(a);
		String c2 = a.toString(); // Yaha galti huaa 
		String c1 = a.getClass().getName();
		int n = c2.length();
		String res = "";
		for(int i=0;i<n;i++){
		    if(c2.charAt(i)=='@') break;
		    else res += c2.charAt(i);
		}
		System.out.println(res);
		if(res.equals(c1)) IO.print("Yes");
		else IO.print("No");
		
	}
}

class A{
    
}

class Book extends A{
    
}