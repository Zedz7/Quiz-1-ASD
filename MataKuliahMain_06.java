public class MataKuliahMain_06 {
    public static void main(String[] args) {
        MataKuliah_06 mk1 = new MataKuliah_06("PM001", "Pemrograman", 3, 2);
        MataKuliah_06 mk2 = new MataKuliah_06("PM002", "Basis Data", 4, 3);

        Dosen_06 dosen1 = new Dosen_06("21736127", "Dr. Rusdi", 2014, "S3", "Sistem Informasi");
        Dosen_06 dosen2 = new Dosen_06("27312724", "Dr. Azriel", 2012, "S3", "Informatika");
        Dosen_06 dosen3 = new Dosen_06("47162632", "Mahfud Kaisar", 2019, "S2", "SIB");
        Dosen_06 dosen4 = new Dosen_06("23713273", "Gus Joko", 2009, "S2", "SIB");
        Dosen_06 dosen5 = new Dosen_06("16318261", "Indah Permata", 2008, "S2", "SIB");

        mk1.tambahDosen(dosen1);
        mk1.tambahDosen(dosen2);
        mk1.tampilkanInfo();

        mk2.tambahDosen(dosen3);
        mk2.tambahDosen(dosen4);
        mk2.tambahDosen(dosen5);
        mk2.tampilkanInfo();
    }
}