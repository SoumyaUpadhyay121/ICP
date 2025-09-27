class Solution {
    public boolean isPerfectSquare(int num) {
      if (num < 0) return false;
        int x = (int) Math.sqrt(num);
        
        // Check if the square of x equals num
        return x * x == num;
    }
}