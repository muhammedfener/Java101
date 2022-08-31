import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,op;

        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Girin: ");
        n1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Girin: ");
        n2 = inp.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("İşlem Seçiniz: ");
        op = inp.nextInt();

        switch (op){
            case 1:
                System.out.print("Sonuç: " + (n1+n2));
                break;
            case 2:
                System.out.print("Sonuç: " + (n1-n2));
                break;
            case 3:
                System.out.print("Sonuç: " + (n1*n2));
                break;
            case 4:
                if(n2 == 0){System.out.print("Bir Sayıyı Sıfıra Bölemezsiniz!"); break;}

                System.out.print("Sonuç: " + (n1/n2));
                break;
            default:
                System.out.print("Hatalı İşlem Numarası Girdiniz!");
        }

    }
}
