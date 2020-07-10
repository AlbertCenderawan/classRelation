class KotakPensil
{
    public String namaPensil, jenisPensil;
    public String namaPenghapus, jenisPenghapus;
    public String namaPenggaris, jenisPenggaris;

    public void pencil()
    {
        System.out.println("Nama Pensil  = " + namaPensil);
        System.out.println("Jenis Pensil = " + jenisPensil);
    }

    public void eraser()
    {
        System.out.println("Nama Penghapus  = " + namaPenghapus);
        System.out.println("Jenis Penghapus = " + jenisPenghapus);
    }

    public void ruler()
    {
        System.out.println("Nama Penggaris  = " + namaPenggaris);
        System.out.println("Jenis Penggaris = " + jenisPenggaris);
    }
}

class TasSekolah
{
    private KotakPensil pencilCase;
    public static int ukuranLebarTas, ukuranPanjangTas, ukuranTinggiTas;
    public static double massaTas;

    public static void spesifikasiTas()
    {
        System.out.println("Spesifikasi Tas");
        System.out.println("Panjang = " + ukuranPanjangTas + " cm");
        System.out.println("Lebar   = " + ukuranLebarTas + " cm");
        System.out.println("Tinggi  = " + ukuranTinggiTas + " cm");
        System.out.println("Massa   = " + massaTas + " cm");
    }

    public void setKotakPensil(KotakPensil kotakPensil)
    {
        pencilCase = kotakPensil;
    }

    public void lihatIsiKotakPensil()
    {
        pencilCase.pencil();
        pencilCase.eraser();
        pencilCase.ruler();
    }
}