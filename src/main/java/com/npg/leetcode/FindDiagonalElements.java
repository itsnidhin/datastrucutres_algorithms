package com.npg.leetcode;

public class FindDiagonalElements {

    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        mat[0][0] = 1;
        mat[0][1] = 2;
        mat[0][2] = 3;
        mat[1][0] = 4;
        mat[1][1] = 5;
        mat[1][2] = 6;
        mat[2][0] = 7;
        mat[2][1] = 8;
        mat[2][2] = 9;

        int m = mat.length;
        int n = mat[0].length;
       
        int[] ret = new int[m*n];
       
        int i = 0;
        for(int sum = 0;sum<m+n-1;sum++){
            
            if( (sum&1) == 0){//if sum is even left bottom to right top
                int rs = sum > m ? m-1 : sum;
                int cs = sum - rs;
                //System.out.println(rs+","+cs);
                for(;rs>=0&&cs<=n-1;rs--,cs++){
                    //System.out.println(mat[rs][cs]);
                    ret[i++] = mat[rs][cs];
                }

            }else{//if sum is odd right top to left bottom
                int rs = sum < n ? 0 : sum - n + 1;
                int cs = sum - rs;
                for(;rs<=m-1&&cs>=0;rs++,cs--){
                    //System.out.println(mat[rs][cs]);
                    ret[i++] = mat[rs][cs];
                }
                

            }
            
            
        }

        for(int a:ret){
            System.out.println(a);
        }

        
    }



    
}
