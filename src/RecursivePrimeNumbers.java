import java.util.Scanner;

public class RecursivePrimeNumbers {

    static int prime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = scanner.nextInt();
        int counter = 0;
        for (int i = 1 ; i <= number; i++){
            int mod = number % i;
            if(mod == 0 ){
                counter++;
            }
        }
        if (counter == 2){
            System.out.println(number + " Sayısı Asal Sayıdır.");
        }else{
            System.out.println(number + " Sayısı Asal Sayı Değildir");
        }
        System.out.println("Çıkış Yapmak İçin 1'e Basınız");
        int exit = scanner.nextInt();
        if (exit == 1 ){
            return 1;
        }
        return prime();
    }

    public static void main(String[] args) {
        prime();
    }
}
