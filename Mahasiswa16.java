public class Mahasiswa16 {
    public Mahasiswa16(){

    }
    public Mahasiswa16 (String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        kelas = kls;
        this.ipk = ipk;
    }
        String nama;
        String nim;
        String kelas;
        double ipk;
          
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama );
        System.out.println("Nim: " + nim );
        System.out.println("Ipk: " + ipk );
        System.out.println("Kelas: " + kelas );
    }
    void ubahKelas (String kelasBaru){
        kelas = kelasBaru;
    }
    void uptadeIpk (double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0){
            ipk = ipkBaru;
            System.out.println("ipk di perbarui: " + ipk);
        } else {
            System.out.println("Ipk tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
    String nilaiKinerja(){
        if (ipk >= 3.5){
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0){
            return "Kinerja baik";
        } else if (ipk >= 2.0){
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}