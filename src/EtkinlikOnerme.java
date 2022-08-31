import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int havasicakligi;

        Scanner inp = new Scanner(System.in);
        System.out.print("Hava sıcaklığını girin: ");
        havasicakligi = inp.nextInt();

        if(havasicakligi<5){
            System.out.print("Kayak yapabilirsiniz.");
        }
        else if(havasicakligi>=5 && havasicakligi<=15){
            System.out.print("Sinemaya gidebilirsiniz.");
        }
        else if(havasicakligi>15 && havasicakligi<=25){
            System.out.print("Piknik yapabilirsiniz.");
        }
        else{
            System.out.print("Denize gidebilirsiniz.");
        }
    }
}
