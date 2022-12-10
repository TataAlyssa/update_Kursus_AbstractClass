import java.util.Scanner;
public class Costumer {
    private String namaCost;
    private int idCost;
    Scanner in = new Scanner(System.in);

    int pilih;
    Costumer(){
        System.out.println("Masukkan data anda sebagai Costumer :");
    }

    void input_cost(){
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.println("Masukkan Nama Anda : ");
        namaCost = input.next();
        System.out.println("Masukkan Id Anda   : ");
        idCost = input.nextInt();
        System.out.println("-----------------------------------------");
    }
    // Method untuk mencetak informasi costumer
    public void printInfo() {
        System.out.println("Nama Costumer : " + this.namaCost);
        System.out.println("ID Costumer   : " + this.idCost);
    }
    // Method untuk mendaftarkan costumer ke kursus
    public void daftarKursus() {
        System.out.println("Daftar Kursus ");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("Pilih : ");
        pilih = in.nextInt();
        if (pilih == 1){
            System.out.println("Anda memilih Kursus Java dengan Biaya 500000/30 hari");
            Java java = new Java();
            java.daftar(namaCost);
        }
        else {
            System.out.println("Anda memilih Kursus Python dengan Biaya 450000/30 hari");
            Python py = new Python();
            py.daftar(namaCost);
        }

    }
}
