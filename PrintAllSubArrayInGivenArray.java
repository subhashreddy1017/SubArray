public class Print_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,8};
		int k=0;
		for(k=0;k<arr.length;k++) 
		{
			printSubArray(arr,k);
		}
	}
	static void printSubArray(int[] arr,int k){
	for(int i=0;i<arr.length;i++) 
	{
		for(int j=i;j<=k;j++)
		System.out.print(arr[j]);
		
		System.out.println();
	}
	}
}
