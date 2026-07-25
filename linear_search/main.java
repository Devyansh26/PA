import java.util.*;
public class main {
    public static int max_val(int[] arr){
	int res=Integer.MIN_VALUE;
	for(int i: arr){
		if(i>res){
			res=i;
		}		
	}	
	return res;
}

    public static void main(String[] args) {
	int[] arr= {10,20,30,40,51,564};
	System.out.println(max_val(arr));
    }
}