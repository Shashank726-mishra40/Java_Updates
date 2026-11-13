
class main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
int b;
int a;
int[] arr  = new int[3];
	 for(int i=0;i<3;i++){
	     arr[i] = sc.nextInt();  
	 }
	if(arr[2]==9){
	    int n = arr[2]+1;
	    b = n%10;
	    a = n/10;
	    arr[2] = b;
	    arr[1] += a;
	}
	for(int i=0;i<3;i++){
	    	System.out.print(arr[i]+" ");
	}

	}
}

