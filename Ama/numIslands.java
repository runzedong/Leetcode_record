public class numIslands {
	// recursively dfs. to set each grid[i][j]='0'
	public int numIslands(char[][] grid) {
        int counter=0;
        if (grid==null || grid.length==0 || grid[0].length==0)
            return counter;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]=='1')
                    counter++;
                    helper(i,j,grid);
            }
        }
        return counter;
    }
    public void helper(int i, int j, char[][] grid){
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length)
            return ;
        if (grid[i][j]=='0')
            return ;
        grid[i][j]='0';
        helper(i+1, j, grid);
        helper(i-1, j, grid);
        helper(i, j+1, grid);
        helper(i, j-1, grid);
    }
}