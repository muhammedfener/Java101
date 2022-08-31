import java.util.Scanner;

public class KullaniciKontrol {
    public static void main(String[] args) {
        String kullaniciAdi,dogruSifre = "java",girilenSifre,yeniSifre;
        int secim;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adını Girin: ");
        kullaniciAdi = inp.next();
        System.out.print("Şifre Girin: ");
        girilenSifre = inp.next();

        if(kullaniciAdi == "patika" && girilenSifre == dogruSifre){
            System.out.print("Başarıyla Giriş Yaptınız!");
        }
        else{
            System.out.print("Hatalı şifre girdiniz. Şifrenizi sıfırlamak istiyorsanız 1, istemiyorsanız 2'yi girin.");
            secim = inp.nextInt();
            if(secim == 1){
                    System.out.print("Yeni Şifrenizi girin: ");
                    yeniSifre = inp.next();
                    if(yeniSifre.equals(girilenSifre) || yeniSifre.equals(dogruSifre)){
                        System.out.print("Şifre oluşturulamadı. Lütfen başka şifre girin.");
                    }
                    else {
                        System.out.print("Şifre oluşturuldu!");
                    }
            }
        }
    }
}
