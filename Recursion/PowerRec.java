public class PowerRec {
    static int computePower(int num,int pow){
        //base case
        if(pow==1){
            return num;
        }
        //small problem
        int result = computePower(num,pow-1);
        return result * num;
    }
    static void computePower(int num,int pow,int result){
        //base case
        if(pow==0){
            System.out.println(result);
            return;
        }
       //small problem
       computePower(num,pow-1,num * result);
    }
    public static void main(String[] args) {
       //computePower(2,5,1);
       int r = computePower(2,5);
       System.out.println(r);
    }
}
