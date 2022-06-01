class Solution {
    public int numIslands(char[][] grid) {
        int result = 0;
        int weight = grid.length;
        int length = grid[0].length;
      
        for(int i = 0 ; i < weight ; i++){
            for(int j = 0; j < length ; j++){
                
                if (grid[i][j] == '1'){
                   isIsland(i,j,grid);
                    result++;
                    
                }
                
            }
        }
        return result;
        
        
    }
    public void isIsland(int i,int j,char[][] grid){
        if(grid[i][j] == '1'){
            grid[i][j] = '0';
            if(i+1 < grid.length){
                 isIsland(i + 1,j,grid);
            }
            if(i-1 >= 0){
                 isIsland(i -1,j,grid);
            }
            if(j+1 < grid[0].length){
                 isIsland(i,j + 1,grid);
            }
             if(j-1 >= 0){
                 isIsland(i,j - 1,grid);
            }
            
        }
       
    }
}
