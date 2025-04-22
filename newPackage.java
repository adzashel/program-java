import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class newPackage {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        System.out.println("Enter ur name = ");
        String name = br.readLine();
        System.out.println("Enter ur age = ");
        int age = Integer.parseInt(br.readLine()); // casting or parsing to int

        System.out.println("Can i take ur order = ");
        System.out.println("Spaghetti =  2");
        System.out.println("Soda Pop =  1");
        System.out.println("Jasmine Tea =  1.4");
        System.out.println("Shawarma =  3");
        String order = br.readLine();

        if (order.equalsIgnoreCase("spaghetti")) {
            int food = 2;
            System.out.println("How many do you want = ");
            int quantity = Integer.parseInt(br.readLine());
            int totalOrder = food * quantity;
            System.out.println("What drink do you want = ");
            String drink = br.readLine();
            if (drink.equalsIgnoreCase("Soda pop")) {
                double drinks = 1.4;
                System.out.println("How many do you want = ");
                int quantity2 = Integer.parseInt(br.readLine());

                double totalOrder2 = drinks * quantity2;
                double totalPrice = total(totalOrder2, totalOrder);
                System.out.println("So it'll be = $" + totalPrice);
            } else if (drink.equalsIgnoreCase("Jasmine Tea")) {
                double drinks = 1.2;
                System.out.println("How many do you want = ");
                int quantity2 = Integer.parseInt(br.readLine());

                double totalOrder2 = drinks * quantity2;
                double totalPrice = total(totalOrder, totalOrder2);
                System.out.println("So it'll be = $" + totalPrice);
            }

        } else if (order.equalsIgnoreCase("Shawarma")) {
            int food = 5;
            System.out.println("How many do you want = ");
            int quantity = Integer.parseInt(br.readLine());
            int totalOrder = food * quantity;
            System.out.println("What drink do you want = ");
            String drink = br.readLine();
            if (drink.equalsIgnoreCase("Soda pop")) {
                double drinks = 1.4;
                System.out.println("How many do you want = ");
                int quantity2 = Integer.parseInt(br.readLine());

                double totalOrder2 = drinks * quantity2;
                double totalPrice = total(totalOrder, totalOrder2);
                System.out.println("So it'll be = $" + totalPrice);
            } else if (drink.equalsIgnoreCase("Jasmine Tea")) {
                double drinks = 1.2;
                System.out.println("How many do you want = ");
                int quantity2 = Integer.parseInt(br.readLine());

                double totalOrder2 = drinks * quantity2;
                double totalPrice = total(totalOrder, totalOrder2);
                System.out.println("So it'll be = $" + totalPrice);
            }
        }

    }

    public static double total(double totalOrderFoods , double totalOrderDrinks){
        double totalPrice = totalOrderDrinks + totalOrderFoods;
        return totalPrice;
    }
}
