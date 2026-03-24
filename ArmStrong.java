public class ArmStrong {
    public static void main(String[] args) {
        int num = 153;
        int cpy = num;
        int count = 0;
        int sum = 0;
        //count digit
        while(cpy!=0){
            count++;
            cpy = cpy / 10;  //make number small
        }
        //System.out.println(count);
        cpy = num;

        while(cpy!=0){
            int digit = cpy % 10;
            sum = sum + (int)Math.pow(digit, count);
            cpy = cpy / 10;

        }
        System.out.println(num == sum?"Arstrong Number":"Not an Armstrong");
    }
}
