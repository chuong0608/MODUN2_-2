package quanlyphuongtien;

public class XeMay extends PhuongTien implements Comparable<XeMay>{
    private double dungTich;

    public XeMay(String hang, String mau, String ten, Double gia, double dungTich) {
        super(hang, mau, ten, gia);
        this.dungTich = dungTich;
    }

    public XeMay() {
    }

    public XeMay(double dungTich) {
        this.dungTich = dungTich;
    }

    public double getDungTich() {
        return dungTich;
    }

    public void setDungTich(double dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        return "XeMay{" + " hãng : " +
                 getHang()+
                ", Màu : " + getMau()+ ", Tên : " +getTen()+ ", Giá : " +getGia()+
                ", dungTich = " + dungTich +
                '}';
    }

    public static void main(String[] args) {
      XeMay xeMay=new XeMay("Honda","trang","Wa1",18d,110);
        System.out.println(xeMay);
    }

    @Override
    public int compareTo(XeMay o) {
        return (int) (this.getGia() - o.getGia());
    }
}
