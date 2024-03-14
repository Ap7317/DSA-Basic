package BACKTRACKING;
import java.util.*;

// Rat in a Maze (2 Direction)

public class rat_in_maze_I {
    public static void main(String[] args) {
        int row=3;
        int col=4;
        int ans=maze(1,1,row,col);
        System.out.println("Total number of ways to reach end:"+ans);
    }
    static int maze(int sr,int sc,int er,int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int downways=maze(sr+1,sc,er,ec);
        int rightways=maze(sr,sc+1,er,ec);
        return downways+rightways;
    }
}
