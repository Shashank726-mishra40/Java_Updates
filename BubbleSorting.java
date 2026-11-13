

public class BubbleSorting {
   public static void main(String[] args) {
    int[] a = {1,2,9,4,5};
    int n = a.length;
    for(int i=0;i<n-1;i++){
        int count = 0;
        for(int k=0;k<n-1;k++){
        if(a[k]<a[k+1]) count++;
        else break;
        }
        if(count==(n)) break;
        for(int j=0;j<n-1-i;j++){
            if(a[j]>a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }

    }
    print(a);

   }
   public static void print(int[] a) {
    for(int ele : a){
        System.out.print(ele+" ");
    }
   } 
}
