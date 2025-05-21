import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai4 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Moi ban nhap so:");
        int a = sc.nextInt();;


        for (int i = 1 ; i <=10 ; i++ ){
            if (a >= 1){
            }else {
                System.out.println("Moi ban nhap lai !");
                return;
            }
            int thuong = a * i;

            System.out.println(+a+"x"+i+"="+ thuong);
        }
    }
}
