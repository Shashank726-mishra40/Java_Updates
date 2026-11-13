

public class StringBasic {
  public static void main(String[] args) {
    // String s1 = "Ja";
    // String s2 = s1+"va";
    // System.out.println(s1==s2);

    String s = "";
    for(int i=0;i<5;i++ ){
        s += i; // s = s+i; Too ye sab kam RunTime par hee hoga too s kaa reference aab Heap main hogaa naa kii String Pool main
        System.out.println(s);
    }
    
  }  
}
