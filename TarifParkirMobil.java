import java.util.Scanner;

    public class TarifParkirMobil {
    
         public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Masukan Lama Parkir = ");
            int time = input.nextInt(); // input lama parkir

            long parkingFee = fee( time );
            System.out.println("Lama parkir: " + time + " jam");
            System.out.println("Tarif parkir: Rp " + parkingFee);
    
            input.close();
         }


         public static long fee(int time ) {
         if( time <= 4) {
            int first4Hours = 6000;
            return (long) time * first4Hours;
         }else if (time <= 10) {
            return 35000;
         }else if ( time <= 15) {
            return 55000;
         }else if( time <= 24) {
            return 80000;
         }
         else {
            // lebih dari 24 kena biaya harian ditambah waktu parkir perjjam
            long firstDayFee = 80000;
            int nextDay = (int) Math.ceil((double) (time - 24) / 24);
            int feePerDay = 60000;
            int nextDayFee = nextDay * feePerDay;
            return firstDayFee + nextDayFee;
         }
            
         }
    }