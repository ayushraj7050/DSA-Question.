public class SubSequenceOfString {
    static void subSequenceGen(String str, String result){
        //base case
        if(str.length()==0){
            System.out.println(result+ " ,  ");
            return ;
        }
        // not take it
        subSequenceGen(str.substring(1),result);
        //take it
        subSequenceGen(str.substring(1),result+ str.charAt(0));
    }
    public static void main(String[] args) {
        subSequenceGen("amit","");

        
    }
}
