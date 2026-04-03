public class PalindromeNumber {
    static void palindromeNumber(int num,int reverse,int cpy){
        //base case
        if(num==0){
            System.out.println(reverse==cpy?"Palindrome":"Not Palindrome");
            return;
        }
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        //small problem
        palindromeNumber(num/10,reverse,cpy);
    }
    public static void main(String[] args) {
        int num = 151;
        int cpy = num;
        palindromeNumber(num, 0,cpy);
    }
}
