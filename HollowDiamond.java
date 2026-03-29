import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();


        for(int i =1; i<= size; i++){
            for(int j = i; j<=size; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*i-2; j++){
                System.out.print(" ");
            }
            for(int j = i; j<=size; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =1; i<= size; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=2 *i-2; j< 2 * size -2; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // System.out.println();
        
        // int range = 6;
        // for(int row=1; row<=range; row++){
        //     for(int col=1; col<=range;col++ ){
        //         if(row==1 || row==range|| col==1||col==range || col==2&&row==2 || col==5&&row==5 || col==2&&row==5 || row==2&&col==5){
        //             System.out.print(" *");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
