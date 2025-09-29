import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        return print(matrix);
    }

    	public static ArrayList<Integer> print(int[][]arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int minc=0,minr=0,maxc=arr[0].length-1,maxr=arr.length-1;
		int te=arr.length*arr[0].length;
		int c=0;
		while(c<te) {
		for(int i=minc;i<=maxc && c<te;i++) {
			list.add(arr[minr][i]);
			c++;
		}
		minr++;
		for(int i=minr;i<=maxr && c<te;i++) {
			list.add(arr[i][maxc]);
			c++;
		}
		maxc--;
		for(int i=maxc;i>=minc && c<te;i--) {
			list.add(arr[maxr][i]);
			c++;
			}
		maxr--;
		for(int i=maxr;i>=minr && c<te;i--) {
			list.add(arr[i][minc]);
			c++;
		}
		minc++;
	}
		return list;
	}
}
