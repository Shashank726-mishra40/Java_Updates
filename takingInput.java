import java.util.Scanner;
public class takingInput {
    public static void main(String[] args) {
        
    
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Your Name:");
  String name = sc.nextLine();
  if(name.equals("Shashank")){ // yaha ham name == "Shashank" nahi le sakte hain kyuki '==' (compares memory addresses) aur agar hame actual text compare karana hai too "Shashank".equals(name) 
  // yaa 
  // name.equal("Shashank") ye dono main se kucch bhi e sakate hain
    System.out.println("YES");
  }
  else{
    System.out.println("NO");
  }

  int num = sc.nextInt();
  float num1 = sc.nextFloat();
  if(num == num1){
    System.out.println("YES");
  }
  else{
    System.out.println("NO");
  }
   
}
}

