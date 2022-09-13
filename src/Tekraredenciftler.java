import java.util.Arrays;

public class Tekraredenciftler {
    public static void main(String[] args) {
        int[] sayilar = {1,2,3,4,5,6,7,1,2,3,4,5,6,7,8,1,2};
        int[] cifttekrar = new int[sayilar.length];
        int sira = 0;
        for(int i=0;i< sayilar.length;i++){
            for(int j=0;j<sayilar.length;j++){
                if(i != j && (sayilar[i] == sayilar[j]) && (sayilar[i]%2 == 0)){
                    cifttekrar[sira++] = sayilar[i];
                    break;
                }
            }
        }
        System.out.print(Arrays.toString(cifttekrar));
    }
}