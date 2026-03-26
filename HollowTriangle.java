public class HollowTriangle {
    public static void main(String[] args) {
        int range = 4;
        int range1 = 7;
        for(int row = 1; row<=range; row++){
            for(int col =1; col <=range1; col++){
                if( row==range|| col==range-row +1 || col==range +row -1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
