public class Dosen {
    String idDosen;
    String nama;
    String bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;
    
    public Dosen(){
        
    }
    public Dosen(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahilan){
        this.idDosen = idDosen;
        this.nama = nama;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahilan;
        this.statusAktif = statusAktif;
    }
    
    void tampilkanInformasi(){
        System.out.println("idDosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    void setStatusAktif(boolean Status){
        statusAktif = Status;
        System.out.println("Status Dosen: " + nama + "diubah menjadi " + (Status ? "Aktif" : "tidak aktif"));
    }
    public int hitungMasaKerja (int thnSkrng){
        return tahunBergabung -= thnSkrng;
    }
    void ubahKeahlian (String bidang){
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian dosen " + nama + " diubah menjadi " + bidang);
    }
}

