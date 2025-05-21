import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        String a = sc.nextLine();

        System.out.println("Nhap chu muon tim: ");
        String b = sc.nextLine();

        int viTri = a.toLowerCase().indexOf(b.toLowerCase());

        if(viTri != -1){
            System.out.println("Thu tu dc tim thay la: "+viTri);
        }else{
            System.out.println("Khong tim thay vi tri");
        }
    }
}
