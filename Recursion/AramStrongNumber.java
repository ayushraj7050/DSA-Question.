public class AramStrongNumber {
     static int countDigit(int num){
        
        if(num==0){
            return 0;
        }
        //small problem
        int count = countDigit(num/10);
        return count + 1;
     }
    static void computeAramStrongNumber(int num,int sum,int cpy,int count){
        //base case
        if(num==0){
            if(sum==cpy){
                System.out.println("Aramstrong Number");
            }
            else{
                System.out.println("Not Aramstrong Number");
            }
            return;
        }
        //logic
        int digit = num % 10;
        int result = (int)Math.pow(digit,count);
        sum = sum + result;
        computeAramStrongNumber(num/10,sum,cpy,count);
       
    }
    public static void main(String[] args) {
        int num = 153;
        int count = countDigit(num);
        computeAramStrongNumber(num,0,num,count);
    }
}
