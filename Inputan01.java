import java.util.Scanner;

public class Inputan01 {

    public static void main(String[] args) {

        Scanner saya = new Scanner(System.in);

        System.out.print("Masukin nama     = ");
        String a = saya.nextLine();
        // bs masukin huruf

        System.out.println("Nama Anda     = " + a);

        System.out.print("Masukin nilai b = ");
        int b = saya.nextInt();
        saya.nextLine(); // Consume the newline character

        System.out.print("Masukin nilai c = ");
        double c = saya.nextDouble();
        saya.nextLine(); // Consume the newline character

        System.out.println("Nilai b     = " + b);

        System.out.println("Nilai c     = " + c);
        saya.close();
    }
}