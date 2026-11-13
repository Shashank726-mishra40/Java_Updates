
public class Main
{
	public static void main(String[] args) {
		Processor p = new Processor("Intel16");
		RAM r = new RAM("8GB");
		Storage st = new Storage("128GB");
		Mobile mb = new Mobile(p,r,st);
	}
}

class Mobile{
    Processor p;
    RAM r;
    Storage st;
    
    Mobile(Processor p,RAM r,Storage st){
        this.p = p;   // yaha se class kaa reference milegaa
        this.r = r;
        this.st = st;
        display();
    }
    
    void display(){
        System.out.println(p.name);
    }
    
}

class Processor{
  String name;
  Processor(String name){
      this.name = name;
  }
}

class RAM{
    String size;
    RAM(String size){
        this.size = size;
    }
    
}

class Storage{
    String cap;
    Storage(String cap){
        this.cap = cap;
    }
    
}