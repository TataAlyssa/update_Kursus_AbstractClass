public class Siswa {
    protected String golSiswa;
    protected int noSiswa;
    protected int duration;

    void data_Siswa(){
        SiswaLulus lulus = new SiswaLulus();
        SiswaBelumLulus belum = new SiswaBelumLulus();
        lulus.dataView();
        lulus.fasilitas();
        belum.dataView();
        lulus.fasilitas();
    }
    public void fasilitas(){

    }

}
