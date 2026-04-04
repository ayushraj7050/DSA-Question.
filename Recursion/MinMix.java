public class MinMix {
    static int[] getMinMix(int arr[],int index){
        // base case
        if(arr.length==index){
            int r[] = new int[2];
            r[0] = Integer.MAX_VALUE;
            r[1] = Integer.MIN_VALUE;
            return r;
        }
        //  small problem
        int result[] = getMinMix(arr, index+1);
        if(result[0]>arr[index]){
            result[0] = arr[index];
        }
        else if(result[1]<arr[index]){
            result[1] = arr[index];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {10,90,100,200,50,1,88,40};
        int result[] = getMinMix(arr,0);
        System.out.println("Min" + result[0] + "Max" + result[1]);
    }
}
