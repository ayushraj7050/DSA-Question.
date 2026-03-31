public class HollowRightAngleTriangle {
    public static void main(String[] args) {
        int range = 5;
        for(int row=0; row<range;row++){
            for(int col=0; col<=row; col++){
                if(row==range-1||col==0||row==col){
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
