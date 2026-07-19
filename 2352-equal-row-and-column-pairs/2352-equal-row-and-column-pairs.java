class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int count=0;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int row[] = new int[n];
                int col[] = new int[m];
                for(int k=0;k<n;k++){
                    row[k]=grid[i][k];
                    col[k]=grid[k][j];
                }
                if(Arrays.equals(row,col)) count++;
            }
        }
        return count;
    }
}