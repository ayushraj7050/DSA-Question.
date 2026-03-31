

public class PrintName {
    static void printName(int num){

        if(num == 0){
            return ;
        }
        System.out.println("Ayush" +num);
        printName(num - 1);
        System.out.println("Raj" + num);
    }

    public static void main(String[] args) {
        printName(5);
    }
}
