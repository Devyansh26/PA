import java.util.*;

class main {
	public static int Foccurence(int[] arr,int target){
		int low=0;
		int high=arr.length-1;

		int res=-1;
		while(low<=high){
			int mid = (low + high)/2;
			if(arr[mid] == target){
				res=mid;
				high=mid-1;
			}
			if(arr[mid] < target){
				low=mid+1;	
			}else{
				high=mid-1;	
			}
		}
		return res;
	}

	public static int Loccurence(int[] arr,int target){
		int low=0;
		int high=arr.length-1;

		int res=-1;
		while(low<=high){
			int mid = (low + high)/2;
			if(arr[mid] == target){
				res=mid;
				low=mid+1;
			}
			else if(arr[mid] < target){
				low=mid+1;	
			}else{
				high=mid-1;	
			}
		}
		return res;
	}

	public static int binary_search(int[] arr,int target){
		int i=0;
		int j=arr.length -1;

		while(i<=j){
			int mid=(i+j)/2;
			if(arr[mid]==target){
				return mid;	
			}
			else if(arr[mid] < target){
				i=mid+1;	
			}else{
				j=mid-1;	
			}
		}
		return -1;
		
	}
	public static void main(String[] args){
		//int[] arr = {10,20,30,40,50,60};
		//int target=50;
		//System.out.println(binary_search(arr,target));

		int[] arr = {1,1,2,2,2,3,4};
		//System.out.println(Foccurence(arr,2));
		//System.out.println(Loccurence(arr,2));
		
		System.out.println(Loccurence(arr,2) - Foccurence(arr,2) +1 );
	}
}