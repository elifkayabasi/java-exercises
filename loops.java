import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. for Döngüsü (1'den 5'e kadar say)
        System.out.println("for Döngüsü:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Sayı: " + i);
        }

        // 2. while Döngüsü (1'den 5'e kadar say)
        System.out.println("\nwhile Döngüsü:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Sayı: " + j);
            j++;
        }

        // 3. do-while Döngüsü (Kullanıcı doğru şifre girene kadar çalışır)
        System.out.println("\ndo-while Döngüsü (Şifre girişi):");
        String sifre;
        do {
            System.out.print("Şifre girin: ");
            sifre = scanner.nextLine();
        } while (!sifre.equals("1234"));
        System.out.println("Doğru şifre! Giriş başarılı.");

        // 4. break Kullanımı (5’e geldiğinde döngüyü durdur)
        System.out.println("\nbreak Kullanımı:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Döngü 5’te durduruldu.");
                break;
            }
            System.out.println("Sayı: " + i);
        }

        // 5. continue Kullanımı (3’ü atlayarak sayıları yazdır)
        System.out.println("\ncontinue Kullanımı:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("3 atlandı!");
                continue;
            }
            System.out.println("Sayı: " + i);
        }

        scanner.close();
    }
}
