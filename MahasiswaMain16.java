public class MahasiswaMain16 {
    public static void main(String[] args) {
        Mahasiswa16 mhs1 = new Mahasiswa16();
        mhs1.nama = "Muhammad Hasbiy Ashshiddqi";
        mhs1.nim = "244107060135";
        mhs1.kelas = "1G-SIB";
        mhs1.ipk = 3.45;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("2G-SIB");
        mhs1.uptadeIpk(4.00);
        mhs1.tampilkanInformasi();

        Mahasiswa16 mhsHasbiy = new Mahasiswa16("Hasbiy","2641070601", 3.5, "1G-SIB");
        mhsHasbiy.uptadeIpk(3.50);
        mhsHasbiy.tampilkanInformasi();
    }
}
