package day_3;

public class No_of_Iselands {
    public static void main(String[] args) {
        int[][] grid={
            {1,1,0,0,0},
            {1,1,0,0,0},
            {0,0,1,0,0},
            {0,0,0,1,1}
        };
        int ans=numIslands(grid);
        System.out.println(ans);
    }
    public static int numIslands(int[][] grid){
        if(grid.length==0){
            return 0;
        }
        int count=0;
        int rows=grid.length;
        int cols=grid[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public static void dfs(int[][] grid,int i,int j){
        int rows=grid.length;
        int cols=grid[0].length;

        if(i<0 || j<0 || i>=rows || j>=cols || grid[i][j]==0){
            return;
        }
        grid[i][j]=0;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
    
}
