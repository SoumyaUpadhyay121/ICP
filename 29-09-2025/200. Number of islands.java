class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // Traverse the whole grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If land is found
                if (grid[i][j] == '1') {
                    count++; // new island found
                    dfs(grid, i, j); // sink the whole island
                }
            }
        }
        return count;
    }

    // DFS to mark all connected lands as visited
    private void dfs(char[][] grid, int i, int j) {
        // Base case: out of bounds or already water
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0'; // mark as visited (sink the land)

        // Explore 4 directions
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }
}
