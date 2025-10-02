import java.util.*;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int boats = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;  // pair lightest
                j--;  // with heaviest
            } else {
                j--;  // heaviest goes alone
            }
            boats++;
        }
        return boats;
    }
}

