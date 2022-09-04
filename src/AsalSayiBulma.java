import java.util.Scanner;

public class AsalSayiBulma {
    static boolean asalmi(int sayi,int bolen){
        if(bolen == 1){
            return true;
        }

        if(sayi%bolen == 0){
            return false;
        }

        return asalmi(sayi,bolen-1);
    }

    public static void main(String[] args) {
        int sayi,bolen;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        sayi = inp.nextInt();
        bolen = sayi-1;
        if(asalmi(sayi,bolen)){
            System.out.print(sayi + " sayısı asaldır!");
        }else{
            System.out.print(sayi + " sayısı asal değildir!");
        }
    }
}
