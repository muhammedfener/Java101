import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int a;
        String Burc = "";

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Girin: ");
        a = inp.nextInt();
        int kalan = a % 12;

        switch (kalan){
            case 0:
                Burc = "Maymun";
                break;
            case 1:
                Burc = "Horoz";
                break;
            case 2:
                Burc = "Köpek";
                break;
            case 3:
                Burc = "Domuz";
                break;
            case 4:
                Burc = "Fare";
                break;
            case 5:
                Burc = "Öküz";
                break;
            case 6:
                Burc = "Kaplan";
                break;
            case 7:
                Burc = "Tavşan";
                break;
            case 8:
                Burc = "Ejderha";
                break;
            case 9:
                Burc = "Yılan";
                break;
            case 10:
                Burc = "At";
                break;
            case 11:
                Burc = "Koyun";
                break;
        }
        System.out.print("Çin Zodyağı Burcunuz: " + Burc);
    }
}
