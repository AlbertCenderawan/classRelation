class Bensin
{
    public static String jenisBensin;
    public static int hargaBensin;
    public static int hargaMinyak;

    public void infoBensin()
    {
        System.out.println("Bensin ini berasal dari Pertamina.");
        System.out.println("Jenis bensin = " + jenisBensin);
        System.out.println("Harga bensin = " + hargaBensin);
    }

    public void mulaiIsiBensin()
    {
        System.out.println("Pengisian Bensin dimulai.");
    }

    public void stopIsiBensin()
    {
        System.out.println("Isi bensin telah selesai.");
    }
}

class Mobil
{
    static String merekMobil;
    static String jenisMobil;
    static String spesifikasiMobil;

    public static void infoMobil()
    {
        System.out.println("Merek mobil = " + merekMobil);
        System.out.println("Jenis mobil = " + jenisMobil);
        System.out.println("Spesifikasi mobil = " + spesifikasiMobil);
    }

    public static void cekJenisBensin(Bensin oil)
    {
        oil.infoBensin();
    }

    public static void mengisiBensin(Bensin oil)
    {
        oil.mulaiIsiBensin();
        oil.stopIsiBensin();
    }
}