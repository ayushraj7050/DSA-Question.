public class StringReverse {
    static String reverse(String str){
        //base case
        if(str.length()==0){
            return "";
        }
        //small problem
        String smallString = reverse(str.substring(1));
        char firstChar = str.charAt(0);
        return smallString + firstChar;

    }
    public static void main(String[] args) {
        String r = reverse( "Ayush");
        System.out.println(r);
    }
}
