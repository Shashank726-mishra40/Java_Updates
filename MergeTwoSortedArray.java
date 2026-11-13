
public class MergeTwoSortedArray {
    public static void main(String[] args) {
int[] a = {1,2,3,0,0,0};
int[] b = {2,5,6};
int n = a.length;
int m = b.length;
 
   int[] arr = new int[n+m];
 int k = 0;
    int i=0;
 int j=0;
    while(i<n && j<m){
    if(a[i]<b[j]){
        // arr[k] = a[i]<b[j] ? a[i] : b[j] 
        arr[k] = a[i];
        i++;
        k++;
    }
    else if(a[i]>=b[j]){
       arr[k] = b[j];
        j++; 
        k++; 
    }
}

    while(i<n){
        // arr[k++]= a[i++];
        arr[k] = a[i];
        i++;
        k++;
    }


    while(j<m){
        // arr[k++] = b[j++];
        arr[k] = b[j];
        j++;
        k++;
    }


for(int x:arr){
 System.out.print(x+" ");
}
    
    
    
 
}
}

