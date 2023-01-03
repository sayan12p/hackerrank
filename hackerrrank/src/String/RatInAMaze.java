package String;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {

	
	public static List<String> path (int[][] m,int n){
		String ans="";
		List<String> res=new ArrayList<>();
		viewallpaths(0,0,n,m,ans,res);
		return res;
	}
private static void viewallpaths(int row, int col, int n, int[][] m, String ans, List<String> res) {
		// TODO Auto-generated method stub
		if(row>=n || col>=n|| row<0 || col<0 || m[row][col]==0 ) {
			return;
		}
		if(row==n-1 && col==n-1) {
			res.add(new String(ans));
		}
		m[row][col]=0;
		viewallpaths(row+1,col,n,m,ans+"D",res);
		viewallpaths(row,col+1,n,m,ans+"R",res);
		viewallpaths(row-1,col,n,m,ans+"U",res);
		viewallpaths(row,col-1,n,m,ans+"L",res);
		m[row][col]=1;
		
	}
public static void main(String[] args) {
	int[][] maze=new int[][] {
		{1, 0, 0, 0},
        {1, 1, 0, 1}, 
        {1, 1, 0, 0},
        {0, 1, 1, 1}
	};
	System.out.println(path(maze,4).toString());
}

}
