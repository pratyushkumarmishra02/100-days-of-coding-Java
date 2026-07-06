public class ContainerWithMaxWater {

	public static void main(String[] args) {
		int arr[] = {1,8,6,2,5,4,8,3,7};
		int max=0;
		int l=0,r=arr.length-1;
		while(l<r) {
			int h = Math.min(arr[l],arr[r]);
			int w = r-l;
			int containerArea = h*w;
			max = Math.max(max, containerArea);
			if(arr[l]<arr[r]) {
				l++;
			}else {
				r--;
			}
		}
		System.out.println("Max area for water is: "+max);
	}

}
