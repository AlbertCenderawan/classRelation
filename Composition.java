class Keyboard
{
    public static String merekKeyboard;
    public static String jenisKeyboard;

    public void operasiKetik()
    {
        System.out.println("Komputer sedang mengetik.");
    }

    public void operasiWindows()
    {
        System.out.println("Tombol Windows ditekan.");
    }
}

class Computer
{
    public static String merekComputer;
    public static String jenisComputer;
    private Keyboard longKeyboard;

    public static void infoKomputer()
    {
        System.out.println("Merek Komputer = " + merekComputer);
        System.out.println("Jenis Komputer = " + jenisComputer);
    }

    public void setKeyboard(Keyboard longKeyboard)
    {
        this.longKeyboard = new Keyboard();
    }

    public void tesKetikan()
    {
        this.longKeyboard.operasiKetik();
        this.longKeyboard.operasiWindows();
    }
}