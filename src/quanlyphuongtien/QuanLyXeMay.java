package quanlyphuongtien;

import java.util.Arrays;

public class QuanLyXeMay extends XeMay implements QuanLy<XeMay>{
    private final XeMay [] danhSach = new XeMay[4];
    private int size=0;
    @Override
    public void Them(XeMay xeMay) {
        danhSach[size]=xeMay;
        size++;
    }

    @Override
    public void Sua(String name, XeMay xeMay) {
        danhSach[TimKiem(name)] = xeMay;

    }

    @Override
    public void Xoa(String name) {
        if(danhSach[TimKiem(name)] != null) {
            size--;
        }
    }

    @Override
    public void InAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("\n" +"--------------------");
    }

    @Override
    public int TimKiem(String name) {
        for (int i = 0; i < size; i++) {
            if(name.equals(  danhSach[i].getTen())){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void SapXep() {
        Arrays.sort(danhSach);
    }

    public static void main(String[] args) {
        QuanLyXeMay ql=new QuanLyXeMay();
        XeMay xm1=new XeMay("Honda","trắng","Wa1",18d,110);
        XeMay xm2=new XeMay("Honda","Đen đỏ","Winner X",40d,150);
        XeMay xm3=new XeMay("Honda","Nâu sữa","Lead",45d,125);
        XeMay xm4=new XeMay("Honda","trang","Vison",30d,125);
        ql.Them(xm1);
        ql.Them(xm2);
        ql.Them(xm3);
        ql.Them(xm4);
        ql.InAll();
        XeMay xm5=new XeMay("Honda","trắng","Wave a",18d,110);
        ql.Sua("Wa1",xm5);
        ql.InAll();
        System.out.println(ql.TimKiem(xm3.getTen()));
        ql.SapXep();
        ql.InAll();
        ql.Xoa("Vison");
        ql.InAll();
    }

}
