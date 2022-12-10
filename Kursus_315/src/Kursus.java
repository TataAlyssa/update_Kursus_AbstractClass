import java.util.Scanner;

public class Kursus {
    Costumer x = new Costumer();
    Java y = new Java();
    Python z = new Python();
    private int kode_kurus;
    private String namaAnda;
    private String tglDaft;
    private String tglMasuk;
    private int duration;
    private int pilihan;
    private int pembayaran;
    static int totalBayar(int a, int b){    // rumus menghitung total bayar
        int total = a-b;
        return total;
    }
    private String status;
    private int diskon = 0;

    public void register(int kode_kursus, String namaAnda,String tglDaft, String tglMasuk, int duration) {
        this.kode_kurus = kode_kurus;
        this.namaAnda = namaAnda;
        this.tglDaft = tglDaft;
        this.tglMasuk = tglMasuk;
        this.duration = duration;
    }
    void input_data(){
        Scanner input = new Scanner(System.in);
        Siswa tenda = new Siswa();
        System.out.println();
        System.out.print("Kode Kursus    : ");
        kode_kurus = input.nextInt();
        System.out.println("Nama Anda  : ");
        namaAnda = input.next();
        System.out.print("Tanggal Daftar : ");
        tglDaft = input.next();
        System.out.print("Tanggal Masuk  : ");
        tglMasuk = input.next();
        System.out.print("Durasi Kursus (Hari) : ");
        duration = input.nextInt();
    }

    public void confirm() {
        System.out.println("Pendaftaran kursus berhasil dikonfirmasi!!");
    }

    public void getDetails() {
        System.out.println("Kode Kursus    : " + this.kode_kurus);
        System.out.println("Nama Anda      : " + this.namaAnda);
        System.out.println("Tanggal Daftar : " + this.tglDaft);
        System.out.println("Tanggal Masuk  : " + this.tglMasuk);
        System.out.println("Durasi Hari    : " + this.duration+" hari");
    }
    void pilih_siswa() {
        Scanner input = new Scanner(System.in);
        Siswa siswa = new Siswa();
        System.out.print("id Siswa anda : ");
        pilihan = input.nextInt();
        // Meminta golongan siswa
        System.out.print("Apakah golongan Anda (sudah lulus atau belum lulus) (Y/N)? ");
        status = input.next();
        // Menghitung biaya berdasarkan golongan siswa
        if (status.equalsIgnoreCase("Y")) {
            siswa.golSiswa = "Siswa Sudah Lulus Diskon 10000";
            siswa.noSiswa = 01;
            diskon = 10000;
        } else if (status.equalsIgnoreCase("N")) {
            siswa.golSiswa = "Siswa Belum Lulus Diskon 60000";
            siswa.noSiswa = 02;
            diskon = 60000;
        } else{
            System.out.println("Maaf Pilihan Anda Tidak Tersedia!!!");
        }
        // Total atau Biaya yang diperoleh setelah mendaftar
        if (x.pilih == 1){
            pembayaran = totalBayar(y.harga(this.duration, y.biaya),diskon);
        }
        else {
            pembayaran = totalBayar(z.harga(this.duration,z.biaya),diskon);
        }
        //Transaksi
        System.out.println("+-----------------------------------+");
        System.out.println("\t Transaksi Pendaftaran Kursus");
        System.out.println("+-----------------------------------+");
        getDetails();
        System.out.println("No Siswa Anda    : " + siswa.noSiswa);
        System.out.println("Golongan Anda    : " + siswa.golSiswa);
        System.out.println("Total Pembayaran : " + pembayaran);
        System.out.println("+-----------------------------------+");
    }
}

