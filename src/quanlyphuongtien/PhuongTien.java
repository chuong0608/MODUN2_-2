package quanlyphuongtien;

public abstract class PhuongTien {
    private String hang;
    private String mau;
    private String ten;
    private double gia;

    public PhuongTien(String hang, String mau, String ten, Double gia) {
        this.hang = hang;
        this.mau = mau;
        this.ten = ten;
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public PhuongTien() {

    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "hang='" + hang + '\'' +
                ", mau='" + mau + '\'' +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                '}';
    }

}
