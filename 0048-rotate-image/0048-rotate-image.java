class Solution {
    public void rotate(int[][] matrix) {
        
        int n=matrix.length;
        int i=0, j=n-1;
        while(i<j){
            for(int k =0; k<n; k++){
                int temp = matrix[i][k];
                matrix[i][k]= matrix[j][k];
                matrix[j][k]=temp;
            }
            i++;
            j--;
        }
        for(int m =0; m<n; m++){
            for(int l=m+1;l<n;l++){
            int temp = matrix[m][l];
            matrix[m][l]= matrix[l][m];
            matrix[l][m]= temp;
            }

        }
    }
}