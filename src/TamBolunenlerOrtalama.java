import java.util.Scanner;

public class TamBolunenlerOrtalama {
    public static double OrtalamaBul(int Sayi){
        int sayilartoplami=0, bolunensayisayisi=0;
        double ortalamasayi = 0;
        for(int i=1;i<Sayi;i++){
            if(i%3 == 0 && i%4 == 0){
                sayilartoplami += i;
                bolunensayisayisi +=1;
            }
        }
        ortalamasayi = sayilartoplami / bolunensayisayisi;

        return ortalamasayi;
    }

    public static void main(String[] args) {
        int GirilenSayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        GirilenSayi = inp.nextInt();
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + OrtalamaBul(GirilenSayi));
    }

}
