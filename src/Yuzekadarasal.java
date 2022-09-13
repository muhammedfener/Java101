public class Yuzekadarasal {
    public static void main(String[] args) {
        for(int i=2;i<100;i++){
            boolean asal = true;
            for(int a=2;a<i;a++){
                if(i%a == 0){
                    asal = false;
                }
                if(asal == false){
                    continue;
                }
            }
            if(asal == true){
                System.out.print(i + " ");
            }
        }
    }
}