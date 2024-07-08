import java.util.Scanner;

public class Main {

    // Faktoriyel hesaplayan metod
    public static long faktoriyel(int sayi) {
        long sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    // Kombinasyon hesaplayan metod
    public static long kombinasyon(int n, int r) {
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();

        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();

        if (n >= r && n >= 0 && r >= 0) {
            long sonuc = kombinasyon(n, r);
            System.out.println("C(" + n + ", " + r + ") = " + sonuc);
        } else {
            System.out.println("Geçersiz değerler girdiniz. n >= r ve n, r >= 0 olmalıdır.");
        }

        scanner.close();
    }
}
