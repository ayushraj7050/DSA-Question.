public class SwapFirstAndLastDigit1 {
    public static void main(String[] args) {
        int num = 9246;
        int cpy = num;
        int count = 0;
        while(num!=0){
            count++;
            cpy = cpy/ 10;
        }
        int pow = (int)Math.pow(10,count-1);
        int lastDigit = num % 10;
        int firstDigit = num / 10;
        num = num / 10;
        int pow2 = (int)Math.pow(10,count-2);
        int middleNum = num % pow2;
        int result = lastDigit * pow + middleNum * 10 + firstDigit;
        System.out.println(result);
    }
}
