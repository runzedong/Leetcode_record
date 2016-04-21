public class rotateImage {
	public void rotate(int[][] matrix) {
        if (matrix==null || matrix.length==0)
            return;
        int len=matrix.length;
        int layer=len/2;
        for (int i=0; i<layer; i++){
            for (int j=i; j<len-i-1; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[len-1-j][i];
                matrix[len-1-j][i]=matrix[len-1-i][len-1-j];
                matrix[len-1-i][len-1-j]=matrix[j][len-1-i];
                matrix[j][len-1-i]=temp;
            }
        }
    }
}