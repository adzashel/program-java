import java.util.Scanner;

public class inputan02 {

  public static void main(String[] args) {

     Scanner gue = new Scanner(System.in);
   
     System.out.print("Masukin nilai Tugas = ");
      int tug = gue.nextInt();
      gue.nextLine();
    //bilangan bulat


     System.out.print("Masukin nilai UTS   = ");
      int uts = gue.nextInt();
      gue.nextLine();
    //bilangan bulat


     System.out.print("Masukin nilai UAS   = ");
      int uas = gue.nextInt();
      gue.nextLine();
    //bilangan bulat

      int rata = (tug*20/100)+(uts*30/100)+(uas*50/100);
       System.out.print("Rata-rata = "+ rata);
       
       gue.close();
    }

}