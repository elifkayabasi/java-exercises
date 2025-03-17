import java.util.PrimitiveIterator;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir isim giriniz: ");
        String name = sc.nextLine();
        System.out.println("Sınıfınızı giriniz:");
        int sinif = sc.nextInt();

        System.out.println("İsminiz: " + name);
        System.out.println("Sınıfınız: " + sinif);

        sc.close();
    }
}
