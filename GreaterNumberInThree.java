class GreaterNumberInThree {
    public static void main(String[] args) {
        int first = 1100;
        int second = 1200;
        int third = 300;

        if (first > second) {
            if (first > third) {
                System.out.println("first number is greater");
            } else {
                System.out.println("third number is greater");
            }
        } else {
            if (second > third) {
                System.out.println("second number is greater");
            } else {
                System.out.println("third number is greater");
            }
        }
    }
}
