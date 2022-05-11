package com.npg.hackerrank;

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean win = false;
        int movingIndex = 0;
        int n = game.length;
        int i = 0;

        while(i<n-1){
            movingIndex = i;

            if(movingIndex+1 <= n-1 && game[movingIndex+1] == 0){
                movingIndex = movingIndex+1;
            }
            if(movingIndex+leap <= n-1 && game[movingIndex+leap] == 0){
                movingIndex = movingIndex+leap;
            }

           if(movingIndex>=n-1){
                win = true;
                break;
            }
            if(i==movingIndex){
                win = false;
                break;
            }else{
                i=movingIndex;
            }

        }


        /*
        if(game[n-1-leap] !=0 && game[n-1]!=0){
            return false;
        }
        if(leap >= n-1)
          return true;
        while(i<game.length - 1){
            movingIndex = i;
            
            if(movingIndex-1 >=0 && game[movingIndex-1] == 0){
                movingIndex = movingIndex-1;
            }
            if(movingIndex>=n-1){
                win = true;
                break;
            }
            if(movingIndex+leap>=n-1){
                win = true;
                break;
            }
            if(game[movingIndex+1] == 0){
                movingIndex = movingIndex+1;
            }
            if(game[movingIndex+leap] == 0){
                movingIndex = movingIndex+leap;
            }
            if(movingIndex >= n-1 || movingIndex+leap >= n-1){
                win = true;
                break;
            }else{
                 if(game[movingIndex+1] != 0 && game[movingIndex+leap] != 0){
                win=false;
                break;
            }
            
            }
            i = movingIndex;
        }
        */
        return win;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}