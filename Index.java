import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        
        Scanner sample = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas : ");
        int tugas = sample.nextInt();

        System.out.print("Masukkan nilai UTS : ");
        int uts = sample.nextInt();

        System.out.print("Masukkan nilai UAS : ");
        int uas = sample.nextInt();


        // hitung rata-rata
        int avg = (tugas*20/100) + (uts*30/100) + (uas*50/100);
        System.out.println("Rata-rata nilai : " + avg);
        sample.close();

        // 
    }

}
