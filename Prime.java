import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        // user Scanner package
        Scanner scanner = new Scanner(System.in);
        // initiate maxNum of prime
        System.out.print("Enter Number = ");
        int num = scanner.nextInt();
        boolean flag = false;

        // if 0 and 1 are'nt prime
        if(num == 0 || num == 1)  {
            flag = true;
    }

    // check if number is't prime
    for(int i = 2; i <= num / 2  ; i++) {
        if(num % i == 0) {
            flag = true;
            break;
        }
    }

    if(!flag) {
        System.out.println(num + " is a prime number.");
    }else {
        System.out.println(num + " is not a prime number.");
    }
}
}
