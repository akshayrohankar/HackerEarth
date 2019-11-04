import java.util.Arrays;


public class dimentrix {
	static int m;
	public static void main(String[] args) {

		int arr[]={1,2,3,5,6,7};
		Arrays.sort(arr);
		
		//int n=0;
		//	 m = arr.length;
		for(int i=0;i<(arr.length/2);i++){

			System.out.println("min:"+arr[0+i]+"  "+"max:"+arr[arr.length-1-i]);	

		}
		
		

	}
}