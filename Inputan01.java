import java.util.Scanner;

public class Inputan01 {

    public static void main(String[] args) {

        Scanner saya = new Scanner(System.in);

        System.out.print("Masukin  nilai tugas = ");
        int a = saya.nextInt();
        saya.nextLine(); // Consume the newline character
        // bs masukin huruf

      //   System.out.println("Nama Anda     = " + a);

        System.out.print("Masukin nilai uts = ");
        int b = saya.nextInt();
        saya.nextLine(); // Consume the newline character

        System.out.print("Masukin nilai uas = ");
        int c = saya.nextInt();
        saya.nextLine(); // Consume the newline character

        int rata = (a*20/100)+(b*30/100)+(c*50/100);
        System.out.print("Rata-rata = "+ rata);
        
        
        saya.close();
    }
}