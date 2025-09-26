import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
  public int[] maxSlidingWindow(int[] nums, int k) {
    if (nums == null || nums.length == 0 || k == 0)
      return new int[0];

    int n = nums.length;
    int[] ans = new int[n - k + 1];
    Deque<Integer> dq = new ArrayDeque<>(); // store indices

    for (int i = 0; i < n; i++) {
      while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
        dq.pollFirst();
      }
      while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
        dq.pollLast();
      }

      dq.offerLast(i);

      if (i >= k - 1) {
        ans[i - k + 1] = nums[dq.peekFirst()];
      }
    }

    return ans;
  }
}


//Time Complexity:O(n)
//Space Complexity:O(n)




