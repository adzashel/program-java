import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner module = new Scanner(System.in);

        // input time 
        System.out.print("Masukan Waktu ( format 24 Jam) = ");
        int time = module.nextInt();

        // convert time to 12 format
        String amPm = "AM";

        if( time >= 12) {
            amPm = "PM";
            time = (time % 12)  ;
        }

        System.out.print("Waktu dalam format 12 = "  + time  +  amPm);
        module.close();
    }
}