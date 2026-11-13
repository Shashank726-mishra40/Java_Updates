public class MoveAllzero {
    public static void main(String[] args) {
        int[] arr = {2,0,4,6,0,4,8,0,3};
    int n = arr.length;
for(int i=0;i<n-1;i++){
int swap = 0;
for(int j=0;j<n-1-i;j++){
    if(arr[j]==0){
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
    }
}
