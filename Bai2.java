import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int a ;
        int tong = 0;
        System.out.println("Nhap so nguyen");

        while (true){
            System.out.println("Nhap so:");
            a = sc.nextInt();
            if (a==0){
                break;
            }
       tong += a;
        }
        System.out.println("Tong cac so cong don lai la: "+tong);
    }
}
