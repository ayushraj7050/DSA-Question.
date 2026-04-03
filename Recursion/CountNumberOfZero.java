public class CountNumberOfZero {
    static int countNumberOfZero(int num){
        // base case
        if(num==0){
            return 0;
        }
        //small problem
        int count = countNumberOfZero(num/10);
        int digit = num % 10;
        return count + (digit ==0 ? 1:0);
    }
    public static void main(String[] args) {
        int r = countNumberOfZero(10203040);
        System.out.println(r);
    }
}
