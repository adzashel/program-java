import javax.swing.JOptionPane;

public class jieyra {
    public static void main(String[] argStrings) {
        String time = JOptionPane.showInputDialog("Berapa lama anda parkir = ");
        int parsedTime = Integer.parseInt(time);

        if (parsedTime <= 2) {
           int fee = 3000;
           JOptionPane.showMessageDialog(null,"Biaya parkir menjadi =  Rp." +  fee); 
        }else {
            int fee = 3000 + (parsedTime - 2) * 1500;
            JOptionPane.showMessageDialog(null, "Biaya parkir menjadi = Rp." +  fee);
        }
    }
}