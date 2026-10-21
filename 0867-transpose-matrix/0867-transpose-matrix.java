class Solution {
    public int[][] transpose(int[][] matrix) {
        int h=matrix.length;
        int o=matrix[0].length;
        int [][]a=new int[o][h];
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
           a[j][i]= matrix[i][j];
        }
       } 
       return a;
    }
}