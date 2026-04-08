public class FiboDemo {
    static int fibo(int num){
        //base case 
        if(num<=1){
            return num;
        }
        int firstTerm = fibo(num-1);
        int secondTerm = fibo(num-2);
        return firstTerm + secondTerm;
    }
    public static void main(String[] args) {
        int result = fibo(8);
        System.out.println(result);
    }
}
