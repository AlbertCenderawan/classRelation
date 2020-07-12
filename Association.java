class KetuaRT
{
    public static String nomorKodeRT;
    public static String namaKetua;
    public static char jenisKelamin;
    public static String alamatKetua;
    public static int jumlahKepalaKeluarga;
    public static int jumlahPenduduk;

    public void infoLengkapRT()
    {
        System.out.println("Ketua RT 007 \n");
        System.out.println("Nama Lengkap  = " + namaKetua);
        System.out.println("Jenis Kelamin = " + jenisKelamin);
        System.out.println("Alamat rumah  = " + alamatKetua);
    }
    
    public void infoPenduduk()
    {
        System.out.println("Data Penduduk RT " + nomorKodeRT);
        System.out.println("Jumlah Kepala Keluarga  = " + jumlahKepalaKeluarga);
        System.out.println("Jumlah Penduduk         = " + jumlahPenduduk);
    }

    public void infoWarga(wargaRT warga)
    {
        System.out.println("Data Kependudukan");
        System.out.println("Nama Lengkap  = " + warga.namaLengkap);
        System.out.println("Jenis Kelamin = " + warga.jenisKelamin);
        System.out.println("Alamat Rumah  = " + warga.alamatRumah);
        System.out.println("Status        = " + warga.status);
    }
}

class wargaRT
{
    public String namaLengkap;
    public char jenisKelamin;
    public String alamatRumah;
    public String nomorKodeRT;
    public String status;

    public void infoWarga()
    {
        System.out.println("Data Kependudukan");
        System.out.println("Nama Lengkap  = " + this.namaLengkap);
        System.out.println("Jenis Kelamin = " + this.jenisKelamin);
        System.out.println("Alamat Rumah  = " + this.alamatRumah);
    }

    public void infoRT()
    {
        System.out.println("RT " + this.nomorKodeRT);
        System.out.println("Nama Ketua RT = " + KetuaRT.namaKetua);
    }
}