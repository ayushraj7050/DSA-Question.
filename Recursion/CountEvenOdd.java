public class CountEvenOdd {
    
    // int[] - 2 size
    // int[] arr = new int[2];
    // int arr[] = new int[2]; fill with 0
    // int arr[] = {10,20};
    static int[] countEvenOdd(int range){
        //base case
        if(range==0){
            int result[] = new int[2];

            return result;
        }
        //small problem
        int result[] = countEvenOdd(range-1);
        //logic
        if(range % 2==0){
            result[0] = result[0] + 1 ;
        }
        else{
            result[1] = result[1] + 1;
        }
        return result;
    }

        

    static void countEvenOdd(int range, int even,int odd){
        //base case
        if(range==0){
            System.out.println("Even Count" +even +" odd Count " +odd);
            return;
        }
        if(range%2==0){
            even++;
        }
        else{
            odd++;
        }
        countEvenOdd(range-1,even,odd);
    }
    public static void main(String[] args) {
        //countEvenOdd(10,0,0);
        int arr[] = countEvenOdd(11);
        System.out.println("Even Count"+arr[0]);
        System.out.println("Odd Count"+arr[1]);
    }
}
