import java.util.Scanner;

public class UcakFiyatiHesaplama {
    public static void main(String[] args) {
        int km,yon,yas;
        double fiyat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yon = inp.nextInt();

        if(km>0 && yas>0 && (yon == 1 || yon == 2)){
            fiyat = km * 0.1;
            if(yas<12){
                fiyat = fiyat / 2;
            }
            if(yas>=12 && yas<=24){
                fiyat = fiyat * 0.9;
            }
            if(yas>65){
                fiyat = fiyat * 0.7;
            }
            if(yon == 2){
                fiyat *= 2;
                fiyat = fiyat * 0.8;
            }
            System.out.print("Toplam Tutar: " + fiyat + " TL");
        }
        else{
            System.out.print("Hatalı Veri Girdiniz!");
        }
    }
}
