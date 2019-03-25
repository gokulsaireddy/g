package g;

public class NEWSORT {
	public void bubbleSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                    int n1 = arr.length;
	    	            for (int i1=0; i1<n1; ++i1)
	    	                System.out.print(arr[i1] + " ");
	    	            System.out.println();}
	                }
	     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			NEWSORT ob=new NEWSORT();
			 int arr[] = {64, 34, 25, 12, 22, 11, 90};
		        ob.bubbleSort(arr);
		        System.out.println("Sorted array");
		        

	}
	

}
