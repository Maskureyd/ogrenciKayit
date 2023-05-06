public class Ogrenci {
    private String ad;
    private String bolum;
    private double gano;
    private String ogrNo;
    private int girisYili;
    private int bolumKodu;
    private double harc;
    Ogrenci(int girisYili, int bolumKodu) {
        this.girisYili = girisYili;
        this.bolumKodu = bolumKodu;
        this.ogrNo = ogrenciNoOlustur(girisYili, bolumKodu);
        this.gano = 0.0;
    }
    Ogrenci(String ad, String bolum, int girisYili, int bolumKodu) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.bolumKodu = bolumKodu;
        this.ogrNo = ogrenciNoOlustur(girisYili, bolumKodu);
    }

    Ogrenci(String ad, String bolum, int girisYili, int bolumKodu, double gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.bolumKodu = bolumKodu;
        this.gano = gano;
        this.ogrNo = ogrenciNoOlustur(girisYili, bolumKodu);
        if (gano > 4 || gano < 0) {
            throw new IllegalArgumentException("Genel ortalama 4'ten büyük veya 0'dan küçük olamaz.");
        }
    }

    public String ogrenciNoOlustur(int girisYili, int bolumKodu) {
        String bolumKoduStr = String.format("%02d", bolumKodu);
        return girisYili + bolumKoduStr + "001";
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        if (gano > 4 || gano < 0) {
            throw new IllegalArgumentException("Genel ortalama 4'ten büyük veya 0'dan küçük olamaz.");
        }
        this.gano = gano;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }
    public double getHarc() {
        return harc;
    }

    public void setHarc(double harc) {
        this.harc = harc;
    }

    void harcHesapla(int dersSayisi) {
        int ucret = 480;
        this.harc = (dersSayisi * ucret);
    }


    void harcHesapla(int dersSayisi, double kalinanDonem){
        int ucret = 480;
        this.harc=(dersSayisi*ucret+kalinanDonem*ucret);
    }
}