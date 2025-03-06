public class MataKuliah_06 {
    String kodeMK;
    String namaMK;
    int sks;
    Dosen_06 [] dosenPengampu;
    int jumlahDosen;

    public MataKuliah_06(String kodeMK, String namaMK, int sks, int kapasitas) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks >= 2 ? sks : 2;
        this.dosenPengampu = new Dosen_06[kapasitas];
        this.jumlahDosen = 0;
    }
    public void tampilkanInfo() {
        System.out.println("====================================");
        System.out.println("Kode MK         : " + kodeMK);
        System.out.println("Nama MK         : " + namaMK);
        System.out.println("SKS             : " + sks);
        System.out.println("Dosen Pengampu:");
        for(int i = 0; i < jumlahDosen; i++) {
            System.out.println("- " + dosenPengampu[i].nama);
        }
    }
    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
        System.out.println("Nama mata kuliah berhasil diubah menjadi: " + namaMK);
    }
    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
            System.out.println("Jumlah SKS telah diubah menjadi     : " + this.sks);
        } else {
            System.out.println("Jumlah SKS kurang dari 1");
        }
    }
    public void tambahDosen(Dosen_06 dosen) {
        if (jumlahDosen < dosenPengampu.length) {
            dosenPengampu[jumlahDosen++] = dosen;
            System.out.println("Dosen " + dosen.nama + " telah ditambah sebagai pengampu");
        } else {
        }
    }
}