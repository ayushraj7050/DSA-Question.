public class MazePath {
    static void mazePos(int row, int col, int endRow,int endCol,String result){
        //base case
        if(row==endRow && col==endCol){
            System.out.println(result);
            return ;
        }
        if(row>endRow || col>endCol){
            return;
        }
        //small problem
        // move Horizontal
        mazePos(row,col+1,endRow,endCol,result + "H");
        //Move Vertical
        mazePos(row+1,col,endRow,endCol,result + "V");
    }
    
    public static void main(String[] args) {
        mazePos(0,0,2,2,"");
    }
}
