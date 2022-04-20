package qlsinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSInhVien {
    private  ArrayList<SinhVien> danhSach;

    public DanhSachSInhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSInhVien() {
        this.danhSach=new ArrayList<>();
    }
    public void themSinhVien(SinhVien sinhVien){
        this.danhSach.add(sinhVien);
    }
    public void inDanhSachSinhVien(){
        for (int i=0;i<danhSach.size();i++){
            System.out.println(danhSach.get(i));
        }
    }
    public boolean kiemTraDanhSachRong(){
        return this.danhSach.isEmpty();
    }
    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }
    public void lamRongDanhSach(){
         this.danhSach.removeAll(danhSach);
    }
    public boolean kiemTraTonTai(SinhVien sinhVien){
        return this.danhSach.contains(sinhVien);
    }
    public void xoaSinhVien(String ten){
        int viTriSinhVien=timKiemSinhVien(ten);
        if(viTriSinhVien==-1){
            System.out.println("không có mà xóa");
        }else {
            danhSach.remove(viTriSinhVien);
        }

    }
    public int timKiemSinhVien(String ten){
        for (int i=0;i<danhSach.size();i++){
            if(danhSach.get(i).getHoTen().equals(ten)){
                return i;
            }
        }
        return -1;
    }
    public void xapXepSVGianDanDiem(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()){
                    return -1;
                }else if(sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()){
                    return 1;
                }else {
                    return 0;
                }
            }
        });

    }

}
