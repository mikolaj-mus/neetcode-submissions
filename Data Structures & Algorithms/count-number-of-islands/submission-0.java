class Solution {
    int islands;
    Set<Point> visited;
    Point source;
    public int numIslands(char[][] grid) {
        this.islands = 0;
        this.visited = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                this.source = new Point(i,j);
                helper(grid, i, j);
            }
        }
        return this.islands;
    }

    public void helper(char[][] grid, int i, int j) {
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0) {
            return;
        }
        if (grid[i][j] == '0') {
            return;
        }
        Point current = new Point(i, j);
        if (this.visited.contains(current)) {
            return;
        }
        this.visited.add(current);
        helper(grid, i, j + 1);
        helper(grid, i + 1, j);
        helper(grid, i, j - 1);
        helper(grid, i - 1, j);
        if (current.equals(source)) {
            this.islands += 1;
        }
    }
}
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point)) return false;
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

