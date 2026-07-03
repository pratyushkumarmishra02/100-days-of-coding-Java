import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		int lp=0,rp=n-1;
		boolean found=false;
		while(lp<=rp) {
			int mid=(lp+rp)/2;
			if(key==arr[mid]) {
				found=true;
				break;
			}else if(key>arr[mid) {
				lp=mid+1;
			}else {
				rp=mid-1;
			}
		}
		System.out.println(found?"Key found":"Key not found");
		sc.close();
	}

}
