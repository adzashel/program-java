import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        Scanner inputValue = new Scanner(System.in);

        System.out.print(" Masukan Nilai KM = ");
        int km = inputValue.nextInt();

        // convert km to mil
        double convertValue = km * 1.609;

        System.out.println("Nilai dalam Mil = " + convertValue);

        inputValue.close();
    } 
}