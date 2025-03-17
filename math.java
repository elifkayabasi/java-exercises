import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        double sayi = scanner.nextDouble();

        // Mutlak Değer ve İşaret
        System.out.println("Mutlak Değer: " + Math.abs(sayi));
        System.out.println("İşaret: " + Math.signum(sayi));

        // Yuvarlama
        System.out.println("Yukarı Yuvarlama: " + Math.ceil(sayi));
        System.out.println("Aşağı Yuvarlama: " + Math.floor(sayi));
        System.out.println("En Yakına Yuvarlama: " + Math.round(sayi));

        // Üstel ve Logaritma
        System.out.println("Karekök: " + Math.sqrt(sayi));
        System.out.println("e^x: " + Math.exp(sayi));
        System.out.println("Doğal Logaritma (ln): " + Math.log(sayi));

        // Trigonometri
        System.out.print("Bir açı giriniz (derece): ");
        double aci = scanner.nextDouble();
        double radyan = Math.toRadians(aci);

        System.out.println("Sinüs: " + Math.sin(radyan));
        System.out.println("Kosinüs: " + Math.cos(radyan));
        System.out.println("Tanjant: " + Math.tan(radyan));

        // Max-Min ve Rastgele Sayılar
        System.out.println("Max(10, 20): " + Math.max(10, 20));
        System.out.println("Min(10, 20): " + Math.min(10, 20));
        System.out.println("Rastgele sayı (0-1): " + Math.random());
        System.out.println("Rastgele Tam Sayı (1-100): " + (int) (Math.random() * 100 + 1));

        scanner.close();
    }
}
