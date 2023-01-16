public class Penggadai {
    public int id_penggadai;
    public String nama;
    public Pegawai pgw;

    public void tambahData(int id, String name, Pegawai pgw){
        this.id_penggadai = id;
        this.nama = name;
        this.pgw = pgw;
    }

    public int updateData(int no, int id, String name, Pegawai pgw){
        this.id_penggadai = id;
        this.nama = name;
        this.pgw = pgw;
        return no+1;
    }

    public int getId_penggadai() {
        return id_penggadai;
    }

    public String getNama() {
        return nama;
    }

    public Pegawai getPegawai() {
        return pgw;
    }

}