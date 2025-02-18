public class DosenMain16 {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Angkasa";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Kecerdasan Buatan";

        dosen1.tampilkanInformasi();
        dosen1.ubahKeahlian("Machine Learning");
        dosen1.setStatusAktif(false);
       System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");

        
        Dosen dosen2 = new Dosen("HBY0", "Prof. Hasbiy", true, 2005, "Sistem Informasi");
        dosen2.tampilkanInformasi();
        dosen2.ubahKeahlian("Data Science");
        dosen2.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2025) + " tahun");
    }
}
