package java101;
import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("N sayısını giriniz: ");
        int n = inp.nextInt();
        double total = 0;

        for (double i=1 ; i <= n ; i++){
            total += (1/i);
        }
        System.out.println("Harmonik seri toplamı: "+total);
    }
}
