public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci(1973, 104);

        Ogrenci ogrenci2 = new Ogrenci("Hakan", "Bilgisayar Müh.", 1985, 104);

        Ogrenci ogrenci3 = new Ogrenci("Ayşe", "Makine Müh.", 1985, 104);

        Ogrenci ogrenci4 = new Ogrenci("Elif", "Elektrik-Elektronik Müh.", 2020, 104, 1.98);

        System.out.println("Öğrencilerin Bilgileri");

        System.out.printf("OGR-1 %s %s %s %s %n", ogrenci.getAd(), ogrenci.getBolum(), ogrenci.getOgrNo(), ogrenci.getGano());

        System.out.printf("OGR-2 %s %s %s %s %n", ogrenci2.getAd(), ogrenci2.getBolum(), ogrenci2.getOgrNo(), ogrenci2.getGano());

        System.out.printf("OGR-3 %s %s %s %s %n", ogrenci3.getAd(), ogrenci3.getBolum(), ogrenci3.getOgrNo(), ogrenci3.getGano());

        System.out.printf("OGR-4 %s %s %s %s %n", ogrenci4.getAd(), ogrenci4.getBolum(), ogrenci4.getOgrNo(), ogrenci4.getGano());

        ogrenci3.harcHesapla(1);
        System.out.printf("3. Öğrencinin ödeyeceği harç : %.1f %n", ogrenci3.getHarc());

        ogrenci4.harcHesapla(1, 1);
        System.out.printf("4. Öğrencinin ödeyeceği harç : %.1f %n", ogrenci4.getHarc());
    }
}
