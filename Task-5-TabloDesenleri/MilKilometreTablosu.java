public class DonusumTablosu {
    public static void main(String[] args) {

        // 1 mil = 1.609 kilometre
        double donusumOrani = 1.609;

        // Mil değerleri
        int[] milDegerleri = {1, 5, 10, 20, 50};

        System.out.println("Mil -> Kilometre Dönüşüm Tablosu:");
        System.out.println("----------------------------------");

        // Her mil değeri için kilometreyi hesapla
        for (int mil : milDegerleri) {
            double kilometre = mil * donusumOrani;
            System.out.println(mil + " mil = " + kilometre + " kilometre");
        }
    }
}
