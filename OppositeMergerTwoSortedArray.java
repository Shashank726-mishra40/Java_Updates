

public class OppositeMergerTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {2,3,5,7};
        int[] b ={1,4,8,9,21,34};
        int n = a.length;
        int m = b.length;
        int i = n-1;
        int j = m-1;
        int[] arr = new int[n+m];
        int k = n+m-1;
        while(i>=0 && j>=0){
            if(a[i]>b[j]) arr[k--]=a[i--];
            else arr[k--]=b[j--];
        }
        while(i>=0) arr[k--]=a[i--];
        while(j>=0) arr[k--]=b[j--];
        for(int x:arr){
        System.out.print(x+" ");
        }
    }

}
