//Flood Fill Algorithm

class Solution {

    public void dfs(int[][] image, int sr, int sc, int color,int iniColor,
    int drow[],int dcol[],int n ,int m){

        image[sr][sc] = color;

        for(int i=0;i<4;i++){
            int nrow = sr+drow[i];
            int ncol = sc+dcol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
            && image[nrow][ncol]==iniColor && image[nrow][ncol]!=color){

                dfs(image,nrow,ncol,color,iniColor,drow,dcol,n,m);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int iniColor = image[sr][sc];
        int n = image.length;
        int m = image[0].length;

        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};

        dfs(image,sr,sc,color,iniColor,drow,dcol,n,m);

        return image;  
    }
}
