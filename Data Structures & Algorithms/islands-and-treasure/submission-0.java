class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    queue.add(new int[]{i,j});
                    visited.add(i + "," + j);
                }
            }
        }
        int level = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                int[] current = queue.poll();
                int r = current[0];
                int c = current[1];
                grid[r][c] = level;
                for(int[] dir : dirs) {
                    int newR = r + dir[0];
                    int newC = c + dir[1];
                    if (newR >= 0 && newR < grid.length && newC >= 0 && newC < grid[0].length && !visited.contains(newR+","+newC) && grid[newR][newC] != -1) {
                        queue.add(new int[]{newR,newC});
                        visited.add(newR+","+newC);
                    }
                }
            }
            level++;
        }
    }
}
