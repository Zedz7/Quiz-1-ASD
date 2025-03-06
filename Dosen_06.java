public class Dosen_06 {
    String nidn;
    String nama;
    int tahunMasuk;
    String jenjangPendidikan;
    String prodi;

    public Dosen_06(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }
    public void tampilkanInfo() {
        System.out.println("======================================================");
        System.out.println("Masukkan NIDN               : " + nidn);
        System.out.println("Masukkan Nama               : " + nama);
        System.out.println("Masukkan Tahun Masuk        : " + tahunMasuk);
        System.out.println("Masukkan Jenjang Pendidikan : " + jenjangPendidikan);
        System.out.println("Masukkan Prodi              : " + prodi);
    }
    public void ubahProdi(String prodiBaru) {
        this.prodi = prodiBaru;
        System.out.println("Program studi berhasil diganti menjadi          : " + prodiBaru);
    }
    public void ubahPendidikan(String jenjangPendidikanBaru) {
        this.jenjangPendidikan = jenjangPendidikanBaru;
        System.out.println("Jenjang pendidikan anda berhasil diubah menjadi : " + jenjangPendidikanBaru);
    }
}