public class ReverseBubbleShort {
  public static void main(String[] args) {
    int[] arr = {2,4,6,4,8,3};
    int n = arr.length;
for(int i=0;i<n-1;i++){
int swap = 0;
for(int j=0;j<n-1-i;j++){
    if(arr[j+1]>arr[j]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        swap++;
    }
    
}
if(swap==0) break;
}
for(int ele:arr){
    System.out.print(ele+" ");
}
// for(int i=n-1;i>=0;i--){
//     System.out.print(arr[i]+" ");
// }
  }  
}
