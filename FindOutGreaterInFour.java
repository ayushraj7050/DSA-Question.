

public class FindOutGreaterInFour {
    public static void main(String[] args) {
        int first = 210;
        int second = 320;
        int third = 430;
        int fourth = 540;
    
    if(first > second){
        if(first>third){
            if(first>fourth){
                System.out.println("first number is greater");
            }
            else{
                System.out.println("fourth is greater");
            }

        }
        else{
            if(third>fourth){
                System.out.println("third is greater");
            }
            else{
                System.out.println("fourth is greater");
            }
        }
    }
    else{
        if(second>third){
            if (second>fourth) {
                System.out.println("second is greater");
            }
            else{
                System.out.println("fourth is greater");
            }
        }
        else{
            if(third>fourth){
                System.out.println("third is greater");
            }
            else{
                System.out.println("fourth is greater");
            }
        }
    }
}
}
