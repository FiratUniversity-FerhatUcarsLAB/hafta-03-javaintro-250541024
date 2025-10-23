public class HesapOzeti {
    public static void main(String[] args) {
        String[] urun = {"Armut", "Ekmek", "Kola"};
        int[] miktar = {4,2,1};
        double[] fiyat = {5.0, 15.0, 40.0};
        System.out.println("Urun\tMiktar\tFiyat");
        for (int i = 0; i < urun.length; i++) {
            System.out.println(urun[i] + "\t" + miktar[i] + "\t" + fiyat[i]);
        }

    }
}
