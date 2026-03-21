

public class SwitchCase {
    public static void main(String []args){
        int item = 3;
        final int BURGER = 1;
        final int PIZZA = 2;
        final int DESSERT = 3;
        final int DRINKS = 4;
        
        switch(item) {
            case BURGER:
                System.out.println("Price is Rs 100");
                break;
            case PIZZA:
                System.out.println("price is Rs 200");
                break;
            case DESSERT:
                System.out.println("price is Rs 300");
                break;
            case DRINKS:
                System.out.println("price is Rs 400");
                break;
                default:
                    System.out.println("invalid item");
        }
    }
}