import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao mot so nguyen to: ");
        int a = sc.nextInt();

        if (a < 2) {
            System.out.println(a + " khong phai la so nguyen to.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(a + " la so nguyen to.");
        } else {
            System.out.println(a + " khong phai la so nguyen to.");
        }

        sc.close();
    }
}

