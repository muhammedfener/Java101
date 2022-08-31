import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,toplamders=0,toplamnot=0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();
        if(100 > mat && mat > 0){
            toplamnot +=mat;
            toplamders++;
        }
        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        if(100 > fizik && fizik > 0){
            toplamnot +=fizik;
            toplamders++;
        }
        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();
        if(100 > turkce && turkce > 0){
            toplamnot +=turkce;
            toplamders++;
        }
        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        if(100 > kimya && kimya > 0){
            toplamnot +=kimya;
            toplamders++;
        }
        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();
        if(100 > muzik && muzik > 0){
            toplamnot +=muzik;
            toplamders++;
        }

        float ortalama = toplamnot / toplamders;

        if (ortalama <= 55 ){
            System.out.println("Sınıfı geçmek için ortalamanın altında kaldınız. Ortalamanızın 55 ve üzeri olması gerekiyor.");
        }else{
            System.out.println("Tebrikler sınıfı geçmek için yeterli ortalamaya sahipsiniz. Ortalamanız minimum koşul olan 55'in üzerinde.");
        }
    }
}
