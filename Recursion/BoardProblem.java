public class BoardProblem {
    static void boardProblem(int currentValue,int endValue,String result){
        //base case
        if(currentValue ==endValue){
            System.out.println(result+" , ");
            return ;
        }
        //negative case
        if(currentValue>endValue){
            return ;
        }
        //small problem
        for(int dice = 1; dice<=6;dice++){
            boardProblem(currentValue+dice,endValue,result+dice);
        }
    }
    public static void main(String[] args) {
        boardProblem(0,10,"");
    }
}
