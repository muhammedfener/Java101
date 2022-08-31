import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {
        int ay,gun;

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğdunuz ayı girin: ");
        ay = inp.nextInt();

        System.out.print("Doğduğunuz günü girin: ");
        gun = inp.nextInt();

        if(ay == 1){
            if(gun<22){
                System.out.print("Oğlak Burcu");
            }else{
                System.out.print("Kova Burcu");
            }
        }else if(ay == 2){
            if(gun<20){
                System.out.print("Kova Burcu");
            }else{
                System.out.print("Balık Burcu");
            }
        }else if(ay == 3){
            if(gun<21){
                System.out.print("Balık Burcu");
            }else{
                System.out.print("Koç Burcu");
            }
        }else if(ay == 4){
            if(gun<21){
                System.out.print("Koç Burcu");
            }else{
                System.out.print("Boğa Burcu");
            }
        }
        else if(ay == 5){
            if(gun<22){
                System.out.print("Boğa Burcu");
            }else{
                System.out.print("İkizler Burcu");
            }
        }
        else if(ay == 6){
            if(gun<23){
                System.out.print("İkizler Burcu");
            }else{
                System.out.print("Yengeç Burcu");
            }
        }
        else if(ay == 7){
            if(gun<23){
                System.out.print("Yengeç Burcu");
            }else{
                System.out.print("Aslan Burcu");
            }
        }else if(ay == 8){
            if(gun<23){
                System.out.print("Aslan Burcu");
            }else{
                System.out.print("Başak Burcu");
            }
        }else if(ay == 9){
            if(gun<23){
                System.out.print("Başak Burcu");
            }else{
                System.out.print("Terazi Burcu");
            }
        }else if(ay == 10){
            if(gun<23){
                System.out.print("Terazi Burcu");
            }else{
                System.out.print("Akrep Burcu");
            }
        }else if(ay == 11){
            if(gun<22){
                System.out.print("Akrep Burcu");
            }else{
                System.out.print("Yay Burcu");
            }
        }else if(ay == 12){
            if(gun<22){
                System.out.print("Yay Burcu");
            }else{
                System.out.print("Oğlak Burcu");
            }
        }
    }
}
