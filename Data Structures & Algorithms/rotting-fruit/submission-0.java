class Solution {
    public int orangesRotting(int[][] grid) {
        Set<String> visited = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();
        // O(col*row)
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i,j});
                    visited.add(i + "," + j);
                }
            }
        }
        int minutes = 0;
        int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
        // O(n^2)
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int n = 0; n < size; n++) {
                int[] curr = queue.poll();
                for (int[] d : directions) {
                    int r = curr[0] + d[0];
                    int c = curr[1] + d[1];
                    if (r < grid.length && r >= 0 && c < grid[0].length && c >= 0 && !visited.contains(r + "," + c) && grid[r][c] == 1) {
                        visited.add(r+","+c);
                        queue.add(new int[]{r,c});
                        grid[r][c] = 2;
                    }
                }
            }
            if (!queue.isEmpty()) {
                minutes++;   
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return minutes;
    }
}
