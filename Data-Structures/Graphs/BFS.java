public class BFS(){
    public void bfs(char[][] grid, int row, int col, int[][] direction){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {row,col});
        grid[row][col] = '0';

        while(!queue.isEmpty()){
            int[] curr = queue.remove();
            int r = curr[0];
            int c = curr[1];


            for(int[] d: direction){
                int new_r = r + row;
                int new_c = c + col;

                if(new_r >= 0 && new_r < grid.length && new_c >= 0 && new_c <grid[0].length && grid[new_r][new_c] == '1'){
                    queue.offer(new int[] {new_r,new_c});
                    grid[new_r][new_c] = '0';
                }
            }
        }
    }
}