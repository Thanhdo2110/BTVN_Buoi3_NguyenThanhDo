package CodeP2;

public class MainCodeVideoP2 {

    public static void main (String[] args){

        CodeVideoP2 Cod = new CodeVideoP2();

        int tong = Cod.getTotal();
        System.out.println(tong);

        int thuong = Cod.getMultiple();
        System.out.println(thuong);

        int tru = Cod.getSub();
        System.out.println("Ket qua: "+tru);
    }
}
