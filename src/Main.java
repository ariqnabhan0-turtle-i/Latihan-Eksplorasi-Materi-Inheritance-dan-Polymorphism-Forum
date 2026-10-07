public class Main {
    public static void main(String[] args) {
        Bentuk bentuk = new Bentuk("Merah");
        Lingkaran lingkaran = new Lingkaran(7, "Biru");
        BujurSangkar bujurSangkar = new BujurSangkar(5, "Hijau");
        Silinder silinder = new Silinder(10, 7, "Kuning");

        bentuk.printInfo();
        lingkaran.printInfo();
        bujurSangkar.printInfo();
        silinder.printInfo();
    }
}