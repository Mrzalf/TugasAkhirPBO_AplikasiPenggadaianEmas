public class Pegawai {
    private String nama;
    private String alamat;
    private String noTelepon;

    public Pegawai(String nama, String alamat, String noTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }
}