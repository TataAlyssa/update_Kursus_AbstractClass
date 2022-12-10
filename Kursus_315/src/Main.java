public class Main {
        Main(){
            System.out.println("\t\t ~~Selamat Datang~~");
        }
        static void iya(String helium){
            System.out.println(helium);
        }
        static void name(){
            System.out.println("||  \tAPLIKASI PENDAFTARAN KURSUS\t\t||");
        }
        static void line(){
            System.out.println("==========================================");
        }

        public static void main(String[] args){
            Main tata= new Main();
            iya("\t\tdiprogram tata alyssa");
            iya("\t\t\t 2100018315");
            Petugas petugas = new Petugas();
            petugas.setIdPetugas(60312228);
            petugas.setNamaPetugas("Hamada Asahi");
            //Pemanggilan Prosedur
            line();
            name();
            line();
            //pemanggilan data costumer
            Costumer costumer = new Costumer();
            costumer.input_cost();
            costumer.printInfo();
            costumer.daftarKursus();
            System.out.println();
            Siswa siswa = new Siswa();;
            Kursus kursus = new Kursus();
            kursus.input_data();
            kursus.confirm();
            kursus.getDetails();
            kursus.pilih_siswa();
        }

}