public class Factorial {
    static int fact(int num){
        if(num==1){
            return 1;
        }
        return num * fact(num - 1);
    }
    static void fact(int num, int result){
        if(num==1){
            System.out.println(result);
            return ;
        }
         fact(num-1,num * result);
    }
    public static void main(String[] args) {
        //fact(3,1);
        System.out.println(fact(3));
    }
}
