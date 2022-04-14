package quanlyphuongtien;

public class Oto extends PhuongTien implements Comparable<Oto>{
    int soCho;

    public Oto(String hang, String mau, String ten, Double gia, int soCho) {
        super(hang, mau, ten, gia);
        this.soCho = soCho;
    }

    public Oto() {
    }

    public Oto(int soCho) {
        this.soCho = soCho;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    @Override
    public String toString() {
        return "XeMay{" + " hãng : " +
                getHang()+
                ", Màu : " + getMau()+ ", Tên : " +getTen()+ ", Giá : " +getGia()+
                ", dungTich = " + getSoCho() +
                '}';
    }

    @Override
    public int compareTo(Oto o) {
        return (int) (this.getGia() - o.getGia());
    }
}
