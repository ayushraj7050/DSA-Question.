public class SumOfDigit {
    static void sumOfDigit(int num,int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        
        int digit = num%10;
        sum = sum + digit;
        
        sumOfDigit(num/10,sum);
    }
    public static void main(String[] args) {
        sumOfDigit(123,0);
    }
}
