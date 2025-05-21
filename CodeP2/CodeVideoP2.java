package CodeP2;
import java.util.Scanner;

public class CodeVideoP2{
    public int getTotal(){

        int a = 11 ;
        int b = 11 ;

        int tong = a+b ;

        return tong;
    }
    public int getMultiple(){
        int c = 5;
        int d = 10;

        int thuong = c*d;

        return thuong;
    }
    public int getSub(){
        Scanner sc = new Scanner (System.in);

        System.out.println("Nhap so tru: ");
          int e = sc.nextInt();
        System.out.println("Nhap so bi tru: ");
          int f = sc.nextInt();

          int tru = e - f ;
          return tru;
    }
}
