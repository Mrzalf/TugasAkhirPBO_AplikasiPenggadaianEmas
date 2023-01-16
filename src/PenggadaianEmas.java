public class PenggadaianEmas {
    private Emas emas;
    private int jumlahEmas;
    private PenggadaianEmas penggadaian;


    public PenggadaianEmas(Emas emas, int jumlahEmas) {
        this.emas = emas;
        this.jumlahEmas = jumlahEmas;
    }

    public Emas getEmas() {
        return emas;
    }

    public int getJumlahEmas() {
        return jumlahEmas;
    }

    public double hitungTotalHarga() {
        return emas.getHarga() * jumlahEmas;
    }

    public PenggadaianEmas getPenggadaian() {
        return this.penggadaian;
    }

    public void setPenggadaian(PenggadaianEmas penggadaian) {
        this.penggadaian = penggadaian;
    }
}

