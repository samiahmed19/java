public class setZeroTestCases {
    
    public static void setZeros(int arr[][]) {
        int col1=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]==0) col1=0;
            for(int j=1;j<arr[0].length;j++)
            {
                if(arr[i][j]==0) arr[i][0]=arr[0][j]=0;
            }
        }

        for(int i=arr.length-1;i>=0; i-- ){
            for(int j=arr[0].length-1;j>=1;j--){
                if(arr[i][0]==0 || arr[0][j]==0) arr[i][j]=0;
            }
            if(col1==0) arr[i][0]=0;
        }

        
    }
    public static void main(String[] args) {
		int[][] a={{0,2,3},
	    	        {4,0,6},
	    	        {7,8,9}};
	    setZeros(a);
	    for(int i=0;i<a.length;i++){
	        for(int j=0;j<a[0].length;j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	}

}
