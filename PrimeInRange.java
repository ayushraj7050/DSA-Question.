import java.util.Scanner;
public class PrimeInRange{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("enter a number");
        // int n = scanner.nextInt();
        System.out.println("enter the range");
        int range= scanner.nextInt();
        boolean isPrime = false;
        for(int k=1;k<=range; k++){
            isPrime = false;
            for(int i = 2; i <=Math.sqrt(k); i++){
                if(k % i==0){
                    isPrime = true;
                }
            }
            if(isPrime){
                System.out.println(k + "number is not prime");
            }
            else{
                System.out.println(k + "number is prime");
            }
        }
    }
}