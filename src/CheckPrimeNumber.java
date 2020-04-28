import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên bất kỳ: ");
        int num = scanner.nextInt();
        boolean check = true;
        if (num < 2) {
            System.out.println(num + " ko phải là số nguyên tố");
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println(num + " là số nguyên tố");
            } else {
                System.out.println(num + " ko phải là số nguyên tố");
            }
        }
    }
}
