public class prefix_sum {
    public static void main(String[] args) {
        int[] arr = {2,5,3,8,1,6};
	int n=arr.length;
	int[] prefix=new int[n];
	
	prefix[0]=arr[0];
	for(int i=1;i<n;i++){
		prefix[i]=prefix[i-1]+arr[i];
	}
	for(int i:prefix){
		System.out.print(i + " ");	
	}
	System.out.println(prefix[5] - prefix[1]);
    }
}	