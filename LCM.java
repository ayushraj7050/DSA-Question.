public class LCM {
    public static void main(String[] args) {
        int a = 12; 
        int b = 24;
        int aCpy = a;
        int bCpy = b;

        // GCD - Division Method
        while(a%b!=0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        int lcm = (aCpy * bCpy) / b;
        System.out.println(lcm);
    }
}
