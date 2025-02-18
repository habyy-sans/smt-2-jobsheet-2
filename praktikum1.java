public class praktikum1 {
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    
    public praktikum1(){
        
    }
    public praktikum1(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    
    void tampilkanInformasi(){
        System.out.println("KodeMK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("Sks: " + sks);
        System.out.println("JumlahJam: " + jumlahJam);

    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS diubah: " + jumlahJam);
    }
    void tambahJam (int jam){
        jumlahJam += jam;
        System.out.println("jam ditambah: " + jumlahJam);
    }
    void kurangJam (int jam){
        if (jam > jumlahJam) {
            System.out.println("Pengurangan gagal! Jumlah jam tidak mencukupi.");
            jumlahJam -= jam;
        } else {
            this.jumlahJam -= jam;
            System.out.println(jam + " jam telah dikurangi. Jumlah Jam sekarang: " + jumlahJam);
        }
    }
}
