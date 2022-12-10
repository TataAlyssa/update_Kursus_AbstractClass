public class Python extends JenisKursus{
    int biaya = 15000;
    public void daftar(String a){
        System.out.println("Customer atas nama "+a+"Berhasil mendaftar pada kursus Java");
    }
    public int harga(int biaya, int hari){
        return biaya*hari;
    }
}
