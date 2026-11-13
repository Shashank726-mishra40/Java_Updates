import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Sdevice s1 = new Sbulb(2,"Red");
	}
}

abstract class Sdevice{
    abstract void ON();
     abstract void OFF();
}

class Sbulb extends Sdevice{
   int bright;
   String Color;
   Sbulb(int bright,String Color){
       this.bright = bright;
       this.Color = Color;
       if(bright>0)
       ON();
       else OFF();
   }
    
   @Override
   public void ON(){
      System.out.println("Bulb is "+Color +" in Color and brightness of bulb is "+bright); 
   }
   
   @Override
   public void OFF(){
     System.out.println("Bulb is Off");  
   }
}

class Sfan extends Sdevice{
    
    
   @Override
   public void ON(){
       
   }
   
   @Override
   public void OFF(){
       
   }
}

class Sair extends Sdevice{
    
    
   @Override
   public void ON(){
       
   }
   
   @Override
   public void OFF(){
       
   }
   
}