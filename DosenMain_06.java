public class DosenMain_06 {
    public static void main(String[] args) {
        Dosen_06 d1 = new Dosen_06("356125", "Amba Fuada", 2006, "S2", "Sistem Informasi");
        d1.tampilkanInfo();

        d1.ubahProdi("Matematika");
        d1.ubahPendidikan("S3");
        d1.tampilkanInfo();

        Dosen_06 d2 = new Dosen_06("21456", "Andriana Azrilia", 2014, "S2", "Sistem Informasi");
        d2.tampilkanInfo();

        d2.ubahProdi("Pancasila");
        d2.ubahPendidikan("S3");
        d2.tampilkanInfo();
    }
}