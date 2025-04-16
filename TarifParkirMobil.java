import java.util.Scanner;

public class TarifParkirMobil {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Masukan Lama Parkir = ");
      int time = input.nextInt(); // input lama parkir

      long parkingFee = fee(time);
      System.out.println("Lama parkir: " + time + " jam");
      System.out.println("Tarif parkir: Rp " + parkingFee);

      input.close();
   }

   public static long fee(int time) {
      // conditional statement depend on how long user been parkin'
      if( time <= 4) {
         int first4Hours = 6000;
         int parkFee = time * first4Hours ;
         return parkFee;
      }else if ( time <= 10) {
         return 35000;
      }
      else if( time <= 15) {
         return 55000;
      }
      else if ( time <= 24) {
         return 80000;
      }else {
         int firstDayFee = 80000;
         int nextDay = (int)Math.ceil((double) (time - 24) / 24) ; // get hours after one day parking
         int feePerDay = 60000;
         int nextDayFee = nextDay * feePerDay;
         return nextDayFee + firstDayFee;
      } 
   }
}